package com.example.alexisexamen.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.alexisexamen.database.Usuariosrolesalexis;
import com.example.alexisexamen.service.Usuariorolserivealexis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Usuariorolcontroller {
    @Autowired
    Usuariorolserivealexis usuariorolserivealexis;

@PostMapping("/roles")
public String postMethodName(@RequestBody Usuariosrolesalexis enty) {
   
    return usuariorolserivealexis.creacion(enty);

}




}
