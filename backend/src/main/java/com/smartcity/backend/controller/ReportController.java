package com.smartcity.backend.controller;

import com.smartcity.backend.enums.ReportCategory;
import com.smartcity.backend.enums.VoteType;
import org.springframework.web.bind.annotation.*;
        import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/report")
public class ReportController {

    @PostMapping("/vote")
    public void voteReport(@RequestParam("reportId") String  reportId , @RequestParam("voteType") VoteType voteType) {

    }

    @PostMapping("/create")
    public void createReport(@RequestParam("image") MultipartFile image, @RequestParam("category") ReportCategory category, @RequestParam("description") String description, @RequestParam("lat") double lat, @RequestParam("lon") double lon) {

    }

    @GetMapping("/all")
    public void getAllReport() {

    }
}