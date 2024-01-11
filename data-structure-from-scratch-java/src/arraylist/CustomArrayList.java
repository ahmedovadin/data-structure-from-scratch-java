package arraylist;

import java.util.Arrays;

public class CustomArrayList<T> {
    Object[] array;
    private int length;
    private int size;

    public CustomArrayList(){
        length = 10;
        array = new Object[length];
        size = 0;
    }

    void add(T element){
        validateOrWideSpace();
        array[incrementSize()] = element;
    }

    void addFirst(T element){
        validateOrWideSpace();
        System.arraycopy(array, 0, array, 1, size);
        array[0] = element;
        incrementSize();
    }

//    void addLast(T element){
//        validateOrWideSpace();
//        System.arraycopy(array, 0, array, 1, size);
//        array[0] = element;
//        incrementSize();
//    }

    void validateOrWideSpace(){
        if(size == array.length){
            array = Arrays.copyOf(array, array.length + 5);
        }
    }

    int incrementSize(){
        return size++;
    }
}
