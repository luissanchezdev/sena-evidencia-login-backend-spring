package com.blaper.login.controllers;

import com.blaper.login.models.UsuarioModel;
import com.blaper.login.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
        public ArrayList<UsuarioModel> obtenerUsuarios(){
            return usuarioService.getAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> encontrarUsuarioPorId( @PathVariable ("id") Long id){
        return usuarioService.findById(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> encontrarPorUsername( @RequestParam ("username") String username){
        return usuarioService.findByUsername(username);
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioService.saveUser(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public void eliminarUsuario(@PathVariable ("id") Long id ){
        usuarioService.deleteUser(id);
    }


}
