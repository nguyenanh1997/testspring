package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// import class controller



// luu dương dan chi toi controller


@Controller
public class helloController {

    // truyen dương dan toi trang xin chao

    @RequestMapping(value="/xinchao", method=RequestMethod.GET)

    public String xinchao ()

            {

               return "xinchao";

            }
    
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    
    @RequestMapping(value ="/hehe")
    
        public String hehe(){
            return "hehe";
        }
        
        
     @RequestMapping(value = "/search")
    public String handleRequest(ModelMap model){
        List<user> inf = new ArrayList<>();
        inf.add(new user(1, "nguyenanh"));
        inf.add(new user(21, "Xin chao"));
        inf.add(new user(13, "to la"));
        inf.add(new user(14, "Huyen ANh"));
        model.put("inf", inf);
        return "info";
    }
    
}