/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    static Node head;
    public static void addFirst(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public static void addLast(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        Node newNode = new Node(data);
        curr.next = newNode;
    }
    public static void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
    }
    public static void deleteLast(){
        if(head == null){
            return;
        }
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }
    public static void printLL(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public static int count(){
        if(head == null){
            return 0;
        }
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public static boolean isLoop(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void detectAndBreak(){
        Node slow = head;
        Node fast = head;
        boolean loop = false;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                loop = true;
                break;
            }
        }
        if(loop == false){
            return;
        }
        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
    }
    public static Node midNode(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr !=    null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
	public static void main(String[] args) {
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next  = new Node(4);
		head.next.next.next.next = new Node(5);
		//head.next.next.next.next.next = head.next.next;
// 		addFirst(0);
// 		addLast(6);
// 		deleteFirst();
// 		deleteLast();
//         detectAndBreak();
// 		printLL();
// 		System.out.println(isLoop());
// 	    System.out.println(midNode().data);
        reverse();
        printLL();
		
	}
}
