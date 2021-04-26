package com.mohamed.project.repository;

import com.mohamed.project.model.Publicaton;
//import com.abdellatif.project.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationRepository extends JpaRepository<Publicaton,Integer> {
}
