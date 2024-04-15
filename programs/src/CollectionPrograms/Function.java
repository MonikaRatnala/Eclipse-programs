package CollectionPrograms;
import java.util.Scanner;
public class Function {

		// TODO Auto-generated method stub
		
                 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the width of the rectangle: ");
		        double width = scanner.nextDouble();

		        System.out.print("Enter the height of the rectangle: ");
		        double height = scanner.nextDouble();

		        System.out.print("Enter the radius of the circle: ");
		        double radius = scanner.nextDouble();

		        boolean result = canFitInsideCircle(width, height, radius);

		        System.out.println(result);
		    }

		    public static boolean canFitInsideCircle(double width, double height, double radius) {
		        // Calculate the diagonal of the rectangle (using Pythagorean theorem)
		        double diagonal = Math.sqrt(width * width + height * height);

		        // Check if the diagonal is less than or equal to the diameter of the circle
		        if (diagonal <= 2 * radius) {
		            if (diagonal == 2 * radius) {
		                System.out.println("Exactly fit");
		            } else {
		                System.out.println("True");
		            }
		            return true;
		        } else {
		            System.out.println("False");
		            return false;
		        }
		    }
	

	}


