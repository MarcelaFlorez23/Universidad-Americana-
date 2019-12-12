/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;

import java.util.Scanner;

/**
 *
 * @author Marcela Florez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
   int num,suma;
   suma=0;
   
        System.out.println("Digite el numero hasta el que decea sumar");
        num=sc.nextInt();
  for (int n=2; n<=num;n++){
      if (n%2==0){
          suma=suma+n;
         
          
                  
      }
  }
    System.out.println("la suma de los numeros pares es:"+suma);
    }
    
    }
    

