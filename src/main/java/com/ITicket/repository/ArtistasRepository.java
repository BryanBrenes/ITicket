/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ITicket.repository;

import com.ITicket.entity.Artistas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bryan
 */
@Repository
public interface ArtistasRepository extends CrudRepository <Artistas, Long>{
    
}
