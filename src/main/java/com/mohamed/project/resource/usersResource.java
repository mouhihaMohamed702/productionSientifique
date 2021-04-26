package com.mohamed.project.resource;

import com.mohamed.project.model.Users;
import com.mohamed.project.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestControllerAdvice
@RequestMapping(value = "/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class usersResource {
    @Autowired
     UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Users> get(@PathVariable Integer id) {
        try{
            Users user = usersRepository.findById(id).get();
            return new ResponseEntity<Users>(user,HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/add")
    public void addUser(@RequestBody  Users user){
        usersRepository.save(user);
    }

    @PutMapping (value ="/update")
    public void updateUser(@RequestBody Users user){
        usersRepository.save(user);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Users> deletUser(@PathVariable Integer id) {
        try{
            usersRepository.deleteById(id);
            return new ResponseEntity<Users>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
        }
    }
}
