package br.com.practice.practiceProjetct.controller;

import br.com.practice.practiceProjetct.entities.Cat;
import br.com.practice.practiceProjetct.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cat")
public class CatController {
    @Autowired
    private CatService service;
    @GetMapping("/findCat")
    public List<Cat> findCat(){
        return service.findCat();
    }

    @PostMapping("/insertCat")
    public List<Cat> insertCat(){
        return service.insertCat();
    }

}
