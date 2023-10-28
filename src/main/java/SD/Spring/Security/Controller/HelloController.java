package SD.Spring.Security.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;
import java.util.Date;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model theModel){
        theModel.addAttribute("theTime", new Date());
        return "helloworld";
    }
    @GetMapping("/processForm")
    public String shoutYourName(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String result = "YO!!!!  " + name;
        model.addAttribute("message", result);
        return "shoutName";
    }

    @RequestMapping(path="/processFormVTwo",method = RequestMethod.POST)
    public String shoutYourNameVTwo(@RequestParam("studentName") String theName, Model model){
        String name = theName.toUpperCase();
        String result = "Hello my Friend from Version 2  " + name;
        model.addAttribute("message", result);
        return "shoutName";
    }
}
