package vistas;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelo.Array;
import vistas.Other.Presentacion;

public class Programa extends javax.swing.JFrame {

    private int tamagnoVector;
    private Array array;
    private int vector[];
    private int c = 0;

    public Programa(int tamagnoVector) {
        establecerDarkLaf();
        this.tamagnoVector = tamagnoVector;
        array = new Array(this.tamagnoVector);

        initComponents();
        resetearPanel();
    }

    private void resetearPanel() {
        this.salidaPosicionesOcupadas.setText(String.valueOf(c));
        this.salidaTamagnoVector.setText(String.valueOf(this.tamagnoVector));
        
        this.areaTexto.setText("");
        this.vector = array.getVector();
        
        String texto = "";
        for(int i=0; i<array.getC();i++){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTrasero = new javax.swing.JPanel();
        barrasScroll = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        salidaTamagnoVector = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salidaPosicionesOcupadas = new javax.swing.JTextField();
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

        areaTexto.setEditable(false);
        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        barrasScroll.setViewportView(areaTexto);

        jLabel1.setText("Tamaño del vector:");

        salidaTamagnoVector.setEditable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("C:");

        salidaPosicionesOcupadas.setEditable(false);

        javax.swing.GroupLayout panelTraseroLayout = new javax.swing.GroupLayout(panelTrasero);
        panelTrasero.setLayout(panelTraseroLayout);
        panelTraseroLayout.setHorizontalGroup(
            panelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraseroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barrasScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTraseroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salidaTamagnoVector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salidaPosicionesOcupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelTraseroLayout.setVerticalGroup(
            panelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTraseroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(salidaPosicionesOcupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(salidaTamagnoVector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(barrasScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        menuInsertar.setText("Insertar");

        insertarInicio.setText("Inicio");
        insertarInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertarInicioMouseClicked(evt);
            }
        });
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

        int numeroInsertar = 0;

        for (int i = 0; i < 1; i++) {
            try {
                numeroInsertar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número a insertar: "));
                i++;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un número entero");
                i--;
            }
        }
        if (array.insercionInicio(numeroInsertar) == 0) {
            JOptionPane.showMessageDialog(null, "Desbordamiento de memoria. Vector lleno.");
        } else {
            JOptionPane.showMessageDialog(null, "Inserción finalizada.");
            this.c = array.getC();
            this.resetearPanel();
        }
    }//GEN-LAST:event_insertarInicioActionPerformed

    private void insertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarFinalActionPerformed

    }//GEN-LAST:event_insertarFinalActionPerformed

    private void insertarReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarReferenciaActionPerformed

    }//GEN-LAST:event_insertarReferenciaActionPerformed

    private void eliminarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarInicioActionPerformed

    }//GEN-LAST:event_eliminarInicioActionPerformed

    private void eliminarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFinalActionPerformed

    }//GEN-LAST:event_eliminarFinalActionPerformed

    private void eliminarReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReferenciaActionPerformed

    }//GEN-LAST:event_eliminarReferenciaActionPerformed

    private void otherAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherAboutActionPerformed
        Presentacion presentacion = new Presentacion();
        presentacion.setVisible(true);
    }//GEN-LAST:event_otherAboutActionPerformed

    private void insertarInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarInicioMouseClicked

    }//GEN-LAST:event_insertarInicioMouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField salidaPosicionesOcupadas;
    private javax.swing.JTextField salidaTamagnoVector;
    // End of variables declaration//GEN-END:variables
}
