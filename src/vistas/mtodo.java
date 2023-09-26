/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.MateriaData;
import entidades.Materia;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mtodo extends javax.swing.JInternalFrame {

    MateriaData mData = new MateriaData();
    Materia mat = new Materia();
    DefaultTableModel tablita = new DefaultTableModel();

    public mtodo() {
        initComponents();
        cabecera();
        jBmodifi.setEnabled(false);
        jBeliminar.setEnabled(false);
        jRinac.setEnabled(false);
        jRactivo.setEnabled(false);
        jTaño1.setEnabled(false);
        jTnombre1.setEnabled(false);
        jTid.setEnabled(false);
        // jTid.setEnabled(false);
        jTid.setEditable(false);

    }

    public void mostrar() {

        for (Materia mat : mData.listarMaterias()) {
            String estado = mat.isActivo() ? "Activa" : "Inactiva"; // Convierte true en "Activas" y false en "Inactivas"
            tablita.addRow(new Object[]{
                mat.getIdMateria(), mat.getNombre(), mat.getAñoMateria(), estado
            });
        }
    }


    public void mostrarf() {

        for (Materia mat : mData.listarMateriasf()) {
            String estado = mat.isActivo() ? "Activa" : "Inactiva"; // Convierte true en "Activas" y false en "Inactivas"
            tablita.addRow(new Object[]{
                mat.getIdMateria(), mat.getNombre(), mat.getAñoMateria(), estado
            });
        }

    }

    public void mostrart() {

        for (Materia mat : mData.listarMateriast()) {
            String estado = mat.isActivo() ? "Activa" : "Inactiva"; // Convierte true en "Activas" y false en "Inactivas"
            tablita.addRow(new Object[]{
                mat.getIdMateria(), mat.getNombre(), mat.getAñoMateria(), estado
            });
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

        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Iconos/resumen-degradado-negro-lujo-fondo-negro-vignette-backgr.jpg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jBtodas = new javax.swing.JButton();
        jTaño = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTid = new javax.swing.JTextField();
        jLnombre = new javax.swing.JLabel();
        jLnombre1 = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jRinac = new javax.swing.JRadioButton();
        jLaño = new javax.swing.JLabel();
        jLmodifi = new javax.swing.JLabel();
        jLaño1 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTvisor = new javax.swing.JTable();
        jBmodifi = new javax.swing.JButton();
        jBinac = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar1 = new javax.swing.JButton();
        jTnombre1 = new javax.swing.JTextField();
        jTaño1 = new javax.swing.JTextField();
        jBactivas = new javax.swing.JButton();
        jLestado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRactivo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1045, 500));

        jBtodas.setText("Todas");
        jBtodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtodasActionPerformed(evt);
            }
        });

        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });

        jLnombre.setBackground(new java.awt.Color(255, 255, 255));
        jLnombre.setForeground(new java.awt.Color(255, 255, 255));
        jLnombre.setText("Nombre");

        jLnombre1.setBackground(new java.awt.Color(255, 255, 255));
        jLnombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLnombre1.setText("Nombre");

        jLid.setBackground(new java.awt.Color(255, 255, 255));
        jLid.setForeground(new java.awt.Color(255, 255, 255));
        jLid.setText("Id");

        jRinac.setBackground(new java.awt.Color(255, 255, 255));
        jRinac.setForeground(new java.awt.Color(255, 255, 255));
        jRinac.setText("inactivo");

        jLaño.setBackground(new java.awt.Color(255, 255, 255));
        jLaño.setForeground(new java.awt.Color(255, 255, 255));
        jLaño.setText("Año");

        jLmodifi.setBackground(new java.awt.Color(255, 255, 255));
        jLmodifi.setForeground(new java.awt.Color(255, 255, 255));
        jLmodifi.setText("Modificar Materia");

        jLaño1.setBackground(new java.awt.Color(255, 255, 255));
        jLaño1.setForeground(new java.awt.Color(255, 255, 255));
        jLaño1.setText("Año");

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jTvisor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTvisor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTvisorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTvisor);

        jBmodifi.setText("Modificar");
        jBmodifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodifiActionPerformed(evt);
            }
        });

        jBinac.setText("Inactivas");
        jBinac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinacActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar1.setText("Guardar");
        jBguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardar1ActionPerformed(evt);
            }
        });

        jTaño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTaño1ActionPerformed(evt);
            }
        });

        jBactivas.setText("Activas");
        jBactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactivasActionPerformed(evt);
            }
        });

        jLestado.setBackground(new java.awt.Color(255, 255, 255));
        jLestado.setForeground(new java.awt.Color(255, 255, 255));
        jLestado.setText("Estado");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Materia");

        jRactivo.setBackground(new java.awt.Color(255, 255, 255));
        jRactivo.setForeground(new java.awt.Color(255, 255, 255));
        jRactivo.setText("Activo");
        jRactivo.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Materias:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBguardar1)
                                .addGap(134, 134, 134)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLnombre1)
                                            .addComponent(jLaño1)
                                            .addComponent(jLid)
                                            .addComponent(jLestado))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTnombre1)
                                                .addComponent(jTaño1)
                                                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRactivo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jBeliminar)
                                                    .addComponent(jRinac)))))
                                    .addComponent(jBmodifi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBsalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLnombre)
                                            .addComponent(jLaño))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTnombre)
                                            .addComponent(jTaño, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(52, 52, 52)
                                .addComponent(jLmodifi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jBactivas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBinac)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtodas)
                        .addGap(82, 82, 82)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBactivas)
                            .addComponent(jBinac)
                            .addComponent(jBtodas)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLmodifi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnombre)
                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLnombre1)
                                .addComponent(jTnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLaño)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLaño1)
                                .addComponent(jTaño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLid)
                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLestado)
                            .addComponent(jRactivo)
                            .addComponent(jRinac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBmodifi)
                            .addComponent(jBeliminar)
                            .addComponent(jBguardar1)
                            .addComponent(jBsalir))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactivasActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        mostrar();
        jTnombre1.setText("");
        jTaño1.setText("");
        jTid.setText("");
        jRactivo.setSelected(false);
        jRinac.setSelected(false);
        jTaño1.setEnabled(false);
        jTnombre1.setEnabled(false);
        jTid.setEnabled(false);

    }//GEN-LAST:event_jBactivasActionPerformed

    private void jBtodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtodasActionPerformed
        // TODO add your handling code here:
