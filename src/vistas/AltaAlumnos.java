/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.AlumnoData;
import entidades.Alumno;
import java.awt.Graphics;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AltaAlumnos extends javax.swing.JInternalFrame {

    AlumnoData aData = new AlumnoData();
    Alumno al = new Alumno();
    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public AltaAlumnos() {
        initComponents();

        llenarCombo();
        llenarCombo1();
        armarCabecera();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbReinscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jCombo = new javax.swing.JComboBox<>();
        jDni = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jCombo1 = new javax.swing.JComboBox<>();

        setTitle("Alta de Alumno");
        setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Alta de Alumno.");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido/s:");

        jApellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jApellidoFocusLost(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre/s:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");

        jdFecha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("F. Nacimiento:");

        jbGuardar.setText("Guardar Alumno");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbReinscribir.setText("Reinscribir Alumno");
        jbReinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReinscribirActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        jDni.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jNombreFocusLost(evt);
            }
        });
        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado:");

        jCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(279, 279, 279)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jbGuardar)
                                        .addGap(176, 176, 176)
                                        .addComponent(jbReinscribir)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(195, 195, 195)
                                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(641, 641, 641)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6))))
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbReinscribir)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jApellidoFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jApellidoFocusLost

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        if (jCombo1.getSelectedItem().equals("Nuevo Alumno")) {
            if (jNombre.getText().equals("") && jApellido.getText().equals("")
                    && jDni.getText().equals("") && jdFecha.getDate() == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Por favor, complete todos los campos obligatorios:\n- Nombre\n- Apellido\n- DNI\n- Fecha de Nacimiento\n- Estado",
                        "Campos Incompletos",
                        JOptionPane.ERROR_MESSAGE
                );

                return;
            } else if (jApellido.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo Apellido se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (jDni.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo DNI se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (jNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo Apellido se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (jdFecha.getDate() == null) {
                JOptionPane.showMessageDialog(null, "El campo Fecha se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!jNombre.getText().matches("^[\\p{L} ]+$")) {
                JOptionPane.showMessageDialog(null, "Ingrese un Nombre válido! (solo letras y espacios).", "Error en el Nombre", JOptionPane.ERROR_MESSAGE);

                return;
            }
            if (!jApellido.getText().matches("^[\\p{L} ]+$")) {
                JOptionPane.showMessageDialog(null, "Ingrese un Apellido válido! (solo letras y espacios).", "Error en el Apellido", JOptionPane.ERROR_MESSAGE);

                return;
            }
            if (!jDni.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "Ingrese un DNI válido! (solo números).", "Error en el DNI", JOptionPane.ERROR_MESSAGE);

                return;
            }

            if (jCombo.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione el estado del alumno.");
                return;
            }

            int resp = JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos ingresados?", "Atención!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (resp == 0) {

                String ape = jApellido.getText();
                String nom = jNombre.getText();
                int dni = Integer.parseInt(jDni.getText());

                LocalDate fec = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                boolean est = false;
                if (jCombo.getSelectedItem().equals("Activo")) {
                    est = true;
                } else if (jCombo.getSelectedItem().equals("Activo")) {
                    est = false;
                }

                al = new Alumno(dni, ape, nom, fec, est);

                aData.guardarAlumno(al);
                String estado = est ? "Activo/a" : "Inactivo/a";
                modelo.addRow(new Object[]{
                    nom, ape, dni, fec, estado
                });

                borrar();
            }
        }
       
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbReinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReinscribirActionPerformed
        
        if (jNombre.getText().equals("") && jApellido.getText().equals("") && jDni.getText().equals("") && jdFecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Alumno de la tabla.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (jCombo1.getSelectedItem().equals("Reinscribir Alumno")&&jCombo.getSelectedItem().equals("Inactivo")) {
            
             JOptionPane.showMessageDialog(
        null,
        "El alumno seleccionado ya se encuentra inactivo y no se realizaron cambios en su estado.",
        "Estado Inactivo",
        JOptionPane.WARNING_MESSAGE
    );
        }else{
            al = aData.buscarAlumnoPorDni((int) modelo.getValueAt(jTabla.getSelectedRow(), 2));

            int resp = JOptionPane.showConfirmDialog(null, "¿Desea reinscribir al Alumno seleccionado?", "Atención!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resp == 0 && jCombo.getSelectedItem().equals("Activo")) {
                aData.reinscribirAlumno(al.getIdAlumno());
            }
            modelo.removeRow(jTabla.getSelectedRow());
            borrar();
        }
        
    }//GEN-LAST:event_jbReinscribirActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange
        // TODO add your handling code here:
        if (jdFecha.getDate() != null) {
            LocalDate nf = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
    }//GEN-LAST:event_jdFechaPropertyChange

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboActionPerformed

    private void jNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jNombreFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jNombreFocusLost

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo1ActionPerformed
        // TODO add your handling code here:

        if (jCombo1.getSelectedItem().equals("Nuevo Alumno")) {
            jbGuardar.setEnabled(true);
            jbReinscribir.setEnabled(false);
            jTabla.setEnabled(false);
            borrarFilas();

        } else if (jCombo1.getSelectedItem().equals("Reinscribir Alumno")) {
            jbReinscribir.setEnabled(true);jNombre.setEditable(false);jApellido.setEditable(false);
            jbGuardar.setEnabled(false);jDni.setEditable(false);jdFecha.setEnabled(false);
            jTabla.setEnabled(true);
            borrarFilas();
            for (Alumno alu : aData.listarAlumnos()) {

                if (alu.isEstado() == false) {
                    String estado = alu.isEstado() ? "Activo/a" : "Inactivo/a";
                    modelo.addRow(new Object[]{
                        alu.getNombre(), alu.getApellido(), alu.getDni(), alu.getFechaNac(), estado
                    });
                }
            }
        } else if (jCombo1.getSelectedItem().equals("Seleccione Accion")) {
            borrarFilas();
        }


    }//GEN-LAST:event_jCombo1ActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        // TODO add your handling code here:
        try {
            int fila = jTabla.getSelectedRow();//Declaro la varible fila
            jNombre.setText((String) modelo.getValueAt(fila, 0));
            jApellido.setText((String) modelo.getValueAt(fila, 1));
            jDni.setText((String) modelo.getValueAt(fila, 2).toString());
            /*Para mostrar la fecha de la tabla, primero recupero el dato a String
            y despues hago la transformacion de String a Date que es el formato del jDChooser*/
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = modelo.getValueAt(fila, 3).toString().trim();
            Date dato = null;
            dato = formatoDelTexto.parse(fecha);
            jdFecha.setDate(dato);
            jCombo.setSelectedItem("Inactivo");
        } catch (ArrayIndexOutOfBoundsException ai) {
//            JOptionPane.showMessageDialog(null, "Debe seleccionar un Alumno de la tabla.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jTablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jApellido;
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JComboBox<String> jCombo1;
    private javax.swing.JTextField jDni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbReinscribir;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFecha;
    // End of variables declaration//GEN-END:variables

    private void borrar() {
        jDni.setText("");
        jApellido.setText("");
        jNombre.setText("");
        jCombo.setSelectedItem("");
        jdFecha.setDate(null);
    }

    private void llenarCombo() {
        jCombo.addItem("");
        jCombo.addItem("Activo");
        jCombo.addItem("Inactivo");
    }

    private void llenarCombo1() {
        jCombo1.addItem("Seleccione Accion");
        jCombo1.addItem("Nuevo Alumno");
        jCombo1.addItem("Reinscribir Alumno");
    }

    private void armarCabecera() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Fecha de Nacimiento");
        modelo.addColumn("Estado");
        jTabla.setModel(modelo);

    }

    private void borrarFilas() {
        int f = modelo.getRowCount();
        for (int i = f - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
