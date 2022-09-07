package vistas;

import vistas.Eliminar.EliminarReferencia;
import vistas.insertar.InsertarFinal;
import vistas.insertar.InsertarInicio;
import vistas.insertar.InsertarReferencia;

public class Programa extends javax.swing.JFrame {

    public Programa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        barraMenu.add(menuOther);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ordenarSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarSortActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarFinalActionPerformed

    private void eliminarReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReferenciaActionPerformed
        EliminarReferencia eliminarReferencia = new EliminarReferencia();
        eliminarReferencia.setVisible(true);
    }//GEN-LAST:event_eliminarReferenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
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
    // End of variables declaration//GEN-END:variables
}
