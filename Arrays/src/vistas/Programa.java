package vistas;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import modelo.Array;
import vistas.Other.Presentacion;

public class Programa extends javax.swing.JFrame {

    private int tamagnoVector;
    private Array array;//Clase Array original
    private int vector[];//Guarda una copia del vector que devuelve el método Array.getVector;
    private int c = 0;
    private String nombreColumnas[];
    private String datos[][];

    public Programa(int tamagnoVector) {
        establecerDarkLaf();
        this.tamagnoVector = tamagnoVector;
        this.nombreColumnas = new String[tamagnoVector];
        this.datos = new String[1][tamagnoVector];
        array = new Array(this.tamagnoVector);
        initComponents();
        actualizarPanel();
    }

    private void actualizarPanel() {
        this.vector = array.getVector();

        for (int i = 0; i < c; i++) {
            nombreColumnas[i] = String.valueOf(i);
        }

        for (int i = 0; i < c; i++) {
            datos[0][i] = String.valueOf(vector[i]);
        }

        DefaultTableModel modeloTabla = new DefaultTableModel(datos, nombreColumnas);

        modeloTabla.setColumnCount(this.c);
        modeloTabla.setRowCount(2);

        int anchos[] = {50, 150, 50, 70};

        this.tablaSalida.setModel(modeloTabla);
        this.salidaPosicionesOcupadas.setText(String.valueOf(c));
        this.salidaTamagnoVector.setText(String.valueOf(this.tamagnoVector));

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < c; i++) {
            this.tablaSalida.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTrasero = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salidaTamagnoVector = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salidaPosicionesOcupadas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalida = new javax.swing.JTable();
        barraMenu = new javax.swing.JMenuBar();
        menuInsertar = new javax.swing.JMenu();
        insertarInicio = new javax.swing.JMenuItem();
        insertarFinal = new javax.swing.JMenuItem();
        insertarIndice = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenu();
        eliminarInicio = new javax.swing.JMenuItem();
        eliminarFinal = new javax.swing.JMenuItem();
        eliminarPosicion = new javax.swing.JMenuItem();
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

        jLabel1.setText("Tamaño del vector:");

        salidaTamagnoVector.setEditable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("C:");

        salidaPosicionesOcupadas.setEditable(false);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tablaSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaSalida);

