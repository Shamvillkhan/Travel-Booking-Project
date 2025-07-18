package com.Travell.Application.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Travell.Application.entity.Packages;
import com.Travell.Application.repository.PackagesRepository;

import java.util.List;

@Service
public class PackagesServiceImpl implements PackagesService{

    @Autowired
    private PackagesRepository repo;

    public List<Packages> listAll() {
        return repo.findAll();
    }

    public void save(Packages p) {
        repo.save(p);
    }

    public Packages get(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
