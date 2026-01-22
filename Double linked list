class DoublyLinkedList {

    // Node class
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Constructor
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    // 1. Insert at beginning
    public void insertAtBeginning(int x) {
        Node newNode = new Node(x);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode; // first node
        }

        head = newNode;
    }

    // 2. Insert at end
    public void insertAtEnd(int x) {
        Node newNode = new Node(x);
        newNode.prev = tail;

        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode; // first node
        }

        tail = newNode;
    }

    // 3a. Display forward
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 3b. Display backward
    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // 4a. Delete first node
    public void deleteFirst() {
        if (head == null) return;

        if (head.next == null) { // only one node
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // 4b. Delete last node
    public void deleteLast() {
        if (tail == null) return;

        if (tail.prev == null) { // only one node
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // 5. Delete node by value
    public void deleteByValue(int x) {
        Node current = head;

        while (current != null && current.data != x) {
            current = current.next;
        }

        if (current == null) return; // value not found

        if (current == head) deleteFirst();
        else if (current == tail) deleteLast();
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // 6. Delete node before a given value
    public void deleteBeforeValue(int value) {
        Node current = head;

        while (current != null && current.data != value) {
            current = current.next;
        }

        if (current == null || current.prev == null) return; // nothing to delete

        Node nodeToDelete = current.prev;

        if (nodeToDelete == head) deleteFirst();
        else {
            nodeToDelete.prev.next = current;
            current.prev = nodeToDelete.prev;
        }
    }

    // 7. Delete node after a given value
    public void deleteAfterValue(int value) {
        Node current = head;

        while (current != null && current.data != value) {
            current = current.next;
        }

        if (current == null || current.next == null) return; // nothing to delete

        Node nodeToDelete = current.next;

        if (nodeToDelete == tail) deleteLast();
        else {
            current.next = nodeToDelete.next;
            nodeToDelete.next.prev = current;
        }
    }

    // 8a. Find minimum
    public void findMin() {
        if (head == null) return;

        int min = head.data;
        Node current = head;

        while (current != null) {
            if (current.data < min) min = current.data;
            current = current.next;
        }

        System.out.println("Minimum: " + min);
    }

    // 8b. Find maximum
    public void findMax() {
        if (head == null) return;

        int max = head.data;
        Node current = head;

        while (current != null) {
            if (current.data > max) max = current.data;
            current = current.next;
        }

        System.out.println("Maximum: " + max);
    }
}
