/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Tarefa;

/**
 *
 * @author Neojhon
 */
public class RenderizadorColunaPrazo extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value
            ,boolean isSelected, boolean hasFocus, int linha, int coluna){
        
        JLabel label = (JLabel)super.getTableCellRendererComponent(table, value,// pega o componente padr�o como � exibido agora 
                isSelected, hasFocus, TOP, coluna);
        
        label.setHorizontalAlignment(CENTER);//alinha o texto no centro da c�lula
        
        TarefaTableModel tarefaModel = (TarefaTableModel)table.getModel();
        
        Tarefa t = tarefaModel.getListaTarefas().get(linha);
        
        if(t.getPrazo().after(new Date())){// se data na c�lula prazo for depois da Data de hoje
            label.setBackground(Color.GREEN);//pinte a c�lula da verde
        }else{
            label.setBackground(Color.red);// pinte a c�lula de vermelho 
        }
        
        return label;
    }
    
}
