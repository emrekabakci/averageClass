import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables defined
        float math, turkish, chem, phys, music;

        //New scanner created.
        Scanner inp = new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Please enter your English grade : ");
        math = inp.nextInt();

        System.out.print("Please enter your Turkish grade : ");
        turkish = inp.nextInt();

        System.out.print("Please enter your Chemistry grade : ");
        chem = inp.nextInt();

        System.out.print("Please enter your Physics grade : ");
        phys = inp.nextInt();

        System.out.print("Please enter your Music grade : ");
        music = inp.nextInt();

        //average variable defined here.
        double average = (math + turkish + chem + phys + music) / 5;

        //If average less than 0 or greater than 100 first scope will be executed.
        if (average >= 0 && average <= 100) {

            if (average >= 55) {

                System.out.println("Congratulations! You passed the class");

            }else {

                System.out.println("Sorry, you didn't pass the class");

            }
            System.out.println("Your grade is : " + average);

        } else {
            System.out.println("Please check the grades and try again.");
        }
    }
}