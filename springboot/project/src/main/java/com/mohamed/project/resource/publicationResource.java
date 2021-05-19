package com.mohamed.project.resource;

import com.mohamed.project.model.Publicaton;
import com.mohamed.project.repository.AuteursRepository;
import com.mohamed.project.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestControllerAdvice
@RequestMapping(value = "/api/publication")
@CrossOrigin(origins = "http://localhost:3000")
public class publicationResource {
    @Autowired
    PublicationRepository publicationRepository;
    AuteursRepository auteursRepository;

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

    @PostMapping( value="/add")
    public ResponseEntity<Integer> addPublication(@RequestBody  Publicaton publication){
        Integer pub = publicationRepository.save(publication).getId();
        return new ResponseEntity<Integer>(pub,HttpStatus.OK);
    }

    @PutMapping (value ="/update")
    public void updatePublication(@RequestBody Publicaton publication){
        publicationRepository.save(publication);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Publicaton> deletePublication(@PathVariable Integer id) {
        try{
            publicationRepository.deleteById(id);
            return new ResponseEntity<Publicaton>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Publicaton>(HttpStatus.NOT_FOUND);
        }
    }
}
