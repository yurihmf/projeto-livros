/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

import javax.swing.JOptionPane;

/**
 *
 * @author Yuri
 */
public class JanelaPrincipal extends javax.swing.JFrame {
    
    private LinkedList fila = new LinkedList();
    private LinkedList fila2002 = new LinkedList();
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textAP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textE = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        fila2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        print = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Título:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Autor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ano de publicação:");

        textAP.setToolTipText("");
        textAP.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Editora:");

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar um Livro");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        mostrar.setText("Mostrar todos");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        fila2.setText("Livros de 2002");
        fila2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fila2ActionPerformed(evt);
            }
        });

        print.setColumns(20);
        print.setLineWrap(true);
        print.setRows(5);
        jScrollPane1.setViewportView(print);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(eliminar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cadastrar)
                                    .addComponent(textA, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(textT)
                                    .addComponent(textAP)
                                    .addComponent(textE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fila2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cadastrar)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(mostrar)
                    .addComponent(fila2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fila2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fila2ActionPerformed
        if(!fila.isEmpty()){
            for(int i=0;i<fila.size();i++){
                int anoPublicacao = 2002;
                Livro ltemp2 = (Livro) fila.peekFirst();
                if(anoPublicacao == ltemp2.getAnoPub()){
                    fila2002.addLast(ltemp2);
                }
                fila.addLast(ltemp2);
                fila.removeFirst();
            }

            if(!fila2002.isEmpty()){
                print.setText(fila2002.toString());
                fila2002.clear();
            }else {
                JOptionPane.showMessageDialog(null, "A fila está vazia, esta opção não será executada.", "Fila vazia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "A fila está vazia, esta opção não será executada.", "Fila vazia", JOptionPane.WARNING_MESSAGE);
            print.setText("");
        }
    }//GEN-LAST:event_fila2ActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        if (!fila.isEmpty()) {
            print.setText(fila.toString());
        } else {
            JOptionPane.showMessageDialog(null, "A fila está vazia, esta opção não será executada.", "Fila vazia", JOptionPane.WARNING_MESSAGE);
            print.setText("");
        }
    }//GEN-LAST:event_mostrarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (!fila.isEmpty()) {
            Livro ltemp = (Livro) fila.peekFirst();
            print.setText("Livro eliminado: \n" + ltemp.toString());
            fila.removeFirst();
        } else {
            JOptionPane.showMessageDialog(null, "A fila está vazia, esta opção não será executada.", "Fila vazia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed

        String titu = textT.getText();
        String aut = textA.getText();
//        String anop = textAP.getText();
        int anop = Integer.parseInt(textAP.getText().trim());
        String edi = textE.getText();
        
        Livro livro = new Livro(titu, aut, anop, edi);
        fila.addLast(livro);

        JOptionPane.showMessageDialog(null, "Cadastro com sucesso", "Livro cadastrado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
        textT.setText(" ");
        textA.setText(" ");
        textAP.setText(" ");
        textE.setText(" ");
        
//        if(titu.isEmpty() | aut.isEmpty() | anop.isEmpty() | edi.isEmpty()){;
//            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!", "Campos incorretos", JOptionPane.WARNING_MESSAGE);
//            titu = "";
//            aut = "";
//            anop = "";
//            edi = "";
//        } else {
//            boolean integerOrNot = anop.matches("-?\\d+");
//            if(integerOrNot){
//                int anoPub = Integer.parseInt(anop);
//            Livro livro = new Livro(titu, aut, anoPub, edi);
//            fila.addLast(livro);
//
//            JOptionPane.showMessageDialog(null, "Cadastro com sucesso", "Livro cadastrado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
//            textT.setText(" ");
//            textA.setText(" ");
//            textAP.setText(" ");
//            textE.setText(" ");
//            } else {
//                JOptionPane.showMessageDialog(null, "O campo 'Ano de publicação' precisa ser um número", "Campo inválido", JOptionPane.WARNING_MESSAGE);
//                titu = "";
//                aut = "";
//                anop = "";
//                edi = "";
//            }
//        }
    }//GEN-LAST:event_cadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton fila2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextArea print;
    private javax.swing.JTextField textA;
    private javax.swing.JTextField textAP;
    private javax.swing.JTextField textE;
    private javax.swing.JTextField textT;
    // End of variables declaration//GEN-END:variables
}
