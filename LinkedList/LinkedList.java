import java.util.*;
public class LinkedList {
    public Node head;
    public int listCount;
    
    public LinkedList(){
        head = new Node(4);
        listCount = 1;
    }
    
    public void show(){
        Node current = head;
         while (current != null && current.next != null){
             System.out.print(current.data + "->");
             current = current.next;
        }
        if(head == null){
             System.out.println("There is nothing in the list.");
        }
        else{
            System.out.println("last one -->" + current.data);
        }
    }
    public void displayLength(){
        System.out.println("The length of the list is " + listCount);
    }
    public boolean addHead(int d){
        Node newhead = new Node(d);
        newhead.next = head;
        head = newhead;
        listCount++;
        return true;
    }
    public boolean addTail(int d){
        Node tail = new Node(d);
        Node current = head;
        while (current.next != null){
             current = current.next;
        }
        current.next = tail;
        listCount++;

        return true;
    }
    public boolean removeHead(){
        head = head.next;
        listCount--;
        return true;
    }
    public boolean removeTail(){
        Node current = head;
        if(head.next == null){
            head = null;
        }
        else{
            for(int i = 2; i < listCount; i++){
                current = current.next;
            }
            current.next = null;
        }
        
        
        
        //System.out.println(current.data);

        return true;
    }
    
    public boolean insert(int d){
        Node newNode = new Node(d);
        if(newNode.data <= head.data){
            newNode.next = head;
            head = newNode;
            
        }
        else{
            Node current = head;
            while (current.next != null)
                current = current.next;
            if(current.data < newNode.data)
                current.next = newNode; 
            else{
                current = head;
                while(current.next != null && current.next.data< newNode.data){
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
        }
        listCount++;
        return true;
    }
    public boolean remove(int d){
        if(head.data == d){
            head = head.next;
            listCount--;
        }
        else{
            Node current = head;
                while(current.next != null && current.next.data !=d){
                    current = current.next;
                }
                if(current.next != null && current.next.data == d){
                    current.next = current.next.next; 
                    listCount--;
                }
                else if(current.next == null){
                    System.out.println("This number is not in the list.");
                }
        }
        return true;
    }
    public boolean exists(int d){
        Node current = head;
        boolean check = false;
        if(head.data == d){
            check = true;
        }
        while (current.next != null){
            current = current.next;
            if(current.data == d){
                check = true;
            }
        }
        if(check){
            System.out.println(d+" does exist in the list.");
        }
        else{
            System.out.println(d + " does not exist in the list.");
        }
        return true;
    }
    public boolean reverse(){
        int numSwap = listCount/2;
        while(numSwap>0){
            Node front = head;
            Node end = head;
            for(int i = 1; i < numSwap; i++){
                front = front.next;
            }
            for(int j = 1; j< listCount-numSwap+1;j++){
                end = end.next;
            }
            int x = front.data;
            front.data = end.data;
            end.data = x;
            numSwap--;
        }
    return true;
    }
    //Odd Game
    public void oddGame(){
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("What number do you want to place into the linked list?");
            int num = input.nextInt();
            if(num%2 != 0 && num%5 != 0){
                addTail(num);
            }
            else if(num%2 != 0 && num%5 == 0){
                addHead(num*2);
            }
            else if(num%2 == 0 && num%5 != 0){
                removeTail();
            }
            else if(num%2 == 0 && num%5 == 0){
                removeHead();
            }
            if(calcTotal()>= 100){
                flag = false;
            }
            show();
            System.out.println("The total is " + calcTotal());

        }
        show();
        System.out.println("The final total is " + calcTotal());
    }



//method will stop based on the above rules

//method will display the final total 

//method will display the entire list

    public int calcTotal(){
        Node current = head;
        int sum = 0;
        while (current != null && current.next != null){
            sum += current.data;
            current = current.next;
        }
        if(head != null)
            sum+= current.data;
        return sum;
    }
}