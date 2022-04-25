package com.example.demo.service;

import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepo;
import org.hibernate.annotations.OrderBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {
    @Autowired
    private LivreRepo repo;

    public Livre saveLivre(Livre livre){
        return repo.save(livre);
    }

    @OrderBy(clause = "Titre ASC")
    public List<Livre> getLivres(){
        return repo.findAll();
    }

    public Livre getLivresbyID(int ID){
        return repo.findById(ID).orElse(null);
    }

    public String deleteLivre(int ID){
        repo.deleteById(ID);
        return "Livre supprimer";
    }

    public Livre updateLivre(Livre livre){
        Livre livres=repo.findById(livre.getId()).orElse(null);
        livres.setTitre(livre.getTitre());
        livres.setMaisonedition(livre.getMaisonedition());
        livres.setDatesortie(livre.getDatesortie());
        livres.setNbrp(livre.getNbrp());
        livres.setIsbn(livre.getIsbn());
        livres.setDateconsu(livre.getDateconsu());
        livres.setDispo(livre.getDispo());
        return repo.save(livres);
    }
}
