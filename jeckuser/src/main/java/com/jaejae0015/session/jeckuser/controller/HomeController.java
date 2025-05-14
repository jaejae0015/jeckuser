package com.jaejae0015.session.jeckuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@GetMapping("/home")
    public String home(HttpSession session, Model model) {
        String user = (String) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }
        model.addAttribute("username", user);
        return "home";
    }
}
