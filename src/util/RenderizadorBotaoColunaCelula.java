/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;


import java.awt.Component;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;



/**
 *
 * @author Neojhon
 */
public class RenderizadorBotaoColunaCelula extends DefaultTableCellRenderer {

    /**
     * Tipo do bot�o, pode ser de editar ou excluir tarefa
     */
    private String tipoBotao;

    /**
     * Contrutor
     */
    public RenderizadorBotaoColunaCelula(String tipoBotao) {
        this.tipoBotao = tipoBotao;
    }

    public String getTipoBotao() {
        return tipoBotao;
    }

    public void setTipoBotao(String tipoBotao) {
        this.tipoBotao = tipoBotao;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int linha, int coluna) {

        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value,// pega o componente padr�o como � exibido agora 
                isSelected, hasFocus, linha, coluna);

        label.setHorizontalAlignment(CENTER);//alinha o �cone no centro da c�lula

      File f = new File("/Entra21/L�gica de Program��o III/Exerc�cios/TasksAPP/src/Resources/" + tipoBotao + ".png");
       
        
        label.setIcon(new javax.swing.ImageIcon(f.getAbsolutePath()));
            //getClass().getResources("/"  + tipoBotao + ".pnp")
        return label;
    }

   

}
