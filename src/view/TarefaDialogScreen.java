/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TarefaController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Projeto;
import model.Tarefa;

/**
 *
 * @author Neojhon
 */
public class TarefaDialogScreen extends javax.swing.JDialog {
    //update Tarefa 
    private boolean update ;
    private int idTarefa;

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }
    

    public void setUpdate(boolean update) {
        this.update = update;
    }

    //Controlador da Tarefa que cria a conex�o com o banco de dados
    TarefaController tc;

    //Projeto ao qual a tarefa vai pertencer
    Projeto p;

    /**
     * Creates new form TarefaDialogScreen
     */
    public TarefaDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tc = new TarefaController();
        this.update = false;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlIconAddTarefa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeTarefa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaObservacoesTarefa = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescricaoTarefa = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ftxtPrazo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(340, 680));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tarefa");

        jlIconAddTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconAddTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/check2.png"))); // NOI18N
        jlIconAddTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIconAddTarefaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jlIconAddTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlIconAddTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome");

        txtNomeTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Prazo");

        txtAreaObservacoesTarefa.setColumns(20);
        txtAreaObservacoesTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAreaObservacoesTarefa.setRows(5);
        jScrollPane2.setViewportView(txtAreaObservacoesTarefa);

        txtAreaDescricaoTarefa.setColumns(20);
        txtAreaDescricaoTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAreaDescricaoTarefa.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescricaoTarefa);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Descri��o");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Observa��es");

        ftxtPrazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftxtPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtPrazoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel4)
                            .addComponent(txtNomeTarefa)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ftxtPrazo)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                                .addGap(1, 1, 1)))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftxtPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtPrazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtPrazoActionPerformed

    private void jlIconAddTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconAddTarefaMouseClicked
        // criar um projeto
        Tarefa t = new Tarefa();
        //setando o id do projeto ao qual a tarefa pertence

        t.setIdProjetos(p.getId());// pega o id do projeto ao qual a tarefa pertence 
        //tratamento de exce��es 
        try {
            if(update == true){
            if ((txtNomeTarefa.getText().equals("") == false) && (txtAreaDescricaoTarefa.getText().equals("") == false)
                    && (ftxtPrazo.getText().equals("") == false) && (txtAreaObservacoesTarefa.getText().equals("") == false)) {
                //setando o Projeto
                t.setNome(txtNomeTarefa.getText());
                t.setDescricao(txtAreaDescricaoTarefa.getText());
                t.setCompletada(false);
                t.setPrazo(new SimpleDateFormat("dd/MM/yyyy").parse(ftxtPrazo.getText()));
                t.setObservacoes(txtAreaObservacoesTarefa.getText());
                 t.setId(idTarefa);// pega id da tarefa que vai ser atualizada 
                //adicionar no Banco
                tc.update(t);
                JOptionPane.showMessageDialog(rootPane, "Tarefa Atualizada com sucesso");
                
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
            }
            }else{
                if ((txtNomeTarefa.getText().equals("") == false) && (txtAreaDescricaoTarefa.getText().equals("") == false)
                    && (ftxtPrazo.getText().equals("") == false) && (txtAreaObservacoesTarefa.getText().equals("") == false)) {
                //setando o Projeto
                t.setNome(txtNomeTarefa.getText());
                t.setDescricao(txtAreaDescricaoTarefa.getText());
                t.setCompletada(false);
                t.setPrazo(new SimpleDateFormat("dd/MM/yyyy").parse(ftxtPrazo.getText()));
                t.setObservacoes(txtAreaObservacoesTarefa.getText());
                //adicionar no Banco
                tc.save(t);
                JOptionPane.showMessageDialog(rootPane, "Tarefa adicionada com sucesso");
                
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
            }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }//GEN-LAST:event_jlIconAddTarefaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TarefaDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TarefaDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TarefaDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TarefaDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TarefaDialogScreen dialog = new TarefaDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftxtPrazo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlIconAddTarefa;
    private javax.swing.JTextArea txtAreaDescricaoTarefa;
    private javax.swing.JTextArea txtAreaObservacoesTarefa;
    private javax.swing.JTextField txtNomeTarefa;
    // End of variables declaration//GEN-END:variables

    /**
     * Seta o projeto ao qual pertence a tarefa
     */
    public void setProjeto(Projeto p) {
        this.p = p;
    }

    public void carregaDadosTarefa(Tarefa t, int projetoId) {
        
        //setando o id do projeto ao qual a tarefa pertence

        t.setIdProjetos(projetoId);// pega o id do projeto ao qual a tarefa pertence 
        //tratamento de exce��es 

        //setando o Projeto
       txtNomeTarefa.setText(t.getNome());
        txtAreaDescricaoTarefa.setText(t.getDescricao());
        //formatando como quero exibir a data
      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");//formato desejado
      Date date = t.getPrazo();//data da tarefa do banco de dados
        ftxtPrazo.setText(df.format(date));//formantando no formato desejado antes de ser setado
       
        txtAreaObservacoesTarefa.setText(t.getObservacoes());

    }

}