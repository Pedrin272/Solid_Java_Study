import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        GetSize size = new GetSize();
        formDefiner form = new formDefiner();

        System.out.println(form.Define(size.getNumSides()));

    }
}