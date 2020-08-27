/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Diego Rodriguez
 */
public class tribonaccisecun {
    
     public String tribonacci1(int n, int i) {
        
        if(i < n){
            System.out.println(tribonacci(i) + " ");
            i++;
            return tribonacci1(n, i);
        }else{
            return "";
        }
    }
      
    private int tribonacci(int n){
        if(n == 0) {  
            return 0;
        } else if(n == 1) {
            return 0;
        }else if(n == 2){
            return 1;
        }else {    
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
        
    }
        
}
