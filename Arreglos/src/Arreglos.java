/**
 *
 * @author Juan Diego Rodriguez
 */
public class Arreglos {

    public static void main(String[] args) {
        
        arreglossecun numeros = new arreglossecun();
        int[] num = new int[]{20,15,99,10,2,8,19,};
        int t = num.length - 1;
        int entero = 1;
        System.out.println("El número está en el arreglo: " + numeros.versiexiste(num,entero,t));
        
    }
    
}