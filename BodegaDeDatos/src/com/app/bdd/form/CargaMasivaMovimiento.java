/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.form;

//import com.app.utils.LeerArchivoDeExcel;
import com.app.bdd.controller.MovimientoController;
import com.app.bdd.controller.NomonetariasController;
import static com.app.bdd.controller.NomonetariasController.LeerArchivoNoMonetariasTxt;
import static com.app.bdd.controller.NomonetariasController.NomonetariasController;
import com.app.bdd.controller.SaldosController;
import static com.app.bdd.controller.SaldosController.LeerArchivoSaldosTxt;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author win
 */
public class CargaMasivaMovimiento extends javax.swing.JFrame {

//    Cargando c = new Cargando();
    
    /**
     * Creates new form CargaMasivaUsuario
     *
     * @throws java.lang.Exception
     */
    public CargaMasivaMovimiento() throws Exception {
        initComponents();

        init();
    }

//    public Cargando getC() {
//        return c;
//    }
//
//    public void setC(Cargando c) {
//        this.c = c;
//    }
    
    

    public void init() throws Exception {

        lPath.setVisible(false);
//        List<Area_TO> areas = new ArrayList<>();
//        AreaController areaController = new AreaController();
//        areas = areaController.consultarArea();
        jComboBox1.addItem("Seleccione");
        jComboBox1.addItem("0 - Movimiento");
        jComboBox1.addItem("1 - No Monetarios");
        jComboBox1.addItem("2 - Saldos");
        
        

//        for (int i = 0; i < areas.size(); i++) {
//            jComboBox1.addItem(areas.get(i).getIdArea() + " - " + areas.get(i).getArea());
//        }
    }

//    public void Conteo(String valor, String total) {
//        this.jL_cargando.setText("Cargando " + valor + "/" + total);
//    }

    public void SeleccionArchivo() {

        JFrame vn = new JFrame("Selccion de Archivo");
        vn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFileChooser se = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("TXT", "txt");
        se.setFileFilter(filtro);

        JLabel ruta = new JLabel("");
        JLabel nombreArchivo = new JLabel("");

        se.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser tmp = (JFileChooser) e.getSource();
                String comando = e.getActionCommand();

                if (comando.equals(JFileChooser.APPROVE_SELECTION)) {

                    File archivoSeleccionado = tmp.getSelectedFile();
                    ruta.setText(archivoSeleccionado.getAbsolutePath());
                    nombreArchivo.setText(archivoSeleccionado.getName());
                    lPath.setText(archivoSeleccionado.getAbsolutePath());
                    l_nombre.setText(archivoSeleccionado.getName());

                    String[] forms = archivoSeleccionado.getName().split("\\.");
                    String formato1 = forms[0];
                    String formato = forms[1];

                    if (!(formato.equals("txt")) && !(formato.equals("TXT"))) {
                        lPath.setText("");
                        l_nombre.setText("");
                        bAceptar.setEnabled(false);

                        JOptionPane.showMessageDialog(null, "Formato Incorrecto");

                        //Formato Incorrecto
                    } else {
                        bAceptar.setEnabled(true);
                        vn.setVisible(false);
                    }

//                    MovimientoController lae = new MovimientoController();
//                            try {
//                                lae.(ruta.getText());
//                            } catch (IOException ex) {
//                                Logger.getLogger(CargaMasivaUsuario.class.getName()).log(Level.SEVERE, null, ex);
//                            }
                } else if (comando.equals(JFileChooser.CANCEL_SELECTION)) {
                    ruta.setText("");
                    nombreArchivo.setText("");
                    lPath.setText("");
                    l_nombre.setText("");

                    bAceptar.setEnabled(false);
                    vn.setVisible(false);

                }
            }
        });

        vn.add(ruta, BorderLayout.SOUTH);
        vn.add(se, BorderLayout.CENTER);
        vn.add(nombreArchivo, BorderLayout.NORTH);
        vn.pack();
        vn.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lPath = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        l_nombre = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Carga Masiva de Archivos");

        jLabel2.setText("Seleccione el Archivo: ");

        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Examinar.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Aceptar1.png"))); // NOI18N
        bAceptar.setToolTipText("");
        bAceptar.setBorderPainted(false);
        bAceptar.setContentAreaFilled(false);
        bAceptar.setEnabled(false);
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione tipo de Archivo");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoBodegadeDatos.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lPath, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAceptar))
                    .addComponent(lPath, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//       jDialog1.setVisible(true);
        SeleccionArchivo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed

      
                int valor = 0;

                int idArchivo = 0;
    try {
                String idArchivoS = (String) jComboBox1.getSelectedItem();

                if (idArchivoS.equals("") || idArchivoS.equals("Seleccione")) {
                    idArchivo = 0;

                } else {
                    String[] idArechivoA = idArchivoS.split(" - ");
                    idArchivo = Integer.parseInt(idArechivoA[0]);

                }
                if (idArchivo == 0) {
//                JOptionPane.showMessageDialog(null, "Por favor espere" );
                    MovimientoController mc = new MovimientoController();
                    valor = mc.LeerArchivoMovimiento(lPath.getText());
                } else {
//                JOptionPane.showMessageDialog(null, "Por favor espere" );
                    if (idArchivo == 1) {
                        NomonetariasController n = new NomonetariasController();
                        valor = n.LeerArchivoNo(lPath.getText());

                    } else {
//                    JOptionPane.showMessageDialog(null, "Por favor espere" );
                        SaldosController s = new SaldosController();
                        valor = s.LeerArchivoSaldo(lPath.getText());
                    }

                }

                if (valor > 0) {
                    

                    l_nombre.setText("");
                    bAceptar.setEnabled(false);
                    jComboBox1.setSelectedIndex(0);
//                     c.setVisible(false);

                }

//            }

        } catch (Exception ex) {
            Logger.getLogger(CargaMasivaMovimiento.class.getName()).log(Level.SEVERE, null, ex);
           // JOptionPane.showMessageDialog(null, ex);
//              c.setVisible(false);
//              c.dispose();
           
        }

    }//GEN-LAST:event_bAceptarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CargaMasivaMovimiento().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(CargaMasivaMovimiento.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
    
//    public void cambioEstado(){
//    
//    
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lPath;
    private javax.swing.JLabel l_nombre;
    // End of variables declaration//GEN-END:variables
}
