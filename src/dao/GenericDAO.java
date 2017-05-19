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
public abstract class GenericDAO<T>
        implements DAO<T> {

    private Session sessao;
    private Transaction transacao;

    @Override
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

    @Override
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

    @Override
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
        return null;
    }
      }
