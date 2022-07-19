package com.example.practicojava.controllers;

import com.example.practicojava.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UsuarioControllers {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Zulma");
        usuario.setApellido("Camarero");
        usuario.setEmail("muzulmana@hotmail.com");
        usuario.setTelefono("2921197546");
        return usuario;
    }

    @RequestMapping(value = "usuario45")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Zulma");
        usuario.setApellido("Camarero");
        usuario.setEmail("muzulmana@hotmail.com");
        usuario.setTelefono("2921197546");
        return usuario;
    }

    @RequestMapping(value = "usuario345")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Zulma");
        usuario.setApellido("Camarero");
        usuario.setEmail("muzulmana@hotmail.com");
        usuario.setTelefono("2921197546");
        return usuario;
    }

    @RequestMapping(value = "usuario123")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Zulma");
        usuario.setApellido("Camarero");9
        usuario.setEmail("muzulmana@hotmail.com");
        usuario.setTelefono("2921197546");
        return usuario;
    }

}
