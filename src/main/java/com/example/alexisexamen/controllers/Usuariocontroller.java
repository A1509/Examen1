package com.example.alexisexamen.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.alexisexamen.database.Usuarioalexis;
import com.example.alexisexamen.service.Userservicealexis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/a")
public class Usuariocontroller {
@Autowired
    Userservicealexis userservicealexis;
@GetMapping("/usuario")
public List<Usuarioalexis> selecionar_todo() {
    return userservicealexis.all();
}
@PostMapping("/usuario")
public String postMethodName(@RequestBody Usuarioalexis entity) {
    
    
    return userservicealexis.register(entity);
}
@PutMapping("/usuario")
public String putMethodName( @RequestBody Usuarioalexis entity) {
    //TODO: process PUT request
    
    return userservicealexis.borrado_by_name(entity);
}

}
