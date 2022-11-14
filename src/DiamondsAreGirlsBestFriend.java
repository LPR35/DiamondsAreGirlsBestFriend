import java.util.Scanner;

public class DiamondsAreGirlsBestFriend {

    private static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the name of the girl : " );
        String name = scnr.next();
        Girl aGirl = new Girl(name);
        System.out.println(aGirl.getName() + " has no best friend");


        do {
            System.out.print("Enter carats and value:   ");
            int size = scnr.nextInt();
            double value = scnr.nextDouble();
            aGirl.compareDiamonds(size, value);

            System.out.println(aGirl.getName() + " has a diamond, " + aGirl.getDiamondSize() + " carats, worth $" + aGirl.getDiamondValue());
            if (size == 0) {
                aGirl.setDiamondSize(0);
            }

        } while (aGirl.getDiamondSize() != 0);
    }
}
