/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.ClienteDAO;
import entidades.Cliente;

/**
 *
 * @author Marcondes
 */
public class MainCliente {
     public static void main(String[] args) {
        ClienteDAO ClienteDAO = new ClienteDAO();
        
        Cliente cliente = new Cliente();
        cliente.setNome("Marcondes");
        cliente.setRg("hfh@ahjhaw");
        cliente.setCpf("gss");
        
        ClienteDAO.salvar(cliente);
        
        
         
    }
    
}


