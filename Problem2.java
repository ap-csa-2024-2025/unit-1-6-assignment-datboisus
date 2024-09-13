public class Problem2
{
    public static void main(String[] args)
    {
        double num1 = 54.1323815896;
        double num2 = 349.345265146443;
        System.out.println("Two Original digits:");
        System.out.println(num1);
        System.out.println(num2);

        int num1rounded = (int) num1;
        int num2rounded = (int) num2;      
        int total = num1rounded + num2rounded;
        System.out.println("Answer: " + num1rounded + " + " + num2rounded + " = " + total);
    }
}