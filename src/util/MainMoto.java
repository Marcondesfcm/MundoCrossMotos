/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.MotoDAO;
import dao.UsuarioDAO;
import entidades.Moto;
import entidades.Usuario;

/**
 *
 * @author Marcondes
 */
public class MainMoto {
    public static void main(String args[]){
      MotoDAO MotoDAO = new MotoDAO();
        
        Moto moto = new Moto();
        moto.setModelo("xre");
        moto.setMarca("honda");
        moto.setCc(250);
        
        MotoDAO.salvar(moto);
        
        
         
    }
    
}
