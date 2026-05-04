public class main {
    public static void main(String[] args) {

        List myList = new List();

        myList.add("прикольчики");
        myList.add("паралелограм");

        System.out.println("елементів: " + myList.getSize());
        System.out.println("буфер: " + myList.getCapacity());

        myList.add(1, "новий");

        System.out.println("елемент [1]: " + myList.get(1));

        myList.remove(0);

        System.out.println("\nсписок:");
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.get(i));
        }
    }
}