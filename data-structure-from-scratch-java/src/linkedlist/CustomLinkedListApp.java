package linkedlist;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CustomLinkedListApp {
    public static void main(String[] args) {
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();

        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.print();

        System.out.println("");
        System.out.println("");

        linkedList.addFirst("zero");
        linkedList.print();

        System.out.println("");
        System.out.println("");

        linkedList.remove(3);
        linkedList.print();

    }
}