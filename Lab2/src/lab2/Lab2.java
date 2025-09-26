/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Phillips
 */
public class Lab2 {

    public static void main(String[] args) {
        // Se va a intentar hacer el proceso en el try
        try {
            String[] nombres = new String[3];
            int numeros[] = new int[2]; // Inicializa con 2 posiciones
            numeros[0] = 10;
            numeros[1] = 20;
            //numeros[2] = 30; // Esto causaría un error
            //numeros[3] = 40;

            // 1. Preguntar tamaño del arreglo
            String size = JOptionPane.showInputDialog("Ingrese el tamaño del arreglo");

            // 2. Inicializar el arreglo con el tamaño 
            numeros = new int [Integer.parseInt(size)];
            
            //3. Llenar el arreglo
            
            JOptionPane.showMessageDialog(null, Arrays.toString(numeros));

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,
                    "El arreglo se está desbordando", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Aquí podrías cerrar recursos si fuera necesario
        }
    }

    private static void sout(String fin_del_Programa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
