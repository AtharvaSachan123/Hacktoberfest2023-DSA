class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to search for a specific element in the linked list
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true; // Element found
            }
            current = current.next;
        }
        return false; // Element not found
    }
}

public class LinkedListSearch {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert some elements into the linked list
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        int keyToSearch = 3;
        if (list.search(keyToSearch)) {
            System.out.println(keyToSearch + " is found in the linked list.");
        } else {
            System.out.println(keyToSearch + " is not found in the linked list.");
        }

        int keyNotInList = 6;
        if (list.search(keyNotInList)) {
            System.out.println(keyNotInList + " is found in the linked list.");
        } else {
            System.out.println(keyNotInList + " is not found in the linked list.");
        }
    }
}
