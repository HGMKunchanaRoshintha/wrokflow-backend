package com.practical.backend.controller;

import com.practical.backend.entity.Details;
import com.practical.backend.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/api")
public class DetailController {
    @Autowired
    private DetailService detailService;

    // Add New Detail
    @PostMapping("/details")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity addDetails(@RequestBody Details details) {
        int detailId = detailService.addDetails(details);
        if (detailId > 0){
            return new ResponseEntity(detailId, HttpStatus.OK);
        } else {
            return new ResponseEntity(0, HttpStatus.OK);
        }
    }

    // Get all details
    @GetMapping("/details")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getAllDetails(){
        return new ResponseEntity(detailService.getAllDetails(), HttpStatus.OK);
    }
}
