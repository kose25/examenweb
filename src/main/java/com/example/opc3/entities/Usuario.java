/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.opc3.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author kose_
 */

@Entity
@Data
@Table(name="usuario")
public class Usuario implements Serializable{
    
    @Id
    private String usuario;
    private String email;
    private String clave;
    private Byte enabled;
    
    
}
