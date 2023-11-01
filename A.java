import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        String nama, kelamin;

        for (; counter <= 3 ; counter++) {
            System.out.print("Nama: ");
            nama = input.nextLine();
            System.out.print("kelamin: ");
            kelamin = input.nextLine();
        if (kelamin.equalsIgnoreCase("p")) {
            System.out.println(nama);
            }
        }
        }
    }