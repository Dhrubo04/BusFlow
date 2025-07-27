package com.example.routepredictor.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PredictionController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";  // maps to templates/index.html
    }

    @PostMapping("/api/get_predicted_duration")
    @ResponseBody
    public ResponseEntity<?> getPredictedDuration(@RequestBody Map<String, Object> payload) {
        try {
            double durationInTraffic = Double.parseDouble(payload.get("duration_in_traffic").toString());

            // dummy prediction logic
            double predictedDuration = durationInTraffic * 1.2;

            return ResponseEntity.ok(Map.of("predicted_duration", predictedDuration));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
}
