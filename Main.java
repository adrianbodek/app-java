public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        String[] names = {"Piotr", "Anna", "Jan", "Leszek"};

        for (int i = 0; i < names.length; i++) {
            // Print the name from the array
            System.out.println((i + 1) + ". " + names[i]);
        }
    }
}