        javax.swing.GroupLayout panelTraseroLayout = new javax.swing.GroupLayout(panelTrasero);
        panelTrasero.setLayout(panelTraseroLayout);
        panelTraseroLayout.setHorizontalGroup(
            panelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraseroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTraseroLayout.createSequentialGroup()
                        .addComponent(salidaTamagnoVector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salidaPosicionesOcupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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

        insertarIndice.setText("Índice");
        insertarIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarIndiceActionPerformed(evt);
            }
        });
        menuInsertar.add(insertarIndice);

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

        eliminarPosicion.setText("Posición");
        eliminarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPosicionActionPerformed(evt);
            }
        });
        menuEliminar.add(eliminarPosicion);

        barraMenu.add(menuEliminar);

        menuBuscar.setText("Buscar");

        buscarSecuencial.setText("Secuencial");
        buscarSecuencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarSecuencialActionPerformed(evt);
            }
        });
        menuBuscar.add(buscarSecuencial);

        buscarBinaria.setText("Binaria");
        buscarBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBinariaActionPerformed(evt);
            }
        });
        menuBuscar.add(buscarBinaria);

        barraMenu.add(menuBuscar);

        menuOrdenar.setText("Ordenar");

        ordenarBurbuja.setText("Burbuja");
        ordenarBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarBurbujaActionPerformed(evt);
            }
        });
        menuOrdenar.add(ordenarBurbuja);

        ordenarInsercion.setText("Insercion");
        ordenarInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarInsercionActionPerformed(evt);
            }
        });
        menuOrdenar.add(ordenarInsercion);

        ordenarSeleccion.setText("Selección");
        ordenarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarSeleccionActionPerformed(evt);
            }
        });
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

    private void buscarBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBinariaActionPerformed

        int datoBuscar = 0;

        if (this.c == 0) {
            JOptionPane.showMessageDialog(null, "El vector está vacío.");
        } else {
            for (int i = 0; i < 1; i++) {
                try {
                    datoBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número a buscar: "));
                    i++;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número entero.");
                    i--;
                }
            }
            if (array.busquedaBinaria(datoBuscar) == -1) {
                JOptionPane.showMessageDialog(null, "No se encuentra el número " + datoBuscar + " en el vector.");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + datoBuscar + " se encuentra en la posición " + array.busquedaBinaria(datoBuscar));
            }
        }
    }//GEN-LAST:event_buscarBinariaActionPerformed

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
            this.actualizarPanel();
        }
    }//GEN-LAST:event_insertarInicioActionPerformed

    private void otherAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherAboutActionPerformed
        Presentacion presentacion = new Presentacion();
        presentacion.setVisible(true);

    }//GEN-LAST:event_otherAboutActionPerformed

    private void insertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarFinalActionPerformed
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
        if (array.insercionFinal(numeroInsertar) == 0) {
            JOptionPane.showMessageDialog(null, "Desbordamiento de memoria. Vector lleno.");
        } else {
            JOptionPane.showMessageDialog(null, "Inserción finalizada.");
            this.c = array.getC();
            this.actualizarPanel();
        }
    }//GEN-LAST:event_insertarFinalActionPerformed

    private void insertarIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarIndiceActionPerformed
        int numeroInsertar = -1;
        int posicionInsertar = -1;

        for (int i = 0; i < 1; i++) {
            try {
                numeroInsertar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número a insertar: "));
                i++;
                try {
                    do {
                        posicionInsertar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el índice: "));
                    } while (posicionInsertar < 0 || posicionInsertar >= this.c);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número entero");
                    i--;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un número entero");
                i--;
            }
        }
        if (array.insercionReferencia(numeroInsertar, posicionInsertar) == 0) {
            JOptionPane.showMessageDialog(null, "Desbordamiento de memoria. Vector lleno.");
        } else {
            JOptionPane.showMessageDialog(null, "Inserción finalizada.");
            this.c = array.getC();
            this.actualizarPanel();
        }
    }//GEN-LAST:event_insertarIndiceActionPerformed

    private void eliminarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarInicioActionPerformed
        if (this.array.eliminarInicio() == 0) {
            JOptionPane.showMessageDialog(null, "El vector está vacío.");
        } else {

            c--;
            actualizarPanel();
        }
    }//GEN-LAST:event_eliminarInicioActionPerformed

    private void buscarSecuencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarSecuencialActionPerformed
        int datoBuscar = 0;
        if (this.c == 0) {
            JOptionPane.showMessageDialog(null, "El vector está vacío.");
        } else {
            for (int i = 0; i < 1; i++) {
                try {
                    datoBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número a buscar: "));
                    i++;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número entero.");
                    i--;
                }
            }
            if (array.busquedaSecuencial(datoBuscar) == -1) {
                JOptionPane.showMessageDialog(null, "No se encuentra el número " + datoBuscar + " en el vector.");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + datoBuscar + " se encuentra en la posición " + array.busquedaSecuencial(datoBuscar));
            }
        }
    }//GEN-LAST:event_buscarSecuencialActionPerformed

    private void eliminarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFinalActionPerformed
        if (this.array.eliminarFinal() == 0) {
            JOptionPane.showMessageDialog(null, "El vector está vacío.");
        } else {
            c--;
            actualizarPanel();
        }
    }//GEN-LAST:event_eliminarFinalActionPerformed

    private void eliminarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPosicionActionPerformed
        int posicionEliminar = -1;
        if (this.c == 0) {
            JOptionPane.showMessageDialog(null, "El vector está vacío.");
        } else {
            for (int i = 0; i < 1; i++) {
                try {
                    posicionEliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posición a eliminar: "));
                    i++;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número entero.");
                    i--;
                }
            }

            if (this.array.eliminarPosicion(posicionEliminar) == 0) {
                JOptionPane.showMessageDialog(null, "El vector está vacío.");
            } else {
                c--;
                array.eliminarPosicion(posicionEliminar);
                actualizarPanel();
            }
        }
    }//GEN-LAST:event_eliminarPosicionActionPerformed

    private void ordenarBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarBurbujaActionPerformed
        if (array.ordenamientoBurbuja() == 0) {
            JOptionPane.showMessageDialog(null, "No fue posible hacer el ordenamiento.");
        } else {
            JOptionPane.showMessageDialog(null, "Ordenamiento realizado.");
            actualizarPanel();
        }
    }//GEN-LAST:event_ordenarBurbujaActionPerformed

    private void ordenarInsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarInsercionActionPerformed
        if (array.ordenamientoInsercion() == 0) {
            JOptionPane.showMessageDialog(null, "No fue posible hacer el ordenamiento.");
        } else {
            JOptionPane.showMessageDialog(null, "Ordenamiento realizado.");
            actualizarPanel();
        }
    }//GEN-LAST:event_ordenarInsercionActionPerformed

    private void ordenarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarSeleccionActionPerformed
        if (array.ordenamientoSeleccion() == 0) {
            JOptionPane.showMessageDialog(null, "No fue posible hacer el ordenamiento.");
        } else {
            JOptionPane.showMessageDialog(null, "Ordenamiento realizado.");
            actualizarPanel();
        }
    }//GEN-LAST:event_ordenarSeleccionActionPerformed

    private void ordenarSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarSortActionPerformed
        if (array.ordenamientoSort() == 0) {
            JOptionPane.showMessageDialog(null, "No fue posible hacer el ordenamiento.");
        } else {
            JOptionPane.showMessageDialog(null, "Ordenamiento realizado.");
            actualizarPanel();
        }
    }//GEN-LAST:event_ordenarSortActionPerformed

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
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem buscarBinaria;
    private javax.swing.JMenuItem buscarSecuencial;
    private javax.swing.JMenuItem eliminarFinal;
    private javax.swing.JMenuItem eliminarInicio;
    private javax.swing.JMenuItem eliminarPosicion;
    private javax.swing.JMenuItem insertarFinal;
    private javax.swing.JMenuItem insertarIndice;
    private javax.swing.JMenuItem insertarInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTable tablaSalida;
    // End of variables declaration//GEN-END:variables
}
