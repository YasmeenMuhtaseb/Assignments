package com.dojosurvey.dojosurvey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class HomeControllers {
    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }
    @RequestMapping(value="/getInformation",method = RequestMethod.POST)
    public String getInformation(@RequestParam(value = "your_name") String your_name,@RequestParam(value = "location") String location, @RequestParam(value = "favorite_language") String favorite_language ,@RequestParam(value = "text_area") String text_area,HttpSession session){
        session.setAttribute("your_name",your_name);
        session.setAttribute("location",location);
        session.setAttribute("favorite_language",favorite_language);
        session.setAttribute("text_area",text_area);
        if (favorite_language.equals("Java")){
            return "redirect:/javaFav";
        }
        return "redirect:/result";
    }
    @RequestMapping("/result")
    public String result(){
        return "output.jsp";
    }
    @RequestMapping("/javaFav")
    public String javaFav(){
        return "java.jsp";
    }
    @RequestMapping("/back")
    public String back(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
