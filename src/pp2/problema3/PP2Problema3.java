/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema3;
import java.util.*;
/**
 *
 * @author Enano
 */
public class PP2Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int num;
        int []fact;
        //Resolucion
        num=getInf();
        fact = calcFact(num);
        printFact(fact, num);
    }
    public static int getInf () //Se recibe la información.
    {
        Scanner in = new Scanner (System.in);
        System.out.println("**** Bienvenid@ al programa ****");
        System.out.println("Ingrese el número del cual desea calcular los factoriales: ");
        return in.nextInt();
    }
    public static int [] calcFact (int num)
    {
        int[] res= new int [num];//Se crea un arreglo del tamaño del número al que se quiere llegar.
        for (int i=1;i<num;i++)  //El ciclo hará los factoriales del número iniciando desde 1
        {                        //Hasta llegar al factorial anterior del número.
            res [i-1]=num*i;     //El resultado del factorial se guarda dentro del arreglo.
        }                              
        return res;
    }
    public static void printFact(int[] r, int n)
    {
        System.out.println("Los factoriales del número "+n +" son: ");
        for (int i=0;i<r.length-1;i++)  
        {
            System.out.print("["+r[i]+"] ");    //Se imprimen 1 por 1 los factoriales 
        }                                       //Utilizando el contador como coordenada.
        System.out.println("");
    }
}
