package com.example.Mapping.Service;

import com.example.Mapping.Model.Laptop;
import com.example.Mapping.Repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    private final LaptopRepo laptopRepo;

    @Autowired
    public LaptopService(LaptopRepo laptopRepo) {
        this.laptopRepo = laptopRepo;
    }
    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public Laptop getLaptopById(String id) {
        return laptopRepo.findById(id).orElse(null);
    }

    public Laptop createLaptop(Laptop laptop) {
        return laptopRepo.save(laptop);
    }

    public Laptop updateLaptop(Laptop laptop) {
        return laptopRepo.save(laptop);
    }

    public void deleteLaptop(String id) {
        laptopRepo.deleteById(id);

    }
}
