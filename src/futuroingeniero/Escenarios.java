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

    Scanner lector = new Scanner(System.in);          
        public String[][] escenarioCasa() {
        String[][] matriz = {
            {"  ", "D1", "  ", "D1", "PB", "D1", "D1", "D1", "D1", "D1", "D1", "D1", "D1", "D1", "D1", "D1", "D1"},
            {"  ", "  ", "  ", "  ", "C9", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "SO", "SO", "SO", "PB"},
            {"PB", "  ", "  ", "  ", "C9", "  ", "  ", "SI", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "SO", "PB"},
            {"PB", "  ", "  ", "  ", "C9", "  ", "SI", "ME", "SI", "  ", "  ", "  ", "  ", "  ", "  ", "SO", "PB"},
            {"PB", "RF", "  ", "  ", "  ", "  ", "SI", "ME", "SI", "  ", "  ", "  ", "SO", "  ", "  ", "SO", "PB"},
            {"PB", "D1", "D1", "D1", "D1", "  ", "  ", "SI", "  ", "  ", "  ", "  ", "SO", "  ", "  ", "SO", "PB"},
            {"C9", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "SO", "PB"},
            {"C9", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"CP", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "MU", "MU", "  ", "PB"},
            {"C7", "C7", "C7", "C7", "C7", "C7", "C7", "C7", "  ", "  ", "C8", "C8", "C8", "C8", "C8", "C8", "PB"},
            {"C1", "MU", "MU", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "MU", "MU", "PB"},
            {"C1", "  ", "  ", "  ", "  ", "  ", "  ", "C5", "  ", "C7", "C6", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"C1", "  ", "  ", "  ", "  ", "  ", "  ", "C5", "  ", "  ", "C6", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"C1", "  ", "  ", "  ", "  ", "  ", "  ", "C5", "  ", "  ", "C6", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"C1", "CA", "  ", "  ", "  ", "  ", "CA", "C5", "  ", "  ", "C6", "CA", "  ", "  ", "CA", "CA", "PB"},
            {"C1", "CA", "  ", "  ", "  ", "  ", "CA", "C5", "  ", "  ", "C6", "CA", "  ", "  ", "CA", "CA", "PB"},
            {"PB", "C4", "C4", "C4", "C4", "C4", "C4", "PB", "C5", "C5", "PB", "C2", "C2", "C2", "C2", "C2","PB"}};
        return matriz;
    }

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

