/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma;

/**
 *
 * @author Juan Diego Rodriguez
 */
public class palindromasecun {
    
    public boolean verifpalindroma(String s){
      
        if(s.length() == 0){
            return true;
        }else if (s.length() == 1){
            return true;
        }else if(s.charAt(0) == s.charAt(s.length()-1)){
            s = s.substring(1, s.length() - 1);
            return verifpalindroma(s);     
        }else{
            return false;
        }
        
    }
    
}
