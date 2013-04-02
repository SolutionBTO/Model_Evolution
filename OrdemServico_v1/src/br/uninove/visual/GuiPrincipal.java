/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GuiPrincipal.java
 *
 * Created on 29/03/2013, 13:34:20
 */
package br.uninove.visual;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Silva
 */
public class GuiPrincipal extends javax.swing.JFrame {

    /** Creates new form GuiPrincipal */
    public GuiPrincipal() {
        initComponents();
    }

    private GuiSobre guiSobre;
    private GuiOS guiOS;
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuApoio = new javax.swing.JMenu();
        mnuItemSobre = new javax.swing.JMenuItem();
        mnuItemManual = new javax.swing.JMenuItem();
        mnuItemSair = new javax.swing.JMenuItem();
        mnuLancamento = new javax.swing.JMenu();
        mnuItemOS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 255));

        mnuApoio.setMnemonic('f');
        mnuApoio.setText("Apoio");

        mnuItemSobre.setText("Sobre...");
        mnuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemSobreActionPerformed(evt);
            }
        });
        mnuApoio.add(mnuItemSobre);

        mnuItemManual.setMnemonic('s');
        mnuItemManual.setText("Manual");
        mnuItemManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemManualActionPerformed(evt);
            }
        });
        mnuApoio.add(mnuItemManual);

        mnuItemSair.setMnemonic('x');
        mnuItemSair.setText("Sair");
        mnuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemSairActionPerformed(evt);
            }
        });
        mnuApoio.add(mnuItemSair);

        menuBar.add(mnuApoio);

        mnuLancamento.setMnemonic('e');
        mnuLancamento.setText("Lan�amento");

        mnuItemOS.setMnemonic('t');
        mnuItemOS.setText("Ordem de Servi�o");
        mnuItemOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemOSActionPerformed(evt);
            }
        });
        mnuLancamento.add(mnuItemOS);

        menuBar.add(mnuLancamento);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemSairActionPerformed
        //sair
        System.exit(0);
    }//GEN-LAST:event_mnuItemSairActionPerformed

    private void mnuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemSobreActionPerformed
        //verifico se o formulario j� n�o est� instanciado ou n�o visivel
        if ((guiSobre == null) || (!guiSobre.isVisible())) {
            //instancio GuiSobre
            guiSobre = new GuiSobre();
            //add ao GuiPrincipal, ser� como um filho
            desktopPane.add(guiSobre);
            //centralizo
            guiSobre.setPosicao();
            //seto p/visivel
            guiSobre.setVisible(true);
        }
    }//GEN-LAST:event_mnuItemSobreActionPerformed

    private void mnuItemOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemOSActionPerformed
        //verifico se o formulario j� n�o est� instanciado ou n�o visivel
        if ((guiOS == null) || (!guiOS.isVisible())) {
            //instancio GuiOS
            guiOS = new GuiOS();
            //add ao GuiPrincipal, ser� como um filho
            desktopPane.add(guiOS);
            //centralizo
            guiOS.setPosicao();
            //seto p/visivel
            guiOS.setVisible(true);
        }
    }//GEN-LAST:event_mnuItemOSActionPerformed

    private void mnuItemManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemManualActionPerformed
        File pdf = new File(new File("").getAbsolutePath() + "/Manual_os.pdf");
        try {
            Desktop.getDesktop().open(pdf);
        } catch (Exception ex) {
            ex.printStackTrace();
             JOptionPane.showMessageDialog(null, 
                       "Ocorreu um erro, causa: "+ex.getMessage(),
                       "Ordem de Servi�o",
                       JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mnuItemManualActionPerformed
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
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GuiPrincipal guiPrincipal=new GuiPrincipal();
                //Maximiza o formulario
                guiPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
                //setar titulo do formulario
                guiPrincipal.setTitle("Sistema Ordem de Servi�o T.I");
                //visualiza o formulario
                guiPrincipal.setVisible(true);
                //setar p/n�o redimensionar, isso deve ser feito depois que fica visivel
                guiPrincipal.setResizable(false);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuApoio;
    private javax.swing.JMenuItem mnuItemManual;
    private javax.swing.JMenuItem mnuItemOS;
    private javax.swing.JMenuItem mnuItemSair;
    private javax.swing.JMenuItem mnuItemSobre;
    private javax.swing.JMenu mnuLancamento;
    // End of variables declaration//GEN-END:variables
}
