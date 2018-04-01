package com.pets.service.impl;

import com.pets.domain.Mark;
import com.pets.domain.Pet;
import com.pets.service.PetService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetServiceImpl implements PetService {
    public Pet getPet(String altKey) {
        return null;
    }

    public void mark(Mark mark) {

    }

    public List<Pet> findAll() {
        return new ArrayList<Pet>();
    }
}
