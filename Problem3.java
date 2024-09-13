public class Problem3
{
    public static void main(String[] args)
    {
        double num = 69.654;
        System.out.println("decimal number: " + num);
        int numup = (int) (num * 1000);
        System.out.print("Answer: ");
        System.out.print(numup %10);
        numup /= 10;
        System.out.print(" " + numup %10);
        numup /= 10;
        System.out.print(" " + numup %10);
    }
}
