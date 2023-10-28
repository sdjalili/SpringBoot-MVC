package SD.Spring.Security.Controller;

import SD.Spring.Security.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/showStudentForm")
    public String showStudentForm(Model theModel){
        //crete new student object
        Student theStudent = new Student();

        // add the student model to the model
        theModel.addAttribute("student", theStudent);
        return "student-form";
    }


    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent){

        System.out.printf("theStudent :" + theStudent.getFirstName() + " " + theStudent.getLastName()) ;
        return "student-confirmation";

    }
}
