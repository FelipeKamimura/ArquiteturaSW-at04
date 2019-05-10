/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kamimura
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Customer implements Serializable{
    
    @Id @GeneratedValue
    private Long id;
    
    private String password;
    private String email;
    private int age;
    private String lastName;
    private String firstName;
    private String login;
    @Temporal (TemporalType.DATE)
    private Date dateOfBirth;
    private String telephone;
    
    @OneToOne
    private Address homeAdress;
    
}
