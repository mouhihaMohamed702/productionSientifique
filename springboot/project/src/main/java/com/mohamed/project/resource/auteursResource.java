package com.mohamed.project.resource;

import com.mohamed.project.model.Users;
import com.mohamed.project.repository.AuteursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping(value = "/api/auteurs")
@CrossOrigin(origins = "http://localhost:3000")
public class auteursResource {


    @Autowired
    AuteursRepository auteursRepository;

    @GetMapping(value = "/all")
    public List<Auteurs> getAll(){
        return auteursRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Auteurs> get(@PathVariable Integer id) {
        try{
            Auteurs auteur = usersRepository.findById(id).get();
            return new ResponseEntity<Auteurs>(auteur,HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Auteurs>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/add")
    public void addAuteur(@RequestBody  Auteurs auteur){
        auteursRepository.save(auteur);
    }

    @PutMapping (value ="/update")
    public void updateauteur(@RequestBody Auteurs auteur){
        auteursRepository.save(auteur);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Auteurs> deletauteur(@PathVariable Integer id) {
        try{
            usersRepository.deleteById(id);
            return new ResponseEntity<Auteurs>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Auteurs>(HttpStatus.NOT_FOUND);
        }
    }
}
