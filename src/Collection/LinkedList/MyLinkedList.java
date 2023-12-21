package Collection.LinkedList;

import org.w3c.dom.Node;

import java.lang.reflect.Type;
import java.util.LinkedList;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public static class Node<T> {
        private Node<T> next;
        T data;

        public Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T>newNode=new Node<>(data);
        if (head==null){
            head=newNode;
        }else {
            Node<T>current=head;
            while (current.next!=null){
                current=current.next;
            }
            current=newNode;
        }
        size++;
    }
    public void get(int number){
        if (number<0 ||number>size){
            throw new IndexOutOfBoundsException();
        }
        Node<T>current=head;
        for (int i = 0; i < number-1; i++) {
            current=current.next;
        }
        System.out.println(current.data);
    }
    public void remove(int number){
        if (number<0||number>size){
            throw new IndexOutOfBoundsException();
        }
        if(number==0){
            head=head.next;
        }else {
            Node<T>current=head;
            for (int i = 0; i < number; i++) {
                current=current.next;
            }
            current.next=current.next.next;
        }
        size--;
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {

        MyLinkedList list=new MyLinkedList();
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println(list.size);
        list.remove(2);
        System.out.println(list.size);
    }
}
