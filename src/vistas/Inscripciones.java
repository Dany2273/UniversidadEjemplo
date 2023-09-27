/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.AlumnoData;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Compaq
 */
public class Inscripciones extends javax.swing.JInternalFrame {

Alumno al = new Alumno();
    Materia mat = new Materia();
    Inscripcion ins = new Inscripcion();
    AlumnoData aData = new AlumnoData();
    MateriaData mData = new MateriaData();
    InscripcionData iData = new InscripcionData();
    
     private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    public Inscripciones() {
         initComponents();
        cargarCombo();
        armarCabecera();
        jBAnular.setEnabled(false);    //
        jBInscribir.setEnabled(false);//---> Deshabilito los botones al inicio del programa
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
        jcCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jrInscriptas = new javax.swing.JRadioButton();
        jrNoInscriptas = new javax.swing.JRadioButton();
        jBInscribir = new javax.swing.JButton();
        jBAnular = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setTitle("Formulario de Inscripcion");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario de Inscripcion.");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un Alumno: ");

        jcCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcComboItemStateChanged(evt);
            }
        });
        jcCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcComboActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listado de Materias.");

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
        jScrollPane1.setViewportView(jTabla);

        jrInscriptas.setBackground(new java.awt.Color(255, 255, 255));
        jrInscriptas.setForeground(new java.awt.Color(255, 255, 255));
        jrInscriptas.setText("Materias Inscriptas");
        jrInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrInscriptasActionPerformed(evt);
            }
        });

        jrNoInscriptas.setBackground(new java.awt.Color(255, 255, 255));
        jrNoInscriptas.setForeground(new java.awt.Color(255, 255, 255));
        jrNoInscriptas.setText("Materias no Inscriptas");
        jrNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNoInscriptasActionPerformed(evt);
            }
        });

        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnular.setText("Anular Inscripcion");
        jBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel3))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrInscriptas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrNoInscriptas))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28)
                                        .addComponent(jcCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 124, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jBInscribir)
                .addGap(114, 114, 114)
                .addComponent(jBAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrInscriptas)
                    .addComponent(jrNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnular)
                    .addComponent(jBSalir)
                    .addComponent(jBInscribir))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcComboItemStateChanged
        // TODO add your handling code here:
         borrarFilas();
        jrNoInscriptas.setSelected(false);
        jrInscriptas.setSelected(false);//--->Acá lo que hace es: cada vez que selecciona un alumno del comboBox
        //deselecciona los jrButton inscriptas y noInscriptas
   
    }//GEN-LAST:event_jcComboItemStateChanged

    private void jcComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcComboActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jcComboActionPerformed

    private void jrInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrInscriptasActionPerformed
        // TODO add your handling code here:
         borrarFilas();//-----> Método que borra los datos de la tabla

        al = (Alumno) jcCombo.getSelectedItem();

        if (jcCombo.getSelectedItem() == null) {//-----> Si el comboBosx está vacío, devuelve el mensaje
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Alumno de la lista.");
            jrInscriptas.setSelected(false);
            return;
        }
        if (jrInscriptas.isSelected()) {//----->Si Inscriptas esta seleccionado,  
            jBInscribir.setEnabled(false);  // oculta el boton inscribir
            jrNoInscriptas.setSelected(false);// deselecciona no inscriptas
            jBAnular.setEnabled(true); // y hace habilita el boton anular inscripcion
            for (entidades.Materia mat : iData.obtenerMateriasCursadas(al.getIdAlumno())) {
                //iData es la variable de inscripcionData que devuelve el método obtenerMateriasCursadas();
                //que recibe por parametro el id del alumno, luego se llena la tabla con los datos de la materia
                modelo.addRow(new Object[]{
                    mat.getIdMateria(),
                    mat.getNombre(),
                    mat.getAñoMateria()
                });
            }
        } else {
            jBAnular.setEnabled(false);
            borrarFilas();
        }
    }//GEN-LAST:event_jrInscriptasActionPerformed

    private void jrNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNoInscriptasActionPerformed
        // TODO add your handling code here:
          borrarFilas();

        al = (Alumno) jcCombo.getSelectedItem();
        if (jcCombo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Alumno de la lista.");
            jrNoInscriptas.setSelected(false);

            return;
        }
        if (jrNoInscriptas.isSelected()) {
            jrInscriptas.setSelected(false);
            jBAnular.setEnabled(false);
            jBInscribir.setEnabled(true);

            for (entidades.Materia mat : iData.obtenerMateriasNoCursadas(al.getIdAlumno())) {

                modelo.addRow(new Object[]{
                    mat.getIdMateria(),
                    mat.getNombre(),
                    mat.getAñoMateria()
                });
            }
        } else {
            jBInscribir.setEnabled(false);
            borrarFilas();
        }
    }//GEN-LAST:event_jrNoInscriptasActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        // TODO add your handling code here:
        if (jTabla.getSelectedRow() != (-1)) {//-----> la condicion es que si la fila seleccionada es distinta al indice -1
            // continua con la inscripcion
            int fila = jTabla.getSelectedRow();//-----> asigno a la variable la fila seleccionada

            al = (Alumno) jcCombo.getSelectedItem(); //-----> variable al pertenece a Alumno, que recibe y castea el objeto
            // seleccionado del comboBox

            int id = (int) modelo.getValueAt(fila, 0);//-----> asigno a la variable id los datos de la fila y el numero de la columna que es 0
            String nom = (String) modelo.getValueAt(fila, 1);//-----> lo mismo con la columna 1
            int año = (int) modelo.getValueAt(fila, 2);//-----> y acá con la columna 2
            Double nota = 0.0;//----->en mi caso decidi que cada inscripcion comience con una nota en 0

            entidades.Materia mat = new entidades.Materia(id, nom, año, true);//----->creo un objeto Materia y le asigno al constructor
            // los datos obtenidos de la tabla
            ins = new Inscripcion(al, mat, nota);//----->creo una nueva inscripcion con los objetos Alumno y Materia con la nota en 0
            iData.guardarInscripcion(ins);//----->con la varible llamo al metodo guardarInscripcion(), y le paso la inscripcion creada

            modelo.removeRow(fila);//----->una vez creada la inscripcion, remuevo la fila que contenia los datos

        } else {

            JOptionPane.showMessageDialog(null, "Debe seleccionar una materia");
            return;
        }


    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularActionPerformed
        // TODO add your handling code here:
         int fila = jTabla.getSelectedRow();
        int idAlum, idMat;//----->Creo las variable que van a recibir los id de Alumno y Materia

        if (jTabla.getSelectedRow() != (-1)) {
            al = (Alumno) jcCombo.getSelectedItem();//----->recibo el objeto del comboBox
            idAlum = al.getIdAlumno();//-----> recupero del objeto anterior el id de Alumno
            idMat = (int) modelo.getValueAt(fila, 0);//----->el id de Materia lo recupero de la ubicacion en la tabla,
                                                     //fila seleccionada columna 0.

            iData.borrarInscripcionesMateriaAlumno(idAlum, idMat);//----->llamo al metodo borrarInscripcionesMateriaAlumno();
                                                                  //Y le paso por parametro los id recuperados
            modelo.removeRow(fila);

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una materia");
            return;
        }
    }//GEN-LAST:event_jBAnularActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
         dispose();//---->llamo al metodo que realiza el cierre del jInternalFrame
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnular;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JComboBox<Alumno> jcCombo;
    private javax.swing.JRadioButton jrInscriptas;
    private javax.swing.JRadioButton jrNoInscriptas;
    // End of variables declaration//GEN-END:variables

     private void cargarCombo() {

        jcCombo.addItem(null);
        for (Alumno alu : aData.listarAlumnos()) {
            jcCombo.addItem(alu);

        }

    }

    public void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");

        jTabla.setModel(modelo);

    }

    private void borrarFilas() {
        int filas = modelo.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }
    }
}