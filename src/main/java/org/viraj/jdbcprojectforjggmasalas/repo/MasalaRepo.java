package org.viraj.jdbcprojectforjggmasalas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.viraj.jdbcprojectforjggmasalas.model.Masala;

@Repository
public interface MasalaRepo extends JpaRepository<Masala, Long> {

}