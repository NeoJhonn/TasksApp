/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ProjetoController;
import controller.TarefaController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Projeto;
import model.Tarefa;
import util.RenderizadorBotaoColunaCelula;
import util.RenderizadorColunaPrazo;
import util.TarefaTableModel;

/**
 *
 * @author Neojhon
 */
public class MainScreen extends javax.swing.JFrame {

    ProjetoController pc;
    TarefaController tc;
    DefaultListModel projetosModel;
    TarefaTableModel tarefasModel;
    
    

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        initDataController();
        initComponentsModel();
        decorateTableTarefa();
        initProjetosModel();
        setTitle("App Tarefas");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTarefa = new javax.swing.JScrollPane();
        jTableTarefas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlAddProjeto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jlAddTarefa = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlistListaProjetos = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jpListaVazia = new javax.swing.JPanel();
        jlListaTarefasIcon = new javax.swing.JLabel();
        jlListaTarefasTitle = new javax.swing.JLabel();
        jlListaTarefasSubTitle = new javax.swing.JLabel();

        jTableTarefas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri??o ", "Prazo", "Tarefa conclu?da"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTarefas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableTarefas.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTarefas.setRowHeight(50);
        jTableTarefas.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTableTarefas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTarefas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTarefas.setShowGrid(false);
        jTableTarefas.setShowHorizontalLines(true);
        jTableTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTarefasMouseClicked(evt);
            }
        });
        jScrollPaneTarefa.setViewportView(jTableTarefas);

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 640));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/verifica1.png"))); // NOI18N
        jLabel1.setText("App Tarefas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Anote Tudo, n?o esque?a Nada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Projetos");

        jlAddProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        jlAddProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlAddProjetoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlAddProjeto)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAddProjeto)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Tarefas");

        jlAddTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        jlAddTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlAddTarefaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlAddTarefa)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAddTarefa)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlistListaProjetos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlistListaProjetos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlistListaProjetos.setFixedCellHeight(50);
        jlistListaProjetos.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jlistListaProjetos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistListaProjetosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlistListaProjetos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        jpListaVazia.setBackground(new java.awt.Color(255, 255, 255));

        jlListaTarefasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlListaTarefasIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/laptop1.png"))); // NOI18N

        jlListaTarefasTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlListaTarefasTitle.setForeground(new java.awt.Color(102, 102, 102));
        jlListaTarefasTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlListaTarefasTitle.setText("Nenhuma Tarefa por aqui :D");

        jlListaTarefasSubTitle.setForeground(new java.awt.Color(153, 153, 153));
        jlListaTarefasSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlListaTarefasSubTitle.setText("Clique no bot?o \"+\" para adicionar uma tarefa");

        javax.swing.GroupLayout jpListaVaziaLayout = new javax.swing.GroupLayout(jpListaVazia);
        jpListaVazia.setLayout(jpListaVaziaLayout);
        jpListaVaziaLayout.setHorizontalGroup(
            jpListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlListaTarefasSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
            .addComponent(jlListaTarefasTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlListaTarefasIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpListaVaziaLayout.setVerticalGroup(
            jpListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaVaziaLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jlListaTarefasIcon)
                .addGap(18, 18, 18)
                .addComponent(jlListaTarefasTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlListaTarefasSubTitle)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jPanel5.add(jpListaVazia, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlAddProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAddProjetoMouseClicked
        //Mostrar tela de cadastro de projeto
        ProjetoDialogScreen pds = new ProjetoDialogScreen(this, rootPaneCheckingEnabled);
        pds.setVisible(true);
        //cria um escutador de janela 
        pds.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {// que quando a janela for fechada 
                loadProjetos();                     // execulta essa linha de comando 
            }

        });

    }//GEN-LAST:event_jlAddProjetoMouseClicked

    private void jlAddTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAddTarefaMouseClicked
        int projetoId = jlistListaProjetos.getSelectedIndex();//pega o id do Projeto selecionado 
        if (!jlistListaProjetos.isSelectionEmpty()) {//se um projeto estiver selecionado 

            //Mostra a tela de cadastro da tarefa
            TarefaDialogScreen tds = new TarefaDialogScreen(this, rootPaneCheckingEnabled);

            Projeto p = (Projeto) projetosModel.get(projetoId);//pega o projeto selecionado e guarda na vari?vel p

            tds.setProjeto(p);
            tds.setVisible(true);// torna vis?vel a tela 

            //cria um ouvinte na janela 
            tds.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {// que quando a janela for fechada 
                    //atualiza a lista de Tarefas
                    loadTarefas(p.getId());                   // execulta essa linha de comando 

                }

            });
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um Projeto pra adicionar uma Tarefa");
        }

    }//GEN-LAST:event_jlAddTarefaMouseClicked

    private void jTableTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTarefasMouseClicked
        //pega o id do Projeto selecionado
        int projetoId = jlistListaProjetos.getSelectedIndex();         

        //Projeto da Tarefa   
        Projeto p = (Projeto) projetosModel.get(projetoId);//pega o projeto selecionado e guarda na vari?vel p

        //guarda o id da linha que voc? clicar na tabela 
        int idLinha = jTableTarefas.rowAtPoint(evt.getPoint());
        //guarda o id da coluna que voc? clicar na tabela 
        int idColuna = jTableTarefas.columnAtPoint(evt.getPoint());
        Tarefa t = tarefasModel.getListaTarefas().get(idLinha);//pega a tarefa na lista de tarefas na linha e coluna clicada
        switch (idColuna) {
            //coluna 3 onde se encontra o check de completad que quero salvar par ao banco de dados
            case 3:
                tc.update(t);//atualiza a modifi??o(foi completada do check) no banco de dados
                break;
            case 4:
                TarefaDialogScreen tds = new TarefaDialogScreen(this, rootPaneCheckingEnabled);
                tds.setIdTarefa(t.getId());// seta o id da tarefa na tds criada
                tds.carregaDadosTarefa(t, projetoId); //carrega os dados da tarefa na tds criada
                tds.setProjeto(p);// seta o projeto que a tarefa pertence na tds criada
                tds.setUpdate(true);//habilita o update de tarefa na tds
               tds.setVisible(true);
               loadTarefas(p.getId());//atualiza as tarefas  
                break;
            case 5:
                tc.removeById(t.getId());//remove a tarefa
                tarefasModel.getListaTarefas().remove(t);//remove a tarefa

                
                loadTarefas(p.getId());//atualiza 

                break;
        }
    }//GEN-LAST:event_jTableTarefasMouseClicked

    private void jlistListaProjetosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistListaProjetosMouseClicked
        int projetoId = jlistListaProjetos.getSelectedIndex();//pega o id do Projeto selecionado 
        Projeto p = (Projeto) projetosModel.get(projetoId);//pega o projeto selecionado e guarda na vari?vel p
        loadTarefas(p.getId());//pega id do projeto selecionado e seta no m?todo
    }//GEN-LAST:event_jlistListaProjetosMouseClicked

    public void mostraTabelaTarefas(boolean temTarefa) {
        if (temTarefa) {//se tem Tarefa na tabela
            if (jpListaVazia.isVisible()) {// se jpListaVazia estiver vis?vel
                jpListaVazia.setVisible(false);//oculte jpListaVazia
                jPanel5.remove(jpListaVazia);//remova jpListaVazia
            }
            jPanel5.add(jScrollPaneTarefa);// adicione a tabela de tarefas
            jScrollPaneTarefa.setVisible(true);// a torne vis?vel 
            jScrollPaneTarefa.setSize(jPanel5.getWidth(), jPanel5.getHeight());//sete a tebela com o mesmo 
            //tamannho do jPanel5

        } else {
            if (jScrollPaneTarefa.isVisible()) {// se a tabela de tarefas estive vis?vel 
                jScrollPaneTarefa.setVisible(false);//oculte ela 
                jPanel5.remove(jScrollPaneTarefa);// remova ela 
            }
            jPanel5.add(jpListaVazia);//adicione jpListaVazia no Panel5
            jpListaVazia.setVisible(true);//a torne vis?vel 
            jpListaVazia.setSize(jPanel5.getWidth(), jPanel5.getHeight());//set a jpListaVazia com o tamanho 
            // do jPanel5

        }
    }

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneTarefa;
    private javax.swing.JTable jTableTarefas;
    private javax.swing.JLabel jlAddProjeto;
    private javax.swing.JLabel jlAddTarefa;
    private javax.swing.JLabel jlListaTarefasIcon;
    private javax.swing.JLabel jlListaTarefasSubTitle;
    private javax.swing.JLabel jlListaTarefasTitle;
    private javax.swing.JList<String> jlistListaProjetos;
    private javax.swing.JPanel jpListaVazia;
    // End of variables declaration//GEN-END:variables

    //muda o Look and Feel da Tabela de Tarefas 
    public void decorateTableTarefa() {
        jTableTarefas.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));//muda a fonte da Tabela 
        jTableTarefas.getTableHeader().setBackground(new Color(102, 102, 102));//muda a cor do fundo do t?tulos da tabela     
        jTableTarefas.getTableHeader().setForeground(new Color(255, 255, 255));//muda a cor da frente da tabela 
        jTableTarefas.setAutoCreateRowSorter(true);//permite ordenar os campor por ordem alfab?tica 
        
        jTableTarefas.getColumnModel()//pega o model da coluna na Tabela
                .getColumn(2)//na posic?o 2, ou seja, 3? coluna---> Prazo
                .setCellRenderer(new RenderizadorColunaPrazo());// e pinto a celula de verde ou vermelha de acordo como Prazo

        //carrega o bot?o "edit" nas celulas da coluna "Editar" da tabela
        jTableTarefas.getColumnModel().getColumn(4).setCellRenderer(new RenderizadorBotaoColunaCelula("edit"));
        //carrega o bot?o "delete" nas celulas da coluna "Excluir" da tabela 
        jTableTarefas.getColumnModel().getColumn(5).setCellRenderer(new RenderizadorBotaoColunaCelula("delete"));
    }

    //Inst?ncia os controladores de dados
    public void initDataController() {
        this.pc = new ProjetoController();
        this.tc = new TarefaController();
    }

    public void initComponentsModel() {
        projetosModel = new DefaultListModel();
        loadProjetos();
        tarefasModel = new TarefaTableModel();
        jTableTarefas.setModel(tarefasModel);

        // if (!projetosModel.isEmpty()) {//se tiver projetos carregados do banco
        //  jlistListaProjetos.setSelectedIndex(0);//seleciona o primeiro projeto da lista
        //  Projeto p = (Projeto) projetosModel.get(0);// pega o index do Projeto 
        // loadTarefas(p.getId());// passa o index para ser carredados as tarefas 
        //}
    }
    
    public void initProjetosModel() {
        if (!projetosModel.isEmpty()) {//se tiver projetos carregados do banco
          jlistListaProjetos.setSelectedIndex(0);//seleciona o primeiro projeto da lista
          Projeto p = (Projeto) projetosModel.get(0);// pega o index do Projeto 
         loadTarefas(p.getId());// passa o index para ser carredados as tarefas 
        }
    }

    public void loadTarefas(int idProjetos) {

        List<Tarefa> listaTarefas = tc.getAll(idProjetos);

        tarefasModel.setListaTarefas(null);

        mostraTabelaTarefas(!listaTarefas.isEmpty());//"!" represente a nega??o, no caso ali
        //est? perguntando se a lista n?o est?o vazia 
        tarefasModel.setListaTarefas(listaTarefas);

    }

    public void loadProjetos() {
        //Pega a lista de projetos do banco de dados
        List<Projeto> projetos = pc.getAll();

        projetosModel.clear();//limpa e preparar a lista pra recebe os projetos do banco

        //fica no la?o at? i < que tamanho da lista, pois o index do java come?a em 0, por isso -1 
        for (int i = 0; i < projetos.size(); i++) {
            Projeto p = projetos.get(i);//pega o projeto na posi??o i
            projetosModel.addElement(p);//e adiciona na lista 
        }
        //pega a lista de projetos do banco e seta no Jlist da Interface 
        jlistListaProjetos.setModel(projetosModel);
    }

}
