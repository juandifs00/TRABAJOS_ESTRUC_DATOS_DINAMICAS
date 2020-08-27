package palindroma;

/**
 *
 * @author Juan Diego Rodriguez
 */
public class PALINDROMA {
    
    public static void main(String[] args) {
        
        palindromasecun letras = new palindromasecun();
        String palabra = "abcdcba";
        System.out.println("La palabra es: " + letras.verifpalindroma(palabra));
    }
    
}