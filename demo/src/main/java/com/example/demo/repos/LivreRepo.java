package com.example.demo.repos;

import com.example.demo.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepo extends JpaRepository<Livre,Integer> {
}
