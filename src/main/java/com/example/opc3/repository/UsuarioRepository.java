/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.opc3.repository;

import com.example.opc3.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kose_
 */
public interface UsuarioRepository extends JpaRepository<Usuario, String>{
    
}
