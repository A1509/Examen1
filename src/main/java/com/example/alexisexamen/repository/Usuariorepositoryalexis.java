package com.example.alexisexamen.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.alexisexamen.database.Usuarioalexis;

public interface Usuariorepositoryalexis extends CrudRepository<Usuarioalexis,String> {
    
    Usuarioalexis findByCorreo(String nombre);
    void deleteByCorreo(String nombre);
}
