package com.example.Mapping.Service;

import com.example.Mapping.Model.Address;
import com.example.Mapping.Repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    private final AddressRepo addressRepo;

    @Autowired
    public AddressService(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }
    public List<Address> getAllAddresss() {
        return addressRepo.findAll();
    }

    public Address getAddressById(String id) {
        return addressRepo.findById(id).orElse(null);
    }

    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

    public Address updateAddress(Address address) {
        return addressRepo.save(address);
    }

    public void deleteAddress(String id) {
        addressRepo.deleteById(id);

    }
}
