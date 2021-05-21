package com.mohamed.project.resource;

import com.mohamed.project.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping(value = "/api/equipe")
@CrossOrigin(origins = "http://localhost:3000")
public class equipeResource {
    @Autowired
    EquipeRepository equipeRepository;



    @GetMapping(value = "/all")
    public List<Equipe> getAll(){
        return equipeRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public ResponseEntity< Equipe> get(@PathVariable Integer id) {
        try{
            Equipe equipe = equipeRepository.findById(id).get();
            return new ResponseEntity<Equipe>(equipe,HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Doctorant>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/add")
    public void addEquipe(@RequestBody   Equipe equipe){
        equipeRepository.save(equipe);
    }

    @PutMapping (value ="/update")
    public void updateEquipe(@RequestBody  Equipe equipe){
        equipeRepository.save(equipe);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Equipe> deletequipe(@PathVariable Integer id) {
        try{
            doctorantRepository.deleteById(id);
            return new ResponseEntity<Equipe>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity< Equipe>(HttpStatus.NOT_FOUND);
        }
    }
}
