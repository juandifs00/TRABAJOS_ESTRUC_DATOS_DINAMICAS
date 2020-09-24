/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;
/**
 *
 * @author samaniw
 */
public class Lists{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingleLinkedList<Integer> miListaS = new SingleLinkedList<>();
        miListaS.addLast(10);
        miListaS.addLast(20);
        miListaS.addLast(55);
        miListaS.addLast(90);
        miListaS.addLast(100);  
        System.out.println("El número mayor de la lista es: " + miListaS.getMaj());
        System.out.println("El número menor de la lista es: " + miListaS.getMin());
        System.out.println("Datos de la lista simple: " + miListaS.showData());
        System.out.println("El promedio es: " + miListaS.getAverage());
        miListaS.deleteLast();
        System.out.println("-------------------------------------------------------------------");
        System.err.println("Después de eliminar el último dato, la lista es la siguiente:");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Datos de la lista simple: " + miListaS.showData());
        System.out.println("El promedio es: " + miListaS.getAverage());
        System.out.println("El número menor de la lista es: " + miListaS.getMin());
        System.out.println("El número mayor de la lista es: " +miListaS.getMaj());
        System.out.println();
        
        DoubleLinkedList<Integer> miListaD = new DoubleLinkedList<>();
        miListaD.addOrdered(10);
        miListaD.addOrdered(34);
        miListaD.addOrdered(42);
        miListaD.addOrdered(0);
        miListaD.addOrdered(8);

        System.out.println("Datos de la lista enlazada doble: " + miListaD.showData());
        System.out.println("Existe el número 0 en la lista? " + miListaD.exist(0));
        System.out.println("Existe el número 11 en la lista? " + miListaD.exist(11));
        miListaD.delete();
        System.out.println("Datos de la lista enlazada doble despúes de eliminar el primer dato: " 
                + miListaD.showData());
        System.out.println();
        
        CircularSingleLinkedList<Integer> circular1 = new CircularSingleLinkedList<>();
        circular1.addLast(47);
        circular1.addLast(14);
        circular1.addLast(4);
        circular1.addLast(90);
        System.out.println("Lista 1: "+ circular1.showData());
        circular1.deleteLast();
        System.out.println("Lista 1 después de borrar el último dato: " + circular1.showData());
        CircularSingleLinkedList<Integer> circular2 = new CircularSingleLinkedList<>();
        circular2.add(30);
        circular2.add(17);
        circular2.add(25);
        circular2.add(11);
        System.out.println("Lista 2: "+ circular2.showData());
        
        circular1.joinList(circular2);
        System.out.println("Listas unidas: "+ circular1.showData());
        System.out.println("");
        
        CircularDoubleLinkedList<Integer> miListaCD = new CircularDoubleLinkedList<>();
        miListaCD.addOrdered(10);
        miListaCD.addOrdered(20);
        miListaCD.addOrdered(20);
        miListaCD.addOrdered(33);
        miListaCD.addOrdered(40);
        miListaCD.addOrdered(15);
        miListaCD.addOrdered(9);
        System.out.println("Datos de la lista circular doble de manera ordenada: " + miListaCD.showData());
        miListaCD.delete();
        miListaCD.deleteLast();
        System.out.println("Datos de la lista circular doble después de borrar el primer y último dato: " 
                + miListaCD.showData());
        
        System.out.println("Datos de la lista circular doble de manera descendente: " + miListaCD.showDataDesc());
        System.out.println("");
    }
}