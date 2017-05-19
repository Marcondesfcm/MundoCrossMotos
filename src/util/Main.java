/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.UsuarioDAO;
import entidades.Usuario;

/**
 *
 * @author Lab1
 */
public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        Usuario usuario = new Usuario();
        usuario.setNome("Marcondes");
        usuario.setEmail("hfh@ahjhaw");
        usuario.setLogin("gss");
        
        usuarioDAO.salvar(usuario);
        
        
         
    }
    
}
