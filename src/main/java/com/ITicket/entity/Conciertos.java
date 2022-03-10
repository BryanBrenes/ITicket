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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author bryan
 */
@Entity
@Table (name = "conciertos")
public class Conciertos implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private long id_Concierto;
    private long artista;
    private String costo;
    private String fecha;
    private String capacidad_Max;
    private String lugar;
    
    @ManyToOne
    @JoinColumn(name = "id_artistas")
    private Artistas artistas;

    public long getId_Concierto() {
        return id_Concierto;
    }

    public void setId_Concierto(long id_Concierto) {
        this.id_Concierto = id_Concierto;
    }

    public long getArtista() {
        return artista;
    }

    public void setArtista(long artista) {
        this.artista = artista;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCapacidad_Max() {
        return capacidad_Max;
    }

    public void setCapacidad_Max(String capacidad_Max) {
        this.capacidad_Max = capacidad_Max;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Artistas getArtistas() {
        return artistas;
    }

    public void setArtistas(Artistas artistas) {
        this.artistas = artistas;
    }
    
    
}
