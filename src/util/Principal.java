/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Lab1
 */
public class Principal {
    
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
    }
    
}
