/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domogui;

import dispositivos.Sensor;
import fnArchivo.archivo;
import funciones.Validacion;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class frmInSensor extends javax.swing.JFrame {

    /**
     * Creates new form frmInSensor
     */
    public frmInSensor() {
        initComponents();
        
        //configurando imagen en etiqueta
        try{
            BufferedImage sicon = ImageIO.read(new File("imgsp/sens_icon.png"));
            lbSensorIcon.setIcon(new ImageIcon(sicon));
        }catch (Exception e){
            
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbSensorValarm = new javax.swing.JLabel();
        tfSensorId = new javax.swing.JTextField();
        tfSensorNom = new javax.swing.JTextField();
        tfSensorModel = new javax.swing.JTextField();
        tfSensorFab = new javax.swing.JTextField();
        tfSensorTipo = new javax.swing.JTextField();
        tfSensorDes = new javax.swing.JTextField();
        tfSensorVact = new javax.swing.JTextField();
        tfValAlarm = new javax.swing.JTextField();
        cbSensorUbi = new javax.swing.JComboBox();
        lbSensorIcon = new javax.swing.JLabel();
        btSensLimpiar = new javax.swing.JButton();
        btSensIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de Sensores");

        jLabel1.setText("Id:");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabel2.setText("Nombre:");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabel3.setText("Ubicación:");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabel4.setText("Modelo:");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabel5.setText("Fabricante:");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabel6.setText("Tipo:");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabel7.setText("Descripción:");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabel8.setText("Valor Actual:");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 15));

        lbSensorValarm.setText("Valor Alarma:");
        lbSensorValarm.setPreferredSize(new java.awt.Dimension(100, 15));

        tfSensorId.setPreferredSize(new java.awt.Dimension(120, 27));

        tfSensorNom.setPreferredSize(new java.awt.Dimension(120, 27));
        tfSensorNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSensorNomActionPerformed(evt);
            }
        });

        tfSensorModel.setPreferredSize(new java.awt.Dimension(120, 27));

        tfSensorFab.setPreferredSize(new java.awt.Dimension(120, 27));

        tfSensorTipo.setPreferredSize(new java.awt.Dimension(120, 27));

        tfSensorDes.setPreferredSize(new java.awt.Dimension(120, 27));

        tfSensorVact.setPreferredSize(new java.awt.Dimension(120, 27));

        tfValAlarm.setPreferredSize(new java.awt.Dimension(120, 27));

        cbSensorUbi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dormitorio", "Sala", "Baño", "Cocina/Comedor" }));
        cbSensorUbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSensorUbiActionPerformed(evt);
            }
        });

        btSensLimpiar.setText("Limpiar");
        btSensLimpiar.setPreferredSize(new java.awt.Dimension(75, 30));
        btSensLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSensLimpiarActionPerformed(evt);
            }
        });

        btSensIngresar.setText("Ingresar");
        btSensIngresar.setPreferredSize(new java.awt.Dimension(75, 30));
        btSensIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSensIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbSensorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btSensIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSensLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSensorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSensorNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSensorUbi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSensorModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSensorFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSensorTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSensorDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSensorVact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSensorValarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfValAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSensorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSensorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSensorNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSensorUbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSensorModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSensorFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSensorTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfSensorDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSensorVact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSensorValarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSensLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSensIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSensorNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSensorNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSensorNomActionPerformed

    private void cbSensorUbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSensorUbiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSensorUbiActionPerformed

    private void btSensLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSensLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarFormularioS();
    }//GEN-LAST:event_btSensLimpiarActionPerformed

    private void btSensIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSensIngresarActionPerformed
        // TODO add your handling code here:
        
        if(formularioValidoS()){
            String id       = tfSensorId.getText();
            String nombre   = tfSensorNom.getText();
            String ubic     = cbSensorUbi.getSelectedItem().toString();
            String model    = tfSensorModel.getText();
            String fabrica  = tfSensorFab.getText();
            String tipo     = tfSensorTipo.getText();
            String descripcion = tfSensorDes.getText();
            int valact   = Integer.parseInt(tfSensorVact.getText());
            int valala = Integer.parseInt(tfValAlarm.getText());
            Sensor s = new Sensor(id, nombre, ubic, model, fabrica, tipo, descripcion, valact, valala);
            if(archivo.insert_registroS(s)){
                JOptionPane.showMessageDialog(this,"Se ingresó correctamente el Sensor", "Ingreso",JOptionPane.INFORMATION_MESSAGE);            
                limpiarFormularioS();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this,"Ocurrió un error en el ingreso", "Error",JOptionPane.ERROR_MESSAGE);            
            }
        }
    }//GEN-LAST:event_btSensIngresarActionPerformed

    private void limpiarFormularioS(){
        tfSensorId.setText("");
        tfSensorNom.setText("");
        tfSensorModel.setText("");
        tfSensorFab.setText("");
        tfSensorTipo.setText("");
        tfSensorDes.setText("");
        tfSensorVact.setText("");
        lbSensorValarm.setText("");
    }
    
    private boolean formularioValidoS(){
        if(tfSensorId.getText().equals("") ||
           tfSensorNom.getText().equals("") ||
           tfSensorModel.getText().equals("") ||
           tfSensorFab.getText().equals("") ||
            tfSensorTipo.getText().equals("") ||
            tfSensorDes.getText().equals("") ||
            tfSensorVact.getText().equals("") ||
            lbSensorValarm.getText().equals("")
                ){
            JOptionPane.showMessageDialog(this, "Formulario incompleto","Validación",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try{
            Integer.parseInt(tfSensorId.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "El Id debe ser un número","Validación",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try{
            ArrayList<Sensor> registros = archivo.obtener_registroS();
            if(Validacion.verDupliIdSensor(registros,tfSensorId.getText())){
                JOptionPane.showMessageDialog(this, "El id se encuentra registrado","Validación",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }catch(Exception e){
            return false;
        }
        
        return true;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSensIngresar;
    private javax.swing.JButton btSensLimpiar;
    private javax.swing.JComboBox cbSensorUbi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbSensorIcon;
    private javax.swing.JLabel lbSensorValarm;
    private javax.swing.JTextField tfSensorDes;
    private javax.swing.JTextField tfSensorFab;
    private javax.swing.JTextField tfSensorId;
    private javax.swing.JTextField tfSensorModel;
    private javax.swing.JTextField tfSensorNom;
    private javax.swing.JTextField tfSensorTipo;
    private javax.swing.JTextField tfSensorVact;
    private javax.swing.JTextField tfValAlarm;
    // End of variables declaration//GEN-END:variables
}
