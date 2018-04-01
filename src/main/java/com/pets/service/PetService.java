package com.pets.service;

import com.pets.domain.Mark;
import com.pets.domain.Pet;

import java.util.List;

public interface PetService {
    Pet getPet(String altKey);

    void mark(Mark mark);

    List<Pet> findAll();
}
