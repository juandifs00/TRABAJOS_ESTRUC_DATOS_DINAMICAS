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
public class DoubleLinkedList<T extends Number & Comparable> implements Ilist<T> {

    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private int size;

    public DoubleLinkedList(){
        head = tail = null;
    }

    @Override
    public boolean isEmpty(){
        return head == null;
    }
    /**
     * Determinar si un dato ingresado por el usuario existe en la lista.
     * @param d Dato a buscar
     * @return Verdadero si lo encuentra
     */
    public boolean exist(T d){
        //recorrer la estructura
        DoubleNode<T> node = head;
        while(node.getNextNode() != null){
            if(node.getData() == d){
                return true;
            }
            node = node.getNextNode();
        }
        return node.getData() == d;  
    }

    @Override
    public void add(T d){

        if (isEmpty()){
            head = tail = new DoubleNode<>(d);
        }else{
            DoubleNode<T> newNode = new DoubleNode<>(null, d, head);
            head.setPreviousNode(newNode);
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T d){
        if (isEmpty()){
            head = tail = new DoubleNode<>(d);
        }else{
            DoubleNode<T> newNode = new DoubleNode<>(tail, d, null);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    @Override
    public void addOrdered(T d){

        if (isEmpty() || head.getData().compareTo(d) > 0) {
            add(d);
            return;//finalizar el método 
        }
        if (tail.getData().compareTo(d) < 0) {
            addLast(d);
            return;
        }
        DoubleNode<T> current = head;
        while (current.getData().compareTo(d) < 0){
            current = current.getNextNode();
        }
        DoubleNode<T> anterior = current.getPreviousNode();
        DoubleNode<T> newNode = new DoubleNode<>(anterior, d, current);
        anterior.setNextNode(newNode);
        current.setPreviousNode(newNode);
    }

    @Override
    public void delete(){
        if (isEmpty()){
            System.out.println("La lista está vacía");
        }else if (head == tail) {
            head = tail = null;
        }else{
            head.getNextNode().setPreviousNode(null);
            head = head.getNextNode();
        }
    }

    @Override
    public void deleteLast(){
        if (isEmpty()){
            System.out.println("La lista está vacía");
        }else if (head == tail){
            head = tail = null;
        }else{
            //penultimo
            tail.getPreviousNode().setNextNode(null);
            tail = tail.getPreviousNode();
        }
    }
    
    public boolean EliminarDuplicados(){
        if (isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            DoubleNode<T> current = head;
            while(current != null){
                DoubleNode<T> next = current.getNextNode();
                while(next != null){
                    if(current.getData() == next.getData()){
                        if(next == tail){
                            tail = tail.getPreviousNode();
                            tail.setNextNode(null);   
                        }else{
                           next.getPreviousNode().setNextNode(next.getNextNode());
                           next.getNextNode().setPreviousNode(next.getPreviousNode());
                        }
                    }
                    next = next.getNextNode();
                }
                current = current.getNextNode();
            }
        }

        return false;
    }

    @Override
    public String showData(){
        if (isEmpty()){
            return "La lista está vacía";
        }else{
            String data = "";
            for (DoubleNode<T> i = head; i != null; i = i.getNextNode()) {
                data += i.getData() + " ";
            }
            return data;
        }
    }
    /**
     * Retorna el total de datos
     *
     * @return the size
     */
    public int getSize()
{        return size;
    }
}