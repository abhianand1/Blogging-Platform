package com.blogger.group.blogger_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.blogger.group.blogger_app.service.Adservice;

@RestController
public class ADController {

    @Autowired
    Adservice adService;

    @PostMapping(value = "/post-request")
    public ResponseEntity<?> pushRequest(@RequestParam String request){
        return ResponseEntity.ok(adService.handleRequest(request));
    }
}
