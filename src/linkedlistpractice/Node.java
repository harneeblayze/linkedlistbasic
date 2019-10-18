/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistpractice;

/**
 *
 * @author appzone
 */
public class Node {
   private int data;
   private Node next;
   private Node head;
    public Node(int dayta){
        this.data = dayta;
        //this.node = n;
    }
    
    public void addFront(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
            newNode.next = head;
            head = newNode;
        
        
    }
    
    public int getFirst(){
        if(head == null)
            return -1;
        return head.data;
        
    }
    
    public int getLast(){
        if(head == null)
            return -1;//IllegalStateException("no data");
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        return currentNode.data;
        
    }
    
    public void addBack(int data){
        //Node current;
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        //since current is already head we should be checking for current.next if it is null
        while(current.next!=null){
            current = current.next;
        }
        
        current.next = newNode;
        
    }
    
    public int size(){
        if(head == null)
            return 0;
        int count = 1;
        Node current = head;
        //only when current.next is null that we have reached the end
        while(current.next!=null){
            current = current.next;
            count++;
        }
        return count;
    }
    
    public void clear(){
        head = null;
    }
    
    public void delete(int value){
        if(head == null)
            return;
        if(head.data == value){
            head = head.next;
            return;
        }
        
        Node current = head;
        while(current.next.data!= value){
            current = current.next;
        }
        current.next = current.next.next;
        
    }
    
    
}
