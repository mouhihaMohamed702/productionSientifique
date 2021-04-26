package com.mohamed.project.resource;

import com.mohamed.project.repository.Structure_de_rechercheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping(value = "/api/structure")
@CrossOrigin(origins = "http://localhost:3000")
public class structure_de_rechercheResource {
    @Autowired
    Structure_de_rechercheRepository structure_de_rechercheRepository;
}
