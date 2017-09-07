public class PIT {
    public static void main (String args[])
    {
        System.out.println("This program calculae value of personal income tax.");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your annual income (in PLN)?");
        double a = s.nextInt();
        double n = 14839.02;
        double z = 85528;

        System.out.println("Your annual tax is: ");

        if (a<=z)
        {
            double b = a*0.18 - 556.02;
            System.out.format("%.2f%n" , b);
            System.out.println("PLN");
        }

        else {
            double x = n + 0.32 * (a - z);
            System.out.format("%.2f%n", x);
            System.out.println("PLN");
        }
    }
}
