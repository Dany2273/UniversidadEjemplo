/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.AlumnoData;
import entidades.Alumno;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ManejoDeDatos extends javax.swing.JInternalFrame {

    AlumnoData aData = new AlumnoData();
    Alumno al = new Alumno();
    
     private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private TableRowSorter<DefaultTableModel> sorte = new TableRowSorter<>(modelo);

    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
        public Component getTableCellRendererComponent(
                JTable tabla, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {
            if (value instanceof Boolean) {
                boolean estado = (boolean) value;
                if (estado) {
                    value = "Activo/a.";
                } else {
                    value = "Inactivo/a.";
                }
            }
            return super.getTableCellRendererComponent(tabla, value, isSelected, hasFocus, row, column);
        }
    };

    public ManejoDeDatos() {
        initComponents();
        bloquear();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jrActivos = new javax.swing.JRadioButton();
        jrNoActivos = new javax.swing.JRadioButton();
        jtBuscar = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jbSeleccionar = new javax.swing.JButton();

        setTitle("Manejo de Datos");
        setMinimumSize(new java.awt.Dimension(25, 22));
        setPreferredSize(new java.awt.Dimension(980, 422));

        jPanel1.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manejo de datos de Alumnos.");

        jTabla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTabla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTablaFocusGained(evt);
            }
        });
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        jbBorrar.setText("Borrar Campos");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar Datos");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Dar de Baja");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboItemStateChanged(evt);
            }
        });
        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar Alumno:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jtNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido:");

        jtApellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DNI:");

        jtDni.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de Nacimiento:");

        jrActivos.setBackground(new java.awt.Color(255, 255, 255));
        jrActivos.setForeground(new java.awt.Color(255, 255, 255));
        jrActivos.setText("Mostrar Alumnos Activos");
        jrActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrActivosActionPerformed(evt);
            }
        });

        jrNoActivos.setBackground(new java.awt.Color(255, 255, 255));
        jrNoActivos.setForeground(new java.awt.Color(255, 255, 255));
        jrNoActivos.setText("Mostrar Alumnos No Activos");
        jrNoActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNoActivosActionPerformed(evt);
            }
        });

        jtBuscar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtBuscarFocusGained(evt);
            }
        });
        jtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarActionPerformed(evt);
            }
        });
        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbSeleccionar.setText("Seleccionar Alumno");
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrActivos)
                                        .addGap(62, 62, 62)
                                        .addComponent(jrNoActivos))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbSeleccionar)
                        .addGap(88, 88, 88)
                        .addComponent(jbBorrar)
                        .addGap(98, 98, 98)
                        .addComponent(jbModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminar)
                        .addGap(92, 92, 92)
                        .addComponent(jbSalir)
                        .addGap(35, 35, 35))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrNoActivos)
                        .addComponent(jrActivos))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBorrar)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir)
                    .addComponent(jbSeleccionar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange
        // TODO add your handling code here:
        if (jdFecha.getDate() != null) {
            LocalDate nf = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
    }//GEN-LAST:event_jdFechaPropertyChange

    private void jTablaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTablaFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jTablaFocusGained

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablaMouseClicked

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here
        borrar();
        borrarFilas();
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:

        if (jtNombre.getText().equals("") && jtApellido.getText().equals("")&& jtDni.getText().equals("") && jdFecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Alumno de la tabla.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jtNombre.getText().equals("") || jtApellido.getText().equals("")|| jtDni.getText().equals("") || jdFecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Faltan campos por completar.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!jtNombre.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el Nombre.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!jtApellido.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el Apellido.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!jtDni.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Error al ingresar DNI.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos ingresados?", "Atención!",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (resp == 0) {

            al.setNombre(jtNombre.getText());
            al.setApellido(jtApellido.getText());
            al.setDni(Integer.parseInt(jtDni.getText()));
            al.setFechaNac(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            aData.modificarAlumno(al);
            System.out.println(al);
            borrar();
            borrarFilas();
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        if (jtNombre.getText().equals("") && jtApellido.getText().equals("")&& jtDni.getText().equals("") && jdFecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Alumno de la tabla.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea dar de baja al Alumno seleccionado?", "Atención!",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        int fila = jTabla.getSelectedRow();
        if(resp==0){
            al = aData.buscarAlumnoPorDni((int) modelo.getValueAt(fila, 2));
            aData.eliminarAlumno(al.getIdAlumno());

            borrar();
            borrarFilas();
        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboItemStateChanged

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        // TODO add your handling code here:

        jTabla.getColumnModel().getColumn(4).setCellRenderer(renderer);
        if (jCombo.getSelectedItem().equals("Por Dni")) {
            activar();
            jtBuscar.setText("Ingrese DNI");
            borrarFilas();

        } else if (jCombo.getSelectedItem().equals("Por Nombre")) {
            activar();
            jtBuscar.setText("Ingrese Nombre");
            borrarFilas();

        } else if (jCombo.getSelectedItem().equals("Por Apellido")) {
            activar();
            jtBuscar.setText("Ingrese Apellido");
            borrarFilas();

        } else if(jCombo.getSelectedItem().equals("Todos")){
            activar();
            borrarFilas();
            for (Alumno alu : aData.listarAlumnos()) {
                modelo.addRow(new Object[]{
                    alu.getNombre(), alu.getApellido(), alu.getDni(), alu.getFechaNac(), alu.isEstado()
                });
            }

        }else if(jCombo.getSelectedIndex()==0&&modelo.getRowCount() > 0){
            bloquear();
            borrar();
            borrarFilas();
        }
    }//GEN-LAST:event_jComboActionPerformed

    private void jrActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrActivosActionPerformed
        // TODO add your handling code here:
        jrNoActivos.setSelected(false);
        jTabla.getColumnModel().getColumn(4).setCellRenderer(renderer);
        jTabla.setRowSorter(sorte);
        if (jrActivos.isSelected()) {
            // Aplicar el filtro para mostrar solo alumnos activos
            RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("true", 4); // Reemplaza 'activo' con el valor que indica un alumno activo
            sorte.setRowFilter(rowFilter);
        } else {
            // Mostrar todos los alumnos cuando el botón esté deseleccionado
            sorte.setRowFilter(null);
        }

    }//GEN-LAST:event_jrActivosActionPerformed

    private void jrNoActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNoActivosActionPerformed
        // TODO add your handling code here:
        jrActivos.setSelected(false);
        jTabla.getColumnModel().getColumn(4).setCellRenderer(renderer);
        jTabla.setRowSorter(sorte);
        if (jrNoActivos.isSelected()) {
            // Aplicar el filtro para mostrar solo alumnos activos
            RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("false", 4); // Reemplaza 'inactivo' con el valor que indica un alumno activo
            sorte.setRowFilter(rowFilter);
        } else {
            // Mostrar todos los alumnos cuando el botón esté deseleccionado
            sorte.setRowFilter(null);
        }
    }//GEN-LAST:event_jrNoActivosActionPerformed

    private void jtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtBuscarFocusGained
        // TODO add your handling code here:
        if (jtBuscar.getText().equals("Ingrese DNI")) {
            jtBuscar.setText("");
        }
        if (jtBuscar.getText().equalsIgnoreCase("Ingrese Apellido")) {
            jtBuscar.setText("");
        }
        if (jtBuscar.getText().equalsIgnoreCase("Ingrese Nombre")) {
            jtBuscar.setText("");
        }
    }//GEN-LAST:event_jtBuscarFocusGained

    private void jtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBuscarActionPerformed

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased
        // TODO add your handling code here:

        if (jCombo.getSelectedItem().equals("Por Apellido")) {
            borrarFilas();
            jTabla.getColumnModel().getColumn(4).setCellRenderer(renderer);
            for (Alumno alu : aData.listarAlumnos()) {
                if (alu.getApellido().toLowerCase().startsWith(jtBuscar.getText().toLowerCase())) {
                    modelo.addRow(new Object[]{
                        alu.getNombre(), alu.getApellido(), alu.getDni(), alu.getFechaNac(), alu.isEstado()
                    });
                }
            }
            if (jtBuscar.getText().equals("")) {
                borrarFilas();
            }
        }

        if (jCombo.getSelectedItem().equals("Por Dni")) {
            borrarFilas();
            jTabla.getColumnModel().getColumn(4).setCellRenderer(renderer);
            for (Alumno alu : aData.listarAlumnos()) {
                if (String.valueOf(alu.getDni()).startsWith(jtBuscar.getText())) {
                    modelo.addRow(new Object[]{
                        alu.getNombre(), alu.getApellido(), alu.getDni(), alu.getFechaNac(), alu.isEstado()
                    });
                }
            }
            if (jtBuscar.getText().equals("")) {
                borrarFilas();
            }
        }
        if (jCombo.getSelectedItem().equals("Por Nombre")) {
            borrarFilas();
            jTabla.getColumnModel().getColumn(4).setCellRenderer(renderer);
            for (Alumno alu : aData.listarAlumnos()) {
                if (alu.getNombre().toLowerCase().startsWith(jtBuscar.getText().toLowerCase())) {
                    modelo.addRow(new Object[]{
                        alu.getNombre(), alu.getApellido(), alu.getDni(), alu.getFechaNac(), alu.isEstado()
                    });
                }
            }
            if (jtBuscar.getText().equals("")) {
                borrarFilas();
            }
        }

    }//GEN-LAST:event_jtBuscarKeyReleased

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        // TODO add your handling code here:

        try{
            int fila = jTabla.getSelectedRow();//Declaro la varible fila
            jtNombre.setText((String) modelo.getValueAt(fila, 0));
            jtApellido.setText((String) modelo.getValueAt(fila, 1));
            jtDni.setText((String) modelo.getValueAt(fila, 2).toString());
            /*Para mostrar la fecha de la tabla, primero recupero el dato a String
            y despues hago la transformacion de String a Date que es el formato del jDChooser*/
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = modelo.getValueAt(fila, 3).toString().trim();
            Date dato = null;
            dato = formatoDelTexto.parse(fecha);
            jdFecha.setDate(dato);
            jtBuscar.setText("");
        }catch(ArrayIndexOutOfBoundsException ai){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Alumno de la tabla.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }catch (ParseException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jbSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSeleccionar;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JRadioButton jrActivos;
    private javax.swing.JRadioButton jrNoActivos;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo1() {
        jCombo.addItem("");
        jCombo.addItem("Por Dni");
        jCombo.addItem("Por Nombre");
        jCombo.addItem("Por Apellido");
        jCombo.addItem("Todos");
    }

     private void borrar() {
        jtDni.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jCombo.setSelectedItem("");
        jdFecha.setDate(null);
        
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
        int f = jTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void bloquear(){
        jrActivos.setEnabled(false);jrNoActivos.setEnabled(false);
        jtNombre.setEnabled(false);jtApellido.setEnabled(false);jtDni.setEnabled(false);
        jdFecha.setEnabled(false);jTabla.setEnabled(false);jtBuscar.setEnabled(false);
        jbBorrar.setEnabled(false);jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);jbSeleccionar.setEnabled(false);
    }
    private void activar(){
        jrActivos.setEnabled(true);jrNoActivos.setEnabled(true);
        jtNombre.setEnabled(true);jtApellido.setEnabled(true);jtDni.setEnabled(true);
        jdFecha.setEnabled(true);jTabla.setEnabled(true);jtBuscar.setEnabled(true);
        jbBorrar.setEnabled(true);jbModificar.setEnabled(true);
        jbEliminar.setEnabled(true);jbSeleccionar.setEnabled(true);
    }
}