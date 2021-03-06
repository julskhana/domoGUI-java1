/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domogui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        m1Salir = new javax.swing.JMenuItem();
        mMant = new javax.swing.JMenu();
        miActuadores = new javax.swing.JMenuItem();
        miSensores = new javax.swing.JMenuItem();
        miDashB = new javax.swing.JMenuItem();
        mAcercaDe = new javax.swing.JMenu();
        miInfo = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Java - Domótica");

        mArchivo.setText("Archivo");

        m1Salir.setText("Salir");
        m1Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1SalirActionPerformed(evt);
            }
        });
        mArchivo.add(m1Salir);

        jMenuBar1.add(mArchivo);

        mMant.setText("Dispositivos");

        miActuadores.setText("Actuadores");
        miActuadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActuadoresActionPerformed(evt);
            }
        });
        mMant.add(miActuadores);

        miSensores.setText("Sensores");
        miSensores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSensoresActionPerformed(evt);
            }
        });
        mMant.add(miSensores);

        miDashB.setText("DashBoard");
        miDashB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDashBActionPerformed(evt);
            }
        });
        mMant.add(miDashB);

        jMenuBar1.add(mMant);

        mAcercaDe.setText("Acerca de...");

        miInfo.setText("Información");
        miInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInfoActionPerformed(evt);
            }
        });
        mAcercaDe.add(miInfo);

        jMenuBar1.add(mAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m1SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1SalirActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(this, "Está seguro de finalizar la aplicación?","Salir",JOptionPane.YES_NO_OPTION);
        if(op==0)
            System.exit(0);
    }//GEN-LAST:event_m1SalirActionPerformed

    private void miInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInfoActionPerformed
        // TODO add your handling code here:
        AcercaDe info = new AcercaDe();
        info.setVisible(true);
        
    }//GEN-LAST:event_miInfoActionPerformed

    private void miActuadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActuadoresActionPerformed
        // TODO add your handling code here:
        frmDispAct dispAct = new frmDispAct();
        dispAct.setVisible(true);
        
    }//GEN-LAST:event_miActuadoresActionPerformed

    private void miSensoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSensoresActionPerformed
        // TODO add your handling code here:
        frmDispSensor1 dispSens = new frmDispSensor1();
        dispSens.setVisible(true);
    }//GEN-LAST:event_miSensoresActionPerformed

    private void miDashBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDashBActionPerformed
        try {
            // TODO add your handling code here:
            Dashboard instrumentos = new Dashboard();
            instrumentos.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miDashBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem m1Salir;
    private javax.swing.JMenu mAcercaDe;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mMant;
    private javax.swing.JMenuItem miActuadores;
    private javax.swing.JMenuItem miDashB;
    private javax.swing.JMenuItem miInfo;
    private javax.swing.JMenuItem miSensores;
    // End of variables declaration//GEN-END:variables
}
