/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par_ou_impar_karensantos;
import java.util.Scanner;
public class Par_ou_impar_karensantos {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num;
       System.out.print("Digite um número: ");
       num= input.nextInt();
       if ((num %2)==0){
           System.out.print("O número é par");        
       }
       else {
          System.out.print("O número é ímpar");
       }
    }
    
}
