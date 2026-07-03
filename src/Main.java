import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        Display disp = new Display();

        Scanner Scan = new Scanner(System.in);

        disp.displayName();
        String userName = Scan.nextLine();
        System.out.println();

        disp.displayHello(userName);

        while (true)
        {

            disp.dispGuess();
            int numberUpto = Scan.nextInt();
            System.out.println();

            int randomNumber = (int)(Math.random() * numberUpto + 1);

            System.out.print("Enter Your Guess ");
            int userGuess = Scan.nextInt();
            System.out.println();

            disp.dispAnswer(randomNumber, userGuess);

            disp.dispendLine();
        }
    }
}