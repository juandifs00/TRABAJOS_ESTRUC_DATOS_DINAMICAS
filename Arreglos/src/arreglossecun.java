/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Diego Rodriguez
 */
public class arreglossecun {
    
    public boolean versiexiste(int[] a, int b, int i){
        
        if(i < 0){
            return false;
        }else if(a[i] == b){
            return true;
        }else{
            i--;
            return versiexiste(a, b, i);
        }
        
    }
    
}
