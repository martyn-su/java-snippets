public class Loop {
    public static void main(String[] args) {
        System.out.println("Looping through an array of strings...");
        String[] arrNames = { "Jane", "Jude", "Judy", "Joe", "Jake" };
        System.out.println("Printing them out using a for-each...");

        for (String item : arrNames) {
            System.out.println(item);
        }

        System.out.println("Printing them out using a for-loop...");
        int arrName = arrNames.length;
        for (int i = 0; i < arrName; i++) {
            System.out.println(arrNames[i]);
        }
        System.out.println("hey");
    }
}
