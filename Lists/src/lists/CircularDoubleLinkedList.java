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
public class CircularDoubleLinkedList<T extends Number & Comparable> implements Ilist<T> {

    DoubleNode<T> head;

    public CircularDoubleLinkedList() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    private DoubleNode<T>addNode(T d) {
        DoubleNode<T> newNode= new DoubleNode<>(d);
        if(isEmpty()){
            head= newNode;
            newNode.setNextNode(newNode);
            newNode.setPreviousNode(newNode);
        }else{
            newNode.setPreviousNode(head.getPreviousNode());
            newNode.setNextNode(head);
            head.getPreviousNode().setNextNode(newNode);
            head.setPreviousNode(newNode);
            head=newNode;
        }
        return newNode;
    }
    
    @Override
    public void add(T d) {
        head = addNode(d);
    }

    @Override
    public void addLast(T d) {
        addNode(d);
    }
    
    private boolean existen(T d) {

        DoubleNode<T> current = head;
        while (current.getNextNode() != head) {
            if (current.getData() == d) {
                return true;
            }
            current = current.getNextNode();
        }

        return current.getData() == d;
    }

    @Override
    public void addOrdered(T d) {
       if (isEmpty() || head.getData().compareTo(d) > 0) {
            add(d);
        }else{
            if (existen(d)) {
                System.err.println("El dato agregado ya se encuentra en la lista");
            }else if(head.getPreviousNode().getData().compareTo(d) < 0){
                addLast(d);   
            }else{
                DoubleNode<T> current = head;
                while (current.getData().compareTo(d) < 0) {
                    current = current.getNextNode();
                }
                DoubleNode<T> preceding = current.getPreviousNode();
                DoubleNode<T> newNode = new DoubleNode<>(preceding, d, current);
                preceding.setNextNode(newNode);
                current.setPreviousNode(newNode);
            }   
        }
       //Agregar datos ordenados sin repetir valor
       //(si el dato ya se encuentra en la lista, no ingresarlo y mostrar advertencia).
    }

    @Override
    public void delete(){
        if (isEmpty()) {
            System.err.println("La lista está vacía");
        }else{
            head.getPreviousNode().setNextNode(head.getNextNode());
            head.getNextNode().setPreviousNode(head.getPreviousNode());
            head = head.getNextNode();
        }
        //Eliminar el primer dato.
    }

    @Override
    public void deleteLast(){
        if (isEmpty()){
            System.err.println("La lista está vacía");
        }else{
            head.getPreviousNode().getPreviousNode().setNextNode(head);
            head.setPreviousNode(head.getPreviousNode().getPreviousNode());
        }
        //Eliminar el último dato.
    }
/**
 * Mostrar los datos de forma descendente.
 * @return LIsta de datos en orden descendente
 */
    public String showDataDesc(){
        if (isEmpty()) {
            return "La lista está vacia";
        }else{
            String data = "";
            DoubleNode<T> tail = head.getPreviousNode();
            for (DoubleNode<T> i = tail; i != head; i = i.getPreviousNode()) {
                data += i.getData() + " ";
            }
            return data += head.getData();
        }
    }
    
    @Override
    public String showData() {
        if (isEmpty()) {
            return "La lista está vacia";
        }else{
            String data = "";
            DoubleNode<T> tail = head.getPreviousNode();
            for (DoubleNode<T> i = head; i != tail; i = i.getNextNode()) {
                data += i.getData() + " ";
            }
            return data += tail.getData();
        }
    }
}