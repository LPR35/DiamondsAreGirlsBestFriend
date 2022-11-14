import java.util.Scanner;

public class DiamondsAreGirlsBestFriend {

    private static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the name of the girl : " );
        String name = scnr.next();
        Diamond diamond = new Diamond();
        System.out.println(name + " has no best friend");


        do {
            System.out.print("Enter carats and value:   ");
            int size = scnr.nextInt();
            //diamond.setSize(size);
            double value = scnr.nextDouble();
            diamond.compareValue(size, value);

            System.out.println(name + " has a diamond, " + diamond.getSize() + " carats, worth $" + diamond.getValue());
            if (size == 0) {
                diamond.setSize(0);
            }

        } while (diamond.getSize() != 0);
    }
}
