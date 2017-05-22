package modelo;

import entidades.Cliente;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.table.AbstractTableModel;

//Criação de uma classe abstrata
//quando pecisar mostrar dados em tabelas
public class ClienteTableModel extends AbstractTableModel {

    //Criação dos métodos abstratos
    private String[] colunas = new String[]{"nome,rg"};
    private List<Cliente> clientes;

    //Construtor da classe  que receb lista como parametro  
    public ClienteTableModel(List<Cliente> clientes) {
        this.clientes = clientes;

    }

    @Override
    public int getRowCount() {
        //retorna a quantidade de clientes
        return this.clientes.size();

    }

    @Override
    public int getColumnCount() {
        //retorna a quantidade de colunas
        return colunas.length;

    }

    @Override
    //identifica o título de cada coluna
    public Object getValueAt(int rowIndex, int columnIndex) {
        // metodo que desenha a tabela entre linha e coluna
        Cliente cliente = clientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cliente.getId();
            case 1:
                return cliente.getNome();
            default:
                break;

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
            default:
                break;
        }
        return super.getColumnName(column);

    }

}
