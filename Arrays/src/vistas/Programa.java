package vistas;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import vistas.Other.Presentacion;
import vistas.Eliminar.EliminarReferencia;
import vistas.insertar.InsertarFinal;
import vistas.insertar.InsertarInicio;
import vistas.insertar.InsertarReferencia;

public class Programa extends javax.swing.JFrame {

    private int temaActual = 0;

    public Programa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTrasero = new javax.swing.JPanel();
        barrasScroll = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        barraMenu = new javax.swing.JMenuBar();
        menuInsertar = new javax.swing.JMenu();
        insertarInicio = new javax.swing.JMenuItem();
        insertarFinal = new javax.swing.JMenuItem();
        insertarReferencia = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenu();
        eliminarInicio = new javax.swing.JMenuItem();
        eliminarFinal = new javax.swing.JMenuItem();
        eliminarReferencia = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenu();
        buscarSecuencial = new javax.swing.JMenuItem();
        buscarBinaria = new javax.swing.JMenuItem();
        menuOrdenar = new javax.swing.JMenu();
        ordenarBurbuja = new javax.swing.JMenuItem();
        ordenarInsercion = new javax.swing.JMenuItem();
        ordenarSeleccion = new javax.swing.JMenuItem();
        ordenarSort = new javax.swing.JMenuItem();
        menuOther = new javax.swing.JMenu();
        otherAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        barrasScroll.setViewportView(areaTexto);

        javax.swing.GroupLayout panelTraseroLayout = new javax.swing.GroupLayout(panelTrasero);
        panelTrasero.setLayout(panelTraseroLayout);
        panelTraseroLayout.setHorizontalGroup(
            panelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraseroLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(barrasScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelTraseroLayout.setVerticalGroup(
            panelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraseroLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(barrasScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        menuInsertar.setText("Insertar");

        insertarInicio.setText("Inicio");
        insertarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarInicioActionPerformed(evt);
            }
        });
        menuInsertar.add(insertarInicio);

        insertarFinal.setText("Final");
        insertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarFinalActionPerformed(evt);
            }
        });
        menuInsertar.add(insertarFinal);

        insertarReferencia.setText("Referencia");
        insertarReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarReferenciaActionPerformed(evt);
            }
        });
        menuInsertar.add(insertarReferencia);

        barraMenu.add(menuInsertar);

        menuEliminar.setText("Eliminar");

        eliminarInicio.setText("Inicio");
        eliminarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarInicioActionPerformed(evt);
            }
        });
        menuEliminar.add(eliminarInicio);

        eliminarFinal.setText("Final");
        eliminarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFinalActionPerformed(evt);
            }
        });
        menuEliminar.add(eliminarFinal);

        eliminarReferencia.setText("Referencia");
        eliminarReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarReferenciaActionPerformed(evt);
            }
        });
        menuEliminar.add(eliminarReferencia);

        barraMenu.add(menuEliminar);

        menuBuscar.setText("Buscar");

        buscarSecuencial.setText("Secuencial");
        menuBuscar.add(buscarSecuencial);

        buscarBinaria.setText("Binaria");
        menuBuscar.add(buscarBinaria);

        barraMenu.add(menuBuscar);

        menuOrdenar.setText("Ordenar");

        ordenarBurbuja.setText("Burbuja");
        menuOrdenar.add(ordenarBurbuja);

        ordenarInsercion.setText("Inserción");
        menuOrdenar.add(ordenarInsercion);

        ordenarSeleccion.setText("Selección");
        menuOrdenar.add(ordenarSeleccion);

        ordenarSort.setText("Sort");
        ordenarSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarSortActionPerformed(evt);
            }
        });
        menuOrdenar.add(ordenarSort);

        barraMenu.add(menuOrdenar);

        menuOther.setText("Other");

        otherAbout.setText("About");
        otherAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherAboutActionPerformed(evt);
            }
        });
        menuOther.add(otherAbout);

        barraMenu.add(menuOther);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTrasero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTrasero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ordenarSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarSortActionPerformed

    }//GEN-LAST:event_ordenarSortActionPerformed

    private void insertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarInicioActionPerformed
        InsertarInicio insertarInicio = new InsertarInicio();
        insertarInicio.setVisible(true);
    }//GEN-LAST:event_insertarInicioActionPerformed

    private void insertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarFinalActionPerformed
        InsertarFinal insertarFinal = new InsertarFinal();
        insertarFinal.setVisible(true);
    }//GEN-LAST:event_insertarFinalActionPerformed

    private void insertarReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarReferenciaActionPerformed
        InsertarReferencia insertarReferencia = new InsertarReferencia();
        insertarReferencia.setVisible(true);
    }//GEN-LAST:event_insertarReferenciaActionPerformed

    private void eliminarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarInicioActionPerformed

    }//GEN-LAST:event_eliminarInicioActionPerformed

    private void eliminarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFinalActionPerformed

    }//GEN-LAST:event_eliminarFinalActionPerformed

    private void eliminarReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReferenciaActionPerformed
        EliminarReferencia eliminarReferencia = new EliminarReferencia();
        eliminarReferencia.setVisible(true);
    }//GEN-LAST:event_eliminarReferenciaActionPerformed

    private void otherAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherAboutActionPerformed
        Presentacion presentacion = new Presentacion();
        presentacion.setVisible(true);
    }//GEN-LAST:event_otherAboutActionPerformed

    private static void establecerDarkLaf() {
        //Establecer FlatDarkLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }

    private static void establecerLightLaf() {
        //Establecer FlatDarkLaf
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        establecerDarkLaf();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JScrollPane barrasScroll;
    private javax.swing.JMenuItem buscarBinaria;
    private javax.swing.JMenuItem buscarSecuencial;
    private javax.swing.JMenuItem eliminarFinal;
    private javax.swing.JMenuItem eliminarInicio;
    private javax.swing.JMenuItem eliminarReferencia;
    private javax.swing.JMenuItem insertarFinal;
    private javax.swing.JMenuItem insertarInicio;
    private javax.swing.JMenuItem insertarReferencia;
    private javax.swing.JMenu menuBuscar;
    private javax.swing.JMenu menuEliminar;
    private javax.swing.JMenu menuInsertar;
    private javax.swing.JMenu menuOrdenar;
    private javax.swing.JMenu menuOther;
    private javax.swing.JMenuItem ordenarBurbuja;
    private javax.swing.JMenuItem ordenarInsercion;
    private javax.swing.JMenuItem ordenarSeleccion;
    private javax.swing.JMenuItem ordenarSort;
    private javax.swing.JMenuItem otherAbout;
    private javax.swing.JPanel panelTrasero;
    // End of variables declaration//GEN-END:variables
}
