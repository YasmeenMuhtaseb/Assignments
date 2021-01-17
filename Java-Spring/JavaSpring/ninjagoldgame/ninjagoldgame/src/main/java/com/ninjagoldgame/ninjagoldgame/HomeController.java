package com.ninjagoldgame.ninjagoldgame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Random;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(HttpSession session){
        if(session.isNew()){
            session.setAttribute("gold",0);
            session.setAttribute("activities"," ");
        }
        return "index.jsp";
    }
    @RequestMapping("/process_money")
    public String process(@RequestParam (value ="which_form") String which_form, HttpSession session){
        session.setAttribute("which_form",which_form);
        if (which_form.equals("newGame")){
            session.invalidate();
            return "redirect:/";
        }
        return "redirect:/place";
    }
    @RequestMapping("/place")
    public String place(HttpSession session){
        String which_form =(String) session.getAttribute("which_form");
        Date date = new Date();
        int gold = (int) session.getAttribute("gold");
        Random random = new Random();
        String activities = (String) session.getAttribute("activities");

        switch (which_form){
            case "farm":
                int earned = random.nextInt(11)+10;
                int sumGold = earned+gold;
                session.setAttribute("gold",sumGold);
                String activity = activities +"You entered a farm and earned "+earned+" gold. ("+date+")</br>";
                session.setAttribute("activities",activity);
                break;

            case "gave":
                earned = random.nextInt(6)+5;
                sumGold = earned+gold;
                session.setAttribute("gold",sumGold);
                activity = activities +"You entered a gave and earned "+earned+" gold. ("+date+")</br>";
                session.setAttribute("activities",activity);
                break;

            case "house":
                earned = random.nextInt(4)+2;
                sumGold = earned+gold;
                session.setAttribute("gold",sumGold);
                activity = activities +"You entered a house and earned "+earned+" gold. ("+date+")</br>";
                session.setAttribute("activities",activity);
                break;

            case "casino":
                earned = random.nextInt(50)*(random.nextBoolean()?-1:1);
                if (earned>0){
                    sumGold = earned+gold;
                    activity = activities +"You entered a casino and earned "+earned+" gold. ("+date+")</br>";
                }
                else{
                    sumGold = gold+earned;
                    activity = activities +"<span>You entered a casino and lost "+earned *-1 +" gold. ("+date+")</br></span>";
                }
                session.setAttribute("gold",sumGold);
                session.setAttribute("activities",activity);
                break;

            case "spa":
                earned = random.nextInt(16)+5;
                sumGold = gold-earned;
                session.setAttribute("gold",sumGold);
                activity = activities +"<span>You entered a spa and lost "+earned+" gold. ("+date+")</br></span>";
                session.setAttribute("activities",activity);
                break;
        }
        if((int)session.getAttribute("gold")<0)
            return "prison.jsp";
        return "redirect:/";
    }
}
