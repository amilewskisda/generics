package genericsMethodExample;

public class Main {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Character[] charArray = {'S', 'D', 'A'};

        System.out.println("Integer Array: ");
        printArray(intArray);

        System.out.println("Character Array: ");
        printArray(charArray);
    }
}
