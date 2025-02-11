import java.util.Scanner;

public class CaloriesCounterPro {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        String food1, food2, food3;
        int calories1, calories2, calories3;
        int totalCalories = 0;
        
        System.out.println("Welcome to the Calories Counter Pro");
        
        System.out.println("Enter the name of food 1");
        food1 = scanner.nextLine();
        System.out.println("Enter the calories for " + food1);
        calories1 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter the name of food 2");
        food1 = scanner.nextLine();
        System.out.println("Enter the calories for " + food2);
        calories1 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter the name of food 3");
        food1 = scanner.nextLine();
        System.out.println("Enter the calories for " + food3);
        calories1 = scanner.nextInt();
        scanner.nextLine();
        
        totalCalories = calories1 + calories2 + calories3;
        
        System.out.println("Your calories Intake: ");
        System.out.println("1. " + food1 + " - " + calories + " calories");
        System.out.println("2. " + food1 + " - " + calories + " calories");
        System.out.println("3. " + food1 + " - " + calories + " calories");
        System.out.println("Your calories Intake total was: " + totalCalories);
        
        System.out.println("Thank you for using Calorie Counter Pro!");
        
        scanner.close();
        
    }
}
