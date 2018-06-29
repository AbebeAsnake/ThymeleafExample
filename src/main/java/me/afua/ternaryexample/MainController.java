package me.afua.ternaryexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @GetMapping("/addvalue")
    public String showIndex(HttpServletRequest request, Model model)
    {
        int value=0;
        if(request.getParameter("value")!=null)
        {
           value = new Integer(request.getParameter("value"));
            model.addAttribute("value",value);
        }

        if(request.getParameter("text")!=null)
        {

            model.addAttribute("text", request.getParameter("text"));
        }

        return "index";
    }
}
