package br.com.practice.practiceProjetct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.practice.practiceProjetct.entities.Cat;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
