package SD.Spring.Security.Controller;

import SD.Spring.Security.Entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    //inject the list of countries from application properties
    @Value("${countries}")
    private List<String> countries;
    @Value("${languages}")
    private List<String> languages;
    @Value("${systems}")
    private List<String> systems;
    @GetMapping("/shuf")
    public String showUserForm(Model theModel){
        User theUser = new User();
        theUser.setFirstName("sadegh");
        theUser.setLastName("jalili");
        theModel.addAttribute("theUser", theUser);
        theModel.addAttribute("countries", countries);
        theModel.addAttribute("languages", languages);
        theModel.addAttribute("systems", systems);
        return "user-form";
    }

    //user-profile.html

    @PostMapping("/processUser")
    public String processUser(@ModelAttribute("theUser") User theUser, Model theModel){
        System.out.printf(theUser.getFirstName() + " " + theUser.getLastName());
        return "user-profile";
    }
}
