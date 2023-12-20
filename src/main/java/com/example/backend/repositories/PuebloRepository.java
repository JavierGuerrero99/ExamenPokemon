package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend.entities.Pueblo;

@Repository
public interface PuebloRepository extends JpaRepository<Pueblo,Long> {

}
