package com.fullstackJava.MyfirstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    //http://localhost:8080/login?name=Saswat
    // GET,POST
    @RequestMapping(value ="login",method = RequestMethod.GET)
    public String goToLoginPage() {
        return "login";

    }

    @RequestMapping(value ="login",method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if (authenticationService.authenticate(name, password)) {

            model.put("name", name);
            model.put("password", password);
            //Authentication
            //name - myName
            //passowrd - dummy
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials! Please try agian.");
        return "login";
    }
}
