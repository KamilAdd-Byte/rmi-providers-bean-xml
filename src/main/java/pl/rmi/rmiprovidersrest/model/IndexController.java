package pl.rmi.rmiprovidersrest.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    public IndexController() {
    }

    @GetMapping(value = "/index")
    public String getHomePage(Model model){
        model.addAttribute("message","Controller");
        return "index";
    }
}
