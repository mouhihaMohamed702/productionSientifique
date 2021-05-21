package com.mohamed.project.resource;

import com.mohamed.project.model.Users;
import com.mohamed.project.repository.DoctorantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping(value = "/api/doctorant")
@CrossOrigin(origins = "http://localhost:3000")
public class doctorantResource {
    @Autowired
    DoctorantRepository doctorantRepository;



    @GetMapping(value = "/all")
    public List< Doctorant> getAll(){
        return doctorantRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public ResponseEntity< Doctorant> get(@PathVariable Integer id) {
        try{
            Doctorant doctorant = doctorantRepository.findById(id).get();
            return new ResponseEntity<Doctorant>(doctorant,HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Doctorant>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/add")
    public void addDoctorant(@RequestBody   Doctorant doctorant){
        doctorantRepository.save(doctorant);
    }

    @PutMapping (value ="/update")
    public void updateDoctorant(@RequestBody  Doctorant doctorant){
        doctorantRepository.save(doctorant);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Doctorant> deletdoctorant(@PathVariable Integer id) {
        try{
            doctorantRepository.deleteById(id);
            return new ResponseEntity<Doctorant>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity< Doctorant>(HttpStatus.NOT_FOUND);
        }
    }
}
