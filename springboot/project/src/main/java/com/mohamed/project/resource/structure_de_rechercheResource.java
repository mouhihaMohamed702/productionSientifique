package com.mohamed.project.resource;

import com.mohamed.project.model.Publicaton;
import com.mohamed.project.repository.EtablissementRepository;
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




    @GetMapping(value = "/all")
    public List<Publicaton> getAll(){
        return publicationRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Publicaton> get(@PathVariable Integer id) {
        try{
            Publicaton pub = publicationRepository.findById(id).get();
            return new ResponseEntity<Publicaton>(pub,HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Publicaton>(HttpStatus.NOT_FOUND);
        }
    }

}
