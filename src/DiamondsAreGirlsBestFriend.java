import java.util.Scanner;

public class DiamondsAreGirlsBestFriend {

    private static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the name of the girl : " );
        String name = scnr.next();
        Girl girl = new Girl(name);
        System.out.println(girl.getName() + " has no best friend");


        do {
            System.out.print("Enter carats and value:   ");
            int size = scnr.nextInt();
            double value = scnr.nextDouble();
            girl.compareDiamonds(size, value);

            System.out.println(girl.getName() + " has a diamond, " + girl.getDiamondSize() + " carats, worth $" + girl.getDiamondValue());
            if (size == 0) {
                girl.setDiamondSize(0);
            }

        } while (girl.getDiamondSize() != 0);
    }
}
