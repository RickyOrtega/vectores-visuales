package modelo;

import javax.swing.*;

public class Array {

    private int A[];
    private int tamagno;
    private int c;

    public Array(int tamagno) {
        this.tamagno = tamagno;
        this.c = 0;
        this.A = new int[tamagno];
    }

    public int getTamagno() {
        return tamagno;
    }

    public void setTamagno(int tamagno) {
        this.tamagno = tamagno;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int insercionInicio(int x) {
        if (c == tamagno) {
            return 0;
        } else {
            if (c == 0) {
                A[0] = x;
            } else {
                for (int k = c; k > 0; k--) {
                    A[k] = A[k - 1];
                }
                A[0] = x;
            }
            c++;
            return 1;
        }
    }

    public int insercionFinal(int x) {
        if (c == tamagno) {
            return 0;
        } else {
            A[c] = x;
            c++;
            return 1;
        }
    }

    //Recibe como parámetros un número x que se sitúa en un índice
    public int insercionReferencia(int x, int indice) {
        int aux;
        if (c == tamagno) {
            return 0;
        } else {
            if (c == 0) {
                A[indice] = x;
            } else {
                for (int k = c; k > indice; k--) {
                    A[k] = A[k - 1];
                }
                A[indice] = x;
            }
            c++;
            return 1;
        }
    }

    public int eliminarInicio() {
        if (c == 0) {
            return 0;
        } else {
            if (c > 1) {
                int k;
                for (k = 0; k < c - 1; k++) {
                    A[k] = A[k + 1];
                }
            }
        }
        c--;
        return 1;
    }

    public int eliminarFinal() {
        if (c == 0) {
            return 0;
        } else {
            c--;
        }
        return 1;
    }

    public int eliminarReferencia(int pos) {
        if (c == 0) {
            return 0;
        } else {
            if (0 <= pos && pos <= c - 1) {
                if (pos != 0) {
                    int k;
                    for (k = pos; k < c - 1; k++) {
                        A[k] = A[k + 1];
                    }
                }
                c--;
            } else {
                return 0;
            }
        }
        return 1;
    }
    
    //Búsqueda Secuencial
    public int busquedaSecuencial(int dato) {
        int pos = -1;

        if (c == 0) {
            return pos;
        } else {
            int k;
            for (k = 0; k < c; k++) {
                if (dato == A[k]) {
                    pos = k;
                    break;
                }
            }
        }
        return pos;
    }

    //Búsqueda Binaria
    public int busquedaBinaria(int dato) {
        int inferior;
        int superior;
        int mitad;
        int i;
        boolean flag = false;

        inferior = 0;
        superior = 5;//la cantidad de elementos
        i = 0;

        mitad = (inferior + superior) / 2;

        while (inferior <= superior && i < 5) {
            if (A[mitad] == dato) {
                flag = true;
                break;
            }
            if (A[mitad] > dato) {
                superior = mitad;
                mitad = (inferior + superior) / 2;
            }
            if (A[mitad] < dato) {
                inferior = mitad;
                mitad = (inferior + superior) / 2;
            }
            i++;
        }
        if (flag == true) {
            return mitad;
        } else {
            return -1;
        }
    }

    //Muestra el vector
    public void recorrer() {
        if (c == 0) {

        } else {
            for (int k = 0; k < this.c; k++) {
                System.out.print(this.A[k] + " ");
            }
        }
        System.out.println();
    }

    //Ordenamientos, nadie los pidió pero quiero y puedo jajaja
    //Método Burbuja
    public void ordenamientoBurbuja() {
        int aux;
        for (int i = 0; i < (c - 1); i++) {
            for (int x = 0; x < (c - 1); x++) {
                if (A[x] > A[x + 1]) {
                    aux = A[x];
                    A[x] = A[x + 1];
                    A[x + 1] = aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Ordenamiento realizado");
    }

    //Ordenamiento por inserción
    public void ordenamientoInsercion() {
        int posicion;
        int aux;
        for (int i = 0; i < c; i++) {
            posicion = i;
            aux = A[i];

            while ((posicion > 0) && (A[posicion - 1] > aux)) {
                A[posicion] = A[posicion - 1];
                posicion--;
            }
            A[posicion] = aux;
        }
        JOptionPane.showMessageDialog(null, "Ordenamiento realizado");
    }

    //Ordenamiento por Selección
    public void ordenamientoSeleccion() {
        int min;
        int aux;
        for (int i = 0; i < c; i++) {
            min = i;
            for (int x = i + 1; x < c; x++) {
                if (A[x] < A[min]) {
                    min = x;
                }
            }
            aux = A[i];
            A[i] = A[min];
            A[min] = aux;
        }
        JOptionPane.showMessageDialog(null, "Ordenamiento realizado");
    }
}
