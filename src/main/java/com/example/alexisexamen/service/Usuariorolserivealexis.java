package com.example.alexisexamen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.alexisexamen.database.Usuariosrolesalexis;
import com.example.alexisexamen.repository.Usuariorolrepositoryalexis;

@Service
public class Usuariorolserivealexis {
    @Autowired
    Usuariorolrepositoryalexis usuariorolrepositoryalexis;

    
    public String creacion(Usuariosrolesalexis enty){

 usuariorolrepositoryalexis.save(enty);
 return "creado exitosamente";
    }

   
}
