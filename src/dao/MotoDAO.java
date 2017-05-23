/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Moto;
import java.util.List;

/**
 *
 * @author Marcondes
 */
public class MotoDAO extends GenericDAO<Moto> {

    public MotoDAO() {
        super(Moto.class);
    }

    @Override
    public boolean salvar(Moto moto) {
        return super.salvar(moto); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
