package ginfo.emi.ac.ma.controlleurs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControlleur {

    @GetMapping("/")
    public String index() {
        return "redirect:/url1/";
    }

    @GetMapping("/login")
    public String autentification() {
        return "login";
    }

    @GetMapping("/403")
    public String nonAuthorizer() {
        return "403";
    }

}
