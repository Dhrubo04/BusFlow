package com.example.routepredictor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.routepredictor.model.Driver;
import com.example.routepredictor.service.DriverService;

@Controller
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping("/auth")
    public String showAuthPage() {
        return "login";  // the new slider-style login/register HTML page
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String busNumber,
                              @RequestParam String password,
                              Model model) {
        Driver driver = driverService.authenticate(busNumber, password);
        if (driver != null) {
            model.addAttribute("driver", driver);
            return "redirect:/map"; // your main dashboard
        } else {
            model.addAttribute("loginError", "Invalid credentials");
            return "login";
        }
    }

    @PostMapping("/register")
    public String registerSubmit(@ModelAttribute Driver driver, Model model) {
        driverService.registerDriver(driver);
        model.addAttribute("registerSuccess", "Account created. Please log in.");
        return "login";
    }
}
