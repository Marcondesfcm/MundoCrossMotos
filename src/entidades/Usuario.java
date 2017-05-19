/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Lab1
 */
@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(length = 9, nullable = false)
    private String login;
    
     @Column(length = 35, nullable = false)
    private String nome;
     
      @Column(length = 15, nullable = false)
    private int RG;
      
       @Column(length = 15, nullable = false)
    private int CPF;
       
        @Column(length = 25, nullable = false)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRg(String toString) {
        this.RG = RG;
        
    }

    public void setCpf(String toString) {
       this.CPF = CPF;
    }
        
        

    
}
