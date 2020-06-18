/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.opc3.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author kose_
 */

@Entity
@Data
public class Authorities implements Serializable {
    
   private String authority;
   
   //bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="usuario")
        @Id
	private Usuario usuarioBean;
   
    
    
}
