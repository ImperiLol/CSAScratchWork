import java.util.Scanner;

public class Cookingtest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numChefs = 0; 
        double mealsMade = 10.5;
        String kitchenTools = "oven1, oven2, stove, blender, foodProcessor"; 
        boolean pass = true;

        System.out.print("How Many Chefs Particpated in this Exam, Today? ");
        numChefs = scan.nextInt();

        if (numChefs <= 0) {
            System.out.println("Error: Number of chefs must be greater than 0.");
        } else {
            double mealsPerChef = (mealsMade / numChefs);

            if (mealsPerChef < 2) {
                pass = false;
            }

            System.out.println("Number of Chefs: " + numChefs);
            System.out.println("Tools Used during Kitchen Exam: " + kitchenTools);
            System.out.println("Pass: " + pass);
            System.out.println("Meals Made Per Chef: " + mealsPerChef);
        }

        scan.close();
    }
}
