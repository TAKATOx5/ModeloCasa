/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package futuroingeniero;

import java.util.Scanner;

/**
 *
 * @author redes1
 */
public class Escenarios {
                public String[][] escenarioCasa() {
        String[][] matriz = {
            {"C9", "D1", "D1", "D1", "D1", "D1", "D1", "DV", "DV", "DV", "D1", "D1", "D1", "D1", "D1", "D1", "D1"},
            {"C9", "S2", "S2", "S2", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "D2", "ES", "ES", "ES", "PB"},
            {"C9", "SO", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "D2", "  ", "  ", "MC", "PB"},
            {"C9", "SO", "  ", "M5", "SE", "  ", "  ", "SI", "ME", "SI", "  ", "  ", "D2", "  ", "  ", "MC", "PB"},
            {"C9", "SO", "  ", "M5", "SE", "  ", "  ", "SI", "ME", "SI", "  ", "  ", "D2", "  ", "  ", "MC", "PB"},
            {"C9", "SO", "  ", "  ", "  ", "  ", "  ", "  ", "SI", "  ", "  ", "  ", "D4", "  ", "  ", "MC", "PB"},
            {"C9", "SO", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "D2", "D2", "D2", "D2", "PB"},
            {"C9", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "P2"},
            {"C9", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "M3"},
            {"C9", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "M3"},
            {"C9", "  ", "CE", "CE", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "P2"},
            {"C7", "C8", "C8", "C8", "C8", "C8", "C8", "  ", "  ", "  ", "C7", "C7", "C7", "C7", "C7", "C7", "PB"},
            {"C1", "M2", "M2", "  ", "  ", "  ", "MP", "  ", "  ", "  ", "M3", "  ", "  ", "  ", "MV", "MU", "C1"},
            {"CB", "  ", "  ", "  ", "  ", "  ", "T5", "C7", "C7", "  ", "T6", "  ", "  ", "  ", "  ", "  ", "CV"},
            {"CB", "  ", "  ", "  ", "  ", "  ", "C5", "  ", "  ", "  ", "C6", "  ", "  ", "  ", "  ", "  ", "CV"},
            {"CB", "  ", "  ", "  ", "  ", "  ", "C5", "  ", "  ", "  ", "C6", "  ", "  ", "  ", "  ", "  ", "CV"},
            {"CB", "SE", "SE", "  ", "SE", "SE", "C5", "B2", "B2", "B3", "C6", "SE", "SE", "  ", "SE", "SE", "CV"},
            {"C1", "SE", "SE", "  ", "SE", "SE", "C5", "  ", "  ", "  ", "C6", "SE", "SE", "  ", "SE", "SE", "C1"},
            {"PB", "C2", "C2", "C2", "C2", "C2", "C2", "C5", "C5", "B4", "PB", "C4", "C4", "C4", "C4", "C4","PB"}};
        return matriz;
    }
                //SALA                      COCINA
                //CUARTO MORADO         CUARTO AMARILLO

    public int filaasterico(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("C7")) {
                    fila = i;
                }
            }
        }
        return fila;
    }
    public int columasterico(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("*")) {
                    fila = j;
                }
            }
        }
        return fila;
    }
     int [] arreglo= new int[2];
     public int [] posX(String [][]matriz){
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[0].length; j++) {
                 if (matriz[i][j].equals("x")) {
                     arreglo[0]=i;
                     arreglo[1]=j;
                 }
             }
         }
         return arreglo;
     }
}

