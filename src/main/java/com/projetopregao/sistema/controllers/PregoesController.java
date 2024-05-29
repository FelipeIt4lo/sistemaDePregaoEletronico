package com.projetopregao.sistema.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pregao")
public class PregoesController {
    @GetMapping
    public ResponseEntity gelAllPregoes(){
        return ResponseEntity.ok("deu ok");
    }
}
