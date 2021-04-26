package com.mohamed.project.repository;

import com.mohamed.project.model.Auteurs;
//import com.abdellatif.project.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteursRepository extends JpaRepository<Auteurs,Integer> {
}
