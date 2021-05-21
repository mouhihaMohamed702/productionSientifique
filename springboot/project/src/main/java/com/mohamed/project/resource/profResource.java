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




    @GetMapping(value = "/all")
    public List< Prof> getAll(){
        return profRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public ResponseEntity< Prof> get(@PathVariable Integer id) {
        try{
            Prof prof = profRepository.findById(id).get();
            return new ResponseEntity<Prof>(prof,HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Prof>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/add")
    public void addProf(@RequestBody   Prof prof){
        profRepository.save(prof);
    }

    @PutMapping (value ="/update")
    public void updateProf(@RequestBody  Prof prof){
        profRepository.save(prof);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Prof> deletProf(@PathVariable Integer id) {
        try{
            profRepository.deleteById(id);
            return new ResponseEntity<Prof>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Prof>(HttpStatus.NOT_FOUND);
        }
    }
}
