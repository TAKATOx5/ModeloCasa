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
            {"PB", "C1", "  ", "C2", "PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB","PB"},
            {"PB", "  ", "  ", "  ", "PB", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "SO", "SO", "SO", "PB"},
            {"PB", "  ", "  ", "  ", "PB", "  ", "  ", "SI", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "SO", "PB"},
            {"PB", "  ", "  ", "  ", "PB", "  ", "SI", "ME", "SI", "  ", "  ", "  ", "  ", "  ", "  ", "SO", "PB"},
            {"PB", "RF", "  ", "  ", "  ", "  ", "SI", "ME", "SI", "  ", "  ", "  ", "SO", "  ", "  ", "SO", "PB"},
            {"PB", "PB", "PB", "PB", "PB", "  ", "  ", "SI", "  ", "  ", "  ", "  ", "SO", "  ", "  ", "SO", "PB"},
            {"PB", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "SO", "PB"},
            {"PB", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"PB", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"PB", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"PB", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "MU", "MU", "  ", "PB"},
            {"PB", "C3", "C3", "C3", "C3", "C3", "  ", "PB", "  ", "  ", "PB", "  ", "C1", "C1", "C1", "C1","PB"},
            {"C1", "MU", "MU", "  ", "  ", "  ", "  ", "C5", "  ", "  ", "C5", "  ", "  ", "  ", "MU", "MU", "PB"},
            {"C1", "  ", "  ", "  ", "  ", "  ", "  ", "C5", "  ", "PB", "C5", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"C1", "  ", "  ", "  ", "  ", "  ", "  ", "C5", "  ", "  ", "C5", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"C1", "  ", "  ", "  ", "  ", "  ", "  ", "C5", "  ", "  ", "C5", "  ", "  ", "  ", "  ", "  ", "PB"},
            {"C1", "CA", "  ", "  ", "  ", "  ", "CA", "C5", "  ", "  ", "C5", "CA", "  ", "  ", "CA", "CA", "PB"},
            {"C1", "CA", "  ", "  ", "  ", "  ", "CA", "C5", "BA", "BA", "C5", "CA", "  ", "  ", "CA", "CA", "PB"},
            {"PB", "C4", "C4", "C4", "C4", "C4", "C4", "PB", "C5", "C5", "PB", "C2", "C2", "C2", "C2", "C2","PB"}};
        return matriz;
    }


    public int filaasterico(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("*")) {
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

