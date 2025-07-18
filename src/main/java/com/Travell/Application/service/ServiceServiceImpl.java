package com.Travell.Application.service;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Travell.Application.entity.Servicee;
import com.Travell.Application.repository.ServiceRepository;

@Service
public class ServiceServiceImpl implements ServiceService {

    private  ServiceRepository serviceRepo;
    
    public ServiceServiceImpl(ServiceRepository serviceRepo) {
        this.serviceRepo = serviceRepo;
    }

    @Override
    public Optional<Servicee> getService(long id) {
        return serviceRepo.findById(id);
    }



    @Override
    public void deletService(long id) {
        serviceRepo.deleteById(id);
    }

    @Override
    public void saveService(Servicee service) {
        serviceRepo.save(service);
    }
}