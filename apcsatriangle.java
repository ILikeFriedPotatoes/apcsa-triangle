import java.util.Scanner;

public class apcsatriangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the height of the triangle: ");
        double height = in.nextDouble();
        System.out.print("Enter the base of the triangle: ");
        double base = in.nextDouble();
        double area = 0.5 * (height * base);
        System.out.printf("The area of a triangle with a height and base of %.1f and %.1f is %.1f\n", height, base, area);
        in.close();
    }
}
