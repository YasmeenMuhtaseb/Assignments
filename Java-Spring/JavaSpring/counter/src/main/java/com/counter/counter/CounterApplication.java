package com.counter.counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class CounterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CounterApplication.class, args);
    }
    @RequestMapping("/your_server")
    public String index(HttpSession session){
        Integer count;
        if(session.isNew()){
            session.setAttribute("count",0);
        }
        else{
            count= (Integer) session.getAttribute("count");
            count++;
            session.setAttribute("count",count);
        }
        return "index.jsp";
    }
    @RequestMapping("/your_server/counter")
    public String counter(){
        return "counter.jsp";
    }
    @RequestMapping("/your_server/counterByTwo")
    public String counterByTwo(HttpSession session){
        Integer count;
        if(session.isNew()){
            session.setAttribute("count",0);
        }
        else {
            count = (Integer) session.getAttribute("count");
            count+=2;
            session.setAttribute("count", count);
        }
            return "counterByTwo.jsp";
    }
    @RequestMapping("/your_server/destroy")
    public String destroy(HttpSession session){
        session.invalidate();
        return "redirect:/your_server";
    }
}
