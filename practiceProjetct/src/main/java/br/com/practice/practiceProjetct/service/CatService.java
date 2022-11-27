package br.com.practice.practiceProjetct.service;

import br.com.practice.practiceProjetct.entities.Cat;
import br.com.practice.practiceProjetct.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.List;

@Service
public class CatService {

    private static final Logger LOGGER = Logger.getLogger(Cat.class.getName());
    @Autowired
    private CatRepository repository;

    public List<Cat> findCat(){
        return repository.findAll();
    }

    public List<Cat> insertCat(){
        var CatNew = new Cat();
        CatNew.setCor("Preto");
        CatNew.setNome("Yummi");
        CatNew.getAltura(4);

        LOGGER.log(Level.INFO, "Persist");
        LOGGER.log(Level.INFO, CatNew.toString());

        LOGGER.log(Level.INFO, "Find");
        repository.findById(CatNew.getId()).ifPresent(it -> {
            LOGGER.log(Level.INFO, CatNew.toString());
        });

        return Collections.singletonList(repository.save(CatNew));
    }

}
