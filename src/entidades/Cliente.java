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

//import javax.persistence.Table;
//import javax.persistence.Table;



/**
 *sdthdfgfdgdfg
 * @author Marcondes
 */
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(length = 20, nullable = false)
    private String nome;
    
     @Column(length = 35, nullable = false)
    private String rg;
     
      @Column(length = 15, nullable = false)
    private int cpf;
      
       
    public String getNome() {
        return nome;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String marcondes) {
       this.nome=nome;
    }

    public void setCpf(String gss) {
       this.rg=rg;
    }

    public void setModelo(String toString) {
       this.cpf=cpf;
    }

   
    
}
