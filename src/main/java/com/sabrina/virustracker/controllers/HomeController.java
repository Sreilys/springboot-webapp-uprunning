package com.sabrina.virustracker.controllers;

import com.sabrina.virustracker.models.LocationStats;
import com.sabrina.virustracker.services.VirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    VirusDataService virusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = virusDataService.getAllStats();
        int totalCases = allStats.stream().mapToInt(stat -> stat.getConfirmedCases()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalCases", totalCases);
        return "home";
    }
}
