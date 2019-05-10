/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kamimura
 */
public interface CreditCardDAO extends JpaRepository<CreditCard, Long>{
    
}
