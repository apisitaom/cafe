package com.example.backend.Controllers;

import com.example.backend.Repository.*;
import com.example.backend.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ShopController {
    @Autowired private ShopRepository shopRepository;
    
    @GetMapping(path = "/feedback")
    private Collection<ShopEntity> getFeedback(){
        return this.shopRepository.findAll().stream().collect(Collectors.toList());
    }
}