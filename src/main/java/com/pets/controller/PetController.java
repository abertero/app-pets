package com.pets.controller;

import com.pets.domain.Mark;
import com.pets.domain.Pet;
import com.pets.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller(value = "pet")
public class PetController {

    @Autowired
    private PetService petService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pet>> list() {
        List<Pet> all = petService.findAll();
        return new ResponseEntity<List<Pet>>(all, HttpStatus.OK);
    }

    @RequestMapping(name = "{altKey}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Pet> pet(@PathVariable String altKey) {
        Pet pet = petService.getPet(altKey);
        return new ResponseEntity<Pet>(pet, HttpStatus.OK);
    }

    @RequestMapping(name = "mark", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity mark(@RequestBody Mark mark) {
        petService.mark(mark);
        return new ResponseEntity(HttpStatus.OK);
    }
}
