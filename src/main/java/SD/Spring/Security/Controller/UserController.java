package SD.Spring.Security.Controller;

import SD.Spring.Security.Entity.User;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import org.apache.coyote.Request;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @PostConstruct
    public void initShowForm(){


    }

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
    public String processUser(@Valid @ModelAttribute("theUser") User theUser, BindingResult bindingResult, Model theModel){

        theModel.addAttribute("countries", countries);
        theModel.addAttribute("languages", languages);
        theModel.addAttribute("systems", systems);
        if(bindingResult.hasErrors()){
            return "user-form";
        }
        else {
            return "user-profile";
        }
    }


}
