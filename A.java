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
            System.out.println("Bambang");
            System.out.println("jadi kita menambah lagi ya gais ya");
            System.out.println("Jadi saya nambah lagi dan lagi ya gais ya");
        }
    }