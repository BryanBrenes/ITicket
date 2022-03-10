/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author bryan
 */
@Entity
@Table (name = "Artistas")
public class Artistas implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private long id_Artistas;
    private String nombre;
    private String apellidos;

    public long getId_Artistas() {
        return id_Artistas;
    }

    public void setId_Artistas(long id_Artistas) {
        this.id_Artistas = id_Artistas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
