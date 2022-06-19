/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Tarefa;

/**
 *
 * @author Neojhon
 */
public class TarefaTableModel extends AbstractTableModel {

    String[] colunas = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    List<Tarefa> listaTarefas = new ArrayList();

    @Override
    public int getRowCount() {
        return listaTarefas.size() ;// retorna o tamanho da lista de Tarefas
    }

    @Override
    public int getColumnCount() {
        return colunas.length  ;//retorna quantas colunas tem no vetor de Strings
    }
    
    @Override
    public String getColumnName(int indexColuna){
        return colunas[indexColuna];
        
    }
    //permite edição na coluna "Tarefa concluída"
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return columnIndex == 3;// se a colluna for 3 vai retornar true na comparação 
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if(listaTarefas.isEmpty()){
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return listaTarefas.get(rowIndex).getNome();
            case 1:
                return listaTarefas.get(rowIndex).getDescricao();
            case 2:
                SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");//formato de Data desejado
                return date.format(listaTarefas.get(rowIndex).getPrazo());//formata a data que ira retornar
            case 3:
                return listaTarefas.get(rowIndex).ehCompletada();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dados não encontrados";
        }
    }
    
    @Override
    public void setValueAt(Object aValue,int rowIndex, int columnIndex ){
        listaTarefas.get(rowIndex).setCompletada((boolean) aValue);
    }

    public String[] getColunas() {
        return colunas;
    }

    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(List<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }
    
    

}
