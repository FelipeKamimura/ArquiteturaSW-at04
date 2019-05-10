/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Order implements Serializable{
    @Id @GeneratedValue
    private Long id;
    @OneToOne
    private CreditCard creditCard;
    @Temporal (TemporalType.DATE)
    private Data orderDate;
    @Enumerated (EnumType.STRING)
    private CreditCardType creditCardType;
    
    @ManyToOne
    private Set<OrderLine> orderLines;
    
    private float total;
    @OneToOne
    private Customer customer;
    
    @OneToOne
    private Address deliveryAdress;
    private String creditCardExpiryDate;
 }
