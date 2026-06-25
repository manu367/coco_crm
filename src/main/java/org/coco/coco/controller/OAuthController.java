package org.coco.coco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OAuthController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/forget-password")
    public String forgetPassword(){
        return "forgetPassword";
    }

    @GetMapping("/reset-password")
    public String ResetPassword(){
        return "reset-password";
    }

    @GetMapping("/verify")
    public String verify(){
        return "verify";
    }
    @GetMapping("/verify-email")
    public String verifyemail(){
        return "verify-email";
    }

}
