package org.viraj.jdbcprojectforjggmasalas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viraj.jdbcprojectforjggmasalas.model.Masala;
import org.viraj.jdbcprojectforjggmasalas.repo.MasalaRepo;

@Service
public class MasalaService {
    @Autowired
    private MasalaRepo repo;
    public Masala addMasala(Masala masala){
        return repo.save(masala);
    }

}
