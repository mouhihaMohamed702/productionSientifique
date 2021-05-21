package com.mohamed.project.resource;

import com.mohamed.project.repository.EtablissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping(value = "/api/etablissement")
@CrossOrigin(origins = "http://localhost:3000")
public class etablissementResource {
    @Autowired
    EtablissementRepository etablissementRepository;




    @GetMapping(value = "/all")
    public List< Etablissement> getAll(){
        return EtablissementRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public ResponseEntity< Etablissement> get(@PathVariable Integer id) {
        try{
            Etablissement etablissement = EtablissementRepository.findById(id).get();
            return new ResponseEntity<Etablissement>(etablissement,HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Etablissement>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/add")
    public void addEtablissement(@RequestBody   Etablissement etablissement){
        EtablissementRepository.save(etablissement);
    }

    @PutMapping (value ="/update")
    public void updateEtablissement(@RequestBody  Etablissement etablissement){
        EtablissementRepository.save(etablissement);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Etablissement> deletEtablissement(@PathVariable Integer id) {
        try{
            EtablissementRepository.deleteById(id);
            return new ResponseEntity<Etablissement>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity< Etablissement>(HttpStatus.NOT_FOUND);
        }
    }
}
