/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Cliente;
import java.util.List;
import org.hibernate.Hibernate;
import util.HibernateUtil;

/**
 *
 * @author Marcondes
 */
public class ClienteDAO extends GenericDAO<Cliente> {

    public ClienteDAO() {
        super(Cliente.class);
    }

    
    
    @Override
    public List<Cliente> listar() {
        List<Cliente> clientes = null;
        
        try{
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            clientes = this.sessao.createCriteria(Cliente.class).list();
            
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            this.sessao.close();
            
        }
        
        return clientes;
    }
    
}
