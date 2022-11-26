package br.com.practice.practiceProjetct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.practice.practiceProjetct.entities.Cat;

public interface CatRepository extends JpaRepository<Cat,Long> {

}
