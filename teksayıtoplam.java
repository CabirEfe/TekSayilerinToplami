/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class teksayıtoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner buz = new Scanner(System.in);
        System.out.println("Lütfen Bir Tek Sayı Giriniz");
        int sayi = buz.nextInt();
        int sayi2 = 0;
        int toplam = 0;
        
        while(sayi2<sayi){
        
           
        
          if(sayi2 % 2 == 0){
          sayi2++;
          }
          else{
          toplam = toplam + sayi2;
          
          sayi2++;
          }
        
          System.out.println(toplam);
        }                   
                            
       // System.out.println(toplam);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
