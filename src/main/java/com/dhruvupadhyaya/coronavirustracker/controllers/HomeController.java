package com.dhruvupadhyaya.coronavirustracker.controllers;

import com.dhruvupadhyaya.coronavirustracker.models.LocationStats;
import com.dhruvupadhyaya.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService locationStats;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStats",locationStats.getAllStats());
        int sum = 0;
        for (LocationStats locationStat : locationStats.getAllStats()){
            sum +=locationStat.getLatestTotalCases();
        }
        //Another method
//        List<LocationStats> allStats = locationStats.getAllStats();
//        int sum = allStats.stream().mapToInt(stat-> stat.getLatestTotalCases()).sum();
        model.addAttribute("totalCases",sum);
        return "home";
    }

    @GetMapping("/about-virus")
    public String aboutVirus(){
        return "about-virus";
    }

    @GetMapping("/safety")
    public String safety(){
        return "safety";
    }
}
