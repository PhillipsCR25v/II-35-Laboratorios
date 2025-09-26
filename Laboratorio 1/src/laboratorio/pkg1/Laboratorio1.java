/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio.pkg1;

/**
 *
 * @author Phillips
 */
public class Laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        
        String [] variables = new String [3];
        // ["uno"] ["dos"] ["tres"]
        
        int edad1 = 10;
        int edad2 = 22;
       boolean esMayor = false;
       
       esMayor = edad1 >= 18;
       
       boolean esMayor2 = edad2 >= 18;
       
       System.out.println("edad1: " + (esMayor ? "Si Es Mayor" : "Es menor"));
       System.out.println("edad1: " + (esMayor2 ? "Si Es Mayor" : "Es menor"));
       
      String nombre = "Victor";
      System.out.println(nombre);
      char inicial = nombre.charAt(0);
      char Ultima = nombre.charAt(nombre.length() -1);
      int tamaño = (nombre.length());
      System.out.println(inicial);
      System.out.println(Ultima + "\n" + tamaño) ;
       
       
      //Decimales
      int numero = 10;
      double division;
      division = (float) numero /4;
      System.out.println(division);
      
              
    }
    
}
