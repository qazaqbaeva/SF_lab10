package kz.narxoz.springapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue=" World ") String name,  Model model1,
                           @RequestParam(name="surname", required=false, defaultValue=" World ") String surname, Model model2){
        model1.addAttribute("name", name);
        model2.addAttribute("surname", surname);

        return "greeting";
    }
}
