package modelo;

import entidades.Moto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MotoTableModel extends AbstractTableModel {

    private String[] colunas = {"MARCA", "MODELO", "CC"};
    private List<Moto> motos;

    //Construtor da classe  que receb lista como parametro  
    public MotoTableModel(List<Moto> motos) {
        this.motos = motos;

    }

    @Override
    public int getRowCount() {
        return this.motos.size();

    }

    @Override
    public int getColumnCount() {
        return colunas.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Moto moto = motos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return moto.getMarca();
            case 1:
                return moto.getModelo();
            case 2:
                return moto.getCc();

        }
        return null;
    }
       @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            default:
                break;
        }
        return null;

    }

}
