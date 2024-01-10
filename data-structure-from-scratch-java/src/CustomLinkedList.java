public class CustomLinkedList <T> {
    class Node<T> {
        T value;
        Node<T> next;
        public Node(T value){
            this.value = value;
            this.next = null;
        }
    }

    Node<T> head;
    // Node tail = head;
    public CustomLinkedList(){
        this.head = null;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            // If the list is empty, the new node becomes the head
            head = newNode;
        } else {
            Node<T> current = head;

            while(current.next != null){
                current = current.next;
            }

            current.next = newNode;

        }
    }

    public void addLast(T data){
        add(data);
    }

    public void addFirst(T data){
        Node<T> current = head;
        head = new Node<>(data);
        head.next = current;
    }

    public void remove(int index){
        int counter = 1;
        Node<T> current = head;

        while (current != null & counter < index-1 & current.next != null) {
            current = current.next;
            counter++;
        }
        current.next = current.next.next;
    }

    public void print(){
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}

