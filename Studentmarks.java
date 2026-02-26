import java.util.Scanner;
public class Studentmarks {
    public static void main(String[] args) {
        // Creating variables to store user contact details
        String name, subject;
        int marks;
        double percentage;

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking user contact details as input
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your subject: ");
        subject = input.nextLine();
        System.out.print("Enter your marks: ");
        marks = input.nextInt();
        System.out.print("Enter your percentage: " );
        percentage = input.nextDouble();

        // Displaying user contact details in a single line
        System.out.println("User Contact Details:");
        System.out.println("Name: " + name + ", Subject: " + subject + 
                        ",Marks: "+ marks +
                           ",\nPercentage: " + percentage );        
        input.close(); // Closing the Scanner object
    }
}
