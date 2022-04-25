package com.example.demo.controller;

import com.example.demo.entities.Livre;
import com.example.demo.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivreController {

    @Autowired
    private LivreService service;

    @PostMapping("emsi_api/addLivre")
    public Livre addLivre(@RequestBody Livre livre){
        return service.saveLivre(livre);
    }

    @GetMapping("emsi_api/livres")
    public List<Livre> getLivres(){
        return service.getLivres();
    }

    @GetMapping("emsi_api/livres/{id}")
    public Livre getLivresbyID(@PathVariable int id){
        return service.getLivresbyID(id);
    }

    @DeleteMapping("emsi_api/deletelivres/{id}")
    public String deleteLivre(@PathVariable int id){
        return service.deleteLivre(id);
    }

    @PutMapping("emsi_api/updateLivre")
    public Livre updateLivre(@RequestBody Livre livre){
        return service.updateLivre(livre);
    }

}
