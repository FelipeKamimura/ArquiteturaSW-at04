/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kamimura
 */
public interface AdressDAO extends JpaRepository<Address, Long> {
    
}
