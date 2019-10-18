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
public class Linkedlistpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Node data = new Node(3);
        data.addFront(4);
        data.addFront(7);
        //data.delete(4);
        System.out.println(data.size());
        System.out.println(data.getFirst());
        data.delete(7);
        System.out.println(data.getFirst());
        // TODO code application logic here
    }
    
}
