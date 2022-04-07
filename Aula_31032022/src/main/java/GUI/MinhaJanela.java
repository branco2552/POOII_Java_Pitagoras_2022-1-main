/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import Classes.Calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Enza Rafaela
 *modified by Bryan Cropalato
 */
public class MinhaJanela extends javax.swing.JFrame {
    Calculadora minhaCalculadora = new Calculadora();

    /**
     * Creates new form MinhaJanela
     */
    public MinhaJanela() {
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

        jMeuPainel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jEntrada1 = new javax.swing.JTextField();
        jEntrada2 = new javax.swing.JTextField();
        jSomar = new javax.swing.JButton();
        jResultado = new javax.swing.JLabel();
        jMultiplica = new javax.swing.JButton();
        jSubitrai = new javax.swing.JButton();
        jDivide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMeuPainel.setBackground(new java.awt.Color(255, 255, 255));

        jSomar.setText("+");
        jSomar.setToolTipText("");
        jSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSomarActionPerformed(evt);
            }
        });

        jMultiplica.setText("*");
        jMultiplica.setToolTipText("");
        jMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMultiplicaActionPerformed(evt);
            }
        });

        jSubitrai.setText("-");
        jSubitrai.setToolTipText("");
        jSubitrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubitraiActionPerformed(evt);
            }
        });

        jDivide.setText("/");
        jDivide.setToolTipText("");
        jDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDivideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMeuPainelLayout = new javax.swing.GroupLayout(jMeuPainel);
        jMeuPainel.setLayout(jMeuPainelLayout);
        jMeuPainelLayout.setHorizontalGroup(
            jMeuPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMeuPainelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jMeuPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEntrada2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEntrada1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jMeuPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMeuPainelLayout.createSequentialGroup()
                        .addComponent(jMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMeuPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jMeuPainelLayout.createSequentialGroup()
                            .addComponent(jSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jSubitrai, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jMeuPainelLayout.setVerticalGroup(
            jMeuPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMeuPainelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jMeuPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jResultado)
                    .addComponent(jSubitrai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jMeuPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMeuPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMeuPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void jSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSomarActionPerformed
       int entradaA, entradaB;

       entradaA = Integer.parseInt(jEntrada1.getText());
       entradaB = Integer.parseInt(jEntrada2.getText());

       int resultado = minhaCalculadora.SomarNumeros(entradaA, entradaB);
       jResultado.setText(Integer.toString(resultado));
    }//GEN-LAST:event_jSomarActionPerformed

    private void jMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMultiplicaActionPerformed
      int entradaA, entradaB;

      entradaA = Integer.parseInt(jEntrada1.getText());
      entradaB = Integer.parseInt(jEntrada2.getText());

      int resultado = minhaCalculadora.MultiplicarNumeros(entradaA, entradaB);
      jResultado.setText(Integer.toString(resultado));
    }//GEN-LAST:event_jMultiplicaActionPerformed

    private void SubitraiNumeros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubitraiActionPerformed
      int entradaA, entradaB;

      entradaA = Integer.parseInt(jEntrada1.getText());
      entradaB = Integer.parseInt(jEntrada2.getText());

      int resultado = minhaCalculadora.SubitraiNumeros(entradaA, entradaB);
      jResultado.setText(Integer.toString(resultado));
    }//GEN-LAST:event_jSubitraiActionPerformed

    private void jDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDivideActionPerformed
      int entradaA, entradaB;

      entradaA = Integer.parseInt(jEntrada1.getText());
      entradaB = Integer.parseInt(jEntrada2.getText());

      int resultado = minhaCalculadora.DividirNumeros(entradaA, entradaB);
      jResultado.setText(Integer.toString(resultado));
    }//GEN-LAST:event_jDivideActionPerformed

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
            java.util.logging.Logger.getLogger(MinhaJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinhaJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinhaJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinhaJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinhaJanela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDivide;
    private javax.swing.JTextField jEntrada1;
    private javax.swing.JTextField jEntrada2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jMeuPainel;
    private javax.swing.JButton jMultiplica;
    private javax.swing.JLabel jResultado;
    private javax.swing.JButton jSomar;
    private javax.swing.JButton jSubitrai;
    // End of variables declaration//GEN-END:variables
}
