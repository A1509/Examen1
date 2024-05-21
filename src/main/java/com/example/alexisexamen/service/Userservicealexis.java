package com.example.alexisexamen.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.alexisexamen.database.Usuarioalexis;
import com.example.alexisexamen.database.Usuariosrolesalexis;
import com.example.alexisexamen.repository.Usuariorolrepositoryalexis;
import com.example.alexisexamen.repository.Usuariorepositoryalexis;

import jakarta.transaction.Transactional;

@Service
public class Userservicealexis {
    @Autowired
    Usuariorepositoryalexis usuariorepository;
@Autowired
Usuariorolrepositoryalexis usuariorolrepositoryalexis;
    public String register(Usuarioalexis enti){
         Usuariosrolesalexis especial = usuariorolrepositoryalexis.findById(enti.getRol().getId())
                .orElseThrow(() -> new RuntimeException("Especial not found"));

        // Asignar la instancia obtenida o creada
        enti.setRol(especial);

        usuariorepository.save(enti);
        return "creado";
    }

     public List<Usuarioalexis> all() {
        // Utiliza Java Streams para convertir Iterable a List
        return StreamSupport.stream(usuariorepository.findAll().spliterator(), false)
                            .collect(Collectors.toList());
    }
    @Transactional
    public String borrado_by_name( Usuarioalexis enty){

        usuariorepository.deleteByCorreo(enty.getCorreo());
        return "elimiando";
    }
    
}
