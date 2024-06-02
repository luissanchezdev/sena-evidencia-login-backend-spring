package com.blaper.login.services;

import com.blaper.login.models.UsuarioModel;
import com.blaper.login.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getAll(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> findById(Long id){
        return usuarioRepository.findById(id);
    }

    public ArrayList<UsuarioModel> findByUsername(String username){
        return usuarioRepository.findByUsername(username);
    }

    public UsuarioModel saveUser(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteUser(Long id){
        usuarioRepository.deleteById(id);
    }

}
