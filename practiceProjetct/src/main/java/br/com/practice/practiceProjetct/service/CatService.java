package br.com.practice.practiceProjetct.service;

import br.com.practice.practiceProjetct.entities.Cat;
import br.com.practice.practiceProjetct.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    @Autowired
    private CatRepository repository;

    public List<Cat> findCat(){
        return repository.findAll();
    }

}
