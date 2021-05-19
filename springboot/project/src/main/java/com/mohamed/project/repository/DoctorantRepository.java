package com.mohamed.project.repository;

import com.mohamed.project.model.Doctorant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorantRepository extends JpaRepository<Doctorant,Integer> {
}
