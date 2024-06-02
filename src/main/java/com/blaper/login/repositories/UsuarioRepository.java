package com.blaper.login.repositories;

import com.blaper.login.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByUsername(String username);

}
