
import dao.MotoDAO;
import entidades.Moto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab1
 */
public class TesteCadastroMoto {
    public static void main(String[] args) {
        Moto moto = new Moto("efwsf", "marca", 500);
        MotoDAO motoDAO = new MotoDAO();
        
        motoDAO.salvar(moto);
    }
}