limpiarTabla();
        mostrart();
        jTnombre1.setText("");
        jTaño1.setText("");
        jTid.setText("");
        jRactivo.setSelected(false);
        jRinac.setSelected(false);
        jTaño1.setEnabled(false);
        jTnombre1.setEnabled(false);
        jTid.setEnabled(false);


    }//GEN-LAST:event_jBtodasActionPerformed

    private void jBinacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinacActionPerformed
limpiarTabla();
        mostrarf();
        jTnombre1.setText("");
        jTaño1.setText("");
        jTid.setText("");// TODO add your handling code here:
        jRactivo.setSelected(false);
        jRinac.setSelected(false);
        jTaño1.setEnabled(false);
        jTnombre1.setEnabled(false);
        jTid.setEnabled(false);
    }//GEN-LAST:event_jBinacActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardar1ActionPerformed
        // TODO add your handling code here:
        try {
            if ((jTnombre.getText().equals("")) || (jTaño.getText().equals(""))) { //si el campo nombre o año estan vacios entra al if
                JOptionPane.showMessageDialog(this, "Hay campos vacios");//muestra el msj
            } else {
                mat.setNombre(jTnombre.getText());//asigna el nombre a la materia
                mat.setAñoMateria(Integer.parseInt(jTaño.getText()));//asigna el año a la materia
                mat.setActivo(true);//le asigna el valor true para que este activa
                mData.guardarMateria(mat);//ejecuta guardar materia
                jTaño.setText("");//deja el campo vacio
                jTnombre.setText("");//deja el campo vacio   
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese datos correctos");//si por ej escribe string en vez d int en año muestra el msj
        }

    }//GEN-LAST:event_jBguardar1ActionPerformed

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreActionPerformed

    private void jTaño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTaño1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTaño1ActionPerformed

    private void jBmodifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodifiActionPerformed
        // TODO add your handling code here:

        mat = mData.buscarMateria((int) tablita.getValueAt(jTvisor.getSelectedRow(), 0));

        String nNombre = jTnombre1.getText();
        int nAño = Integer.parseInt(jTaño1.getText());
        // Comparo los valores actuales con los nuevos valores.
        if (mat.getNombre().equals(nNombre) && mat.getAñoMateria() == nAño) {
            // No se realizaron cambios, muestra un mensaje de advertencia.
            JOptionPane.showMessageDialog(
                    null,
                    "No se realizaron cambios en la materia seleccionada.",
                    "Sin Cambios",
                    JOptionPane.WARNING_MESSAGE
            );
        } else {
            try {
                if ((jTnombre1.getText().equals("")) || (jTaño1.getText().equals(""))) { //si el campo nombre o año estan vacios entra al if
                    JOptionPane.showMessageDialog(this, "Hay campos vacios");//muestra el msj
                } else {
                    mat.setIdMateria(Integer.parseInt(jTid.getText()));
                    mat.setNombre(jTnombre1.getText());
                    mat.setAñoMateria(Integer.parseInt(jTaño1.getText()));
                    if (jRactivo.isSelected()) {
                        mat.setActivo(true);

                    }
                    mData.modificarMateria(mat);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ingrese datos correctos");//si por ej escribe string en vez d int en año muestra el msj
            }
        }
    }//GEN-LAST:event_jBmodifiActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "¿Desea dar de baja la materia seleccionada?", "Atención!",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resp == 0) {
            mData.eliminarMateria(Integer.parseInt(jTid.getText()));
            jTnombre1.setText("");
            jTaño1.setText("");
            jTid.setText("");
        }


    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jTvisorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTvisorMouseClicked
        // TODO add your handling code here:
        int exito;
        try {
            int fila = jTvisor.getSelectedRow();//Declaro la varible fila
            jTnombre1.setText((String) jTvisor.getValueAt(fila, 1));
            jTaño1.setText((String) jTvisor.getValueAt(fila, 2).toString());
            jTid.setText((String) jTvisor.getValueAt(fila, 0).toString());
            if (jTvisor.getValueAt(fila, 3).toString().equals("Activa")) {
                jRactivo.setSelected(true);
                jRactivo.setEnabled(false);
                jRinac.setEnabled(false);
                exito = 1;

            } else {
                jRinac.setSelected(true);
                jRinac.setEnabled(false);
                jRactivo.setEnabled(true);
                exito = 2;

            }
            /*Para mostrar la fecha de la tabla, primero recupero el dato a String
            y despues hago la transformacion de String a Date que es el formato del jDChooser*/

        } catch (ArrayIndexOutOfBoundsException ai) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Materia de la tabla.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;

        }
        jBmodifi.setEnabled(true);
        if (exito == 1) {
            jBeliminar.setEnabled(true);

        } else {
            jBeliminar.setEnabled(false);
        }

        jTnombre1.getText();
        jTaño1.getText();
        jTaño1.setEnabled(true);
        jTnombre1.setEnabled(true);
    }//GEN-LAST:event_jTvisorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactivas;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar1;
    private javax.swing.JButton jBinac;
    private javax.swing.JButton jBmodifi;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBtodas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLaño;
    private javax.swing.JLabel jLaño1;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLmodifi;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLnombre1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRactivo;
    private javax.swing.JRadioButton jRinac;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTaño;
    private javax.swing.JTextField jTaño1;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTnombre1;
    private javax.swing.JTable jTvisor;
    // End of variables declaration//GEN-END:variables

    private void cabecera() {
        tablita.addColumn("Id");
        tablita.addColumn("Nombre");
        tablita.addColumn("Año");
        tablita.addColumn("Estado");
        jTvisor.setModel(tablita);
    }
    
    private void limpiarTabla(){
        int f = tablita.getRowCount();
        for (int i = f - 1; i >= 0; i--) {
            tablita.removeRow(i);
        }
    }
    
}
