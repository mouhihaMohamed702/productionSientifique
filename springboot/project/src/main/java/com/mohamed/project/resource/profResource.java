package com.mohamed.project.resource;

import com.mohamed.project.repository.ProfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping(value = "/api/prof")
@CrossOrigin(origins = "http://localhost:3000")
public class profResource {
    @Autowired
    ProfRepository profRepository;
}
