package org.viraj.jdbcprojectforjggmasalas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viraj.jdbcprojectforjggmasalas.model.Masala;
import org.viraj.jdbcprojectforjggmasalas.repo.MasalaRepo;

import java.util.List;
import java.util.Optional;

@Service
public class MasalaService {
    @Autowired
    private MasalaRepo repo;
    public Masala addMasala(Masala masala){
        return repo.save(masala);
    }
    public List<Masala> getallmasala(){
        return repo.findAll();
    }
    public Masala getMasalabyId(Long id){
        Optional<Masala> masala=repo.findById(id);
        return masala.orElse(null);
    }
    public void deleteStudent(Long id){
        repo.deleteById(id);
    }
    public Masala updateMasala(Masala masala){
        return repo.save(masala);
    }


}
