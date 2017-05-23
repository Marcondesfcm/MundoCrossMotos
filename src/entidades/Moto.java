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
 * @author Marcondes
 */
@Entity
@Table(name = "moto")
public class Moto {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(length = 20, nullable = false)
    private String modelo;
    
     @Column(length = 35, nullable = false)
    private String marca;
     
      @Column(length = 15, nullable = false)
    private int cc;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
      
    public Moto() {
    }

    public Moto(String modelo, String marca, int cc) {
        this.modelo = modelo;
        this.marca = marca;
        this.cc = cc;
    }
    
    
    
}
