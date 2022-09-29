import java.util.Scanner;

public class GetSize implements Polygon {
    @Override
    public Integer getNumSides() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many sides your object has: ");
        int sides = scan.nextInt();
        scan.close();
        return sides;
    }

}
