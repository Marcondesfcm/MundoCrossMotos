/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Lab1
 */
public class GenericDAO<T> implements DAO<T>{

    protected Session sessao;
    private Transaction transacao;
    public Class classe;
    
       public GenericDAO(Class classe) {
           this.classe = classe;
    }

    public boolean salvar(T t) {
        try {
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            this.transacao = sessao.beginTransaction();
            this.sessao.save(t);
            this.transacao.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            this.sessao.close();

        }

    }

    public boolean editar(T t) {

        try {
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            this.transacao = sessao.beginTransaction();
            this.sessao.update(t);
            this.transacao.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            this.sessao.close();

        }

    }

    public boolean deletar(T t) {
        try {
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            this.transacao = sessao.beginTransaction();
            this.sessao.delete(t);
            this.transacao.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            this.sessao.close();

        }
    }

    @Override
    public List<T> listar() {
        List<T> lista = null;
        try {
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            this.transacao = sessao.beginTransaction();
            lista = sessao.createCriteria(classe).list();
        } catch (Exception e) {
            System.out.println("Erro na lista " + e);
        }
        finally {
            this.sessao.close();
        }
        return lista;
    }

 
    

    }
