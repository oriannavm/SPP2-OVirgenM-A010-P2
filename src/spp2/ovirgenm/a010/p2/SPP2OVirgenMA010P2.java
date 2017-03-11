/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.a010.p2;
import java.util.Scanner;

/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMA010P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] a,b,r;
        int tamaño;
        tamaño=solicitaEntero(" el tamaño del arreglo: ");
        
        //crear matrices
        a= crearMatriz(" A", tamaño);
        b= crearMatriz(" B", tamaño);
                
        //Resta matrices
       RestaMatrices (a,b);
       //Multiplicación matrices
       MultipMatrices (a,b);
    }
    public static int solicitaEntero(String mensaje){
        Scanner keyboard = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca" + mensaje);
        try{
        varEntera = keyboard.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("La variable es incorrecta ");
            flag=true;
            keyboard.nextLine();
    } 
  } while (flag); 
    return varEntera;
    }
    public static int[][]crearMatriz(String nom, int t){
        Scanner keyboard = new Scanner (System.in);
        System.out.println("\nIntroduzca los elementos de la matriz" + nom);
        int [][]miMatriz = new int [t][t];
        for (int i=0; i<miMatriz.length; i++){
        for (int j= 0; j<miMatriz[i].length; j++){
            miMatriz[i][j]= solicitaEntero(" El valor corresponiente es: ");
            }
            
        }
        
    return miMatriz;
    }
    public static void RestaMatrices(int[][]a, int [][]b){
        System.out.println("\nRestas: ");
        int [][]r = new int[a.length][a.length];
        for (int i=0; i<r.length; i++){
        for (int j= 0; j<r[i].length; j++){
            r[i][j]= a[i][j]-b[i][j];
            // Mostrar resultado
                System.out.println("El valor ("+i+","+j+") es igual a: " + r[i][j]);
            }   
        }   
    }
    public static void MultipMatrices(int[][]a, int [][]b){
    System.out.println("\nProductos:");
        int [][]r = new int[a.length][a.length];
        for (int i=0; i<r.length; i++){
        for (int j= 0; j<r[i].length; j++){
        for (int z=0; z<r[j].length; z++) {
                 r[i][j]+= a[i][z]*b[z][j];
                   
                }
               // Muestre resultado
                System.out.println("El valor ("+i+","+j+") es igual a: " + r[i][j]);
            }
    }
}
}
    

