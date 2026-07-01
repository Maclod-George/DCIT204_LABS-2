import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter each array element:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();
        
        boolean found = false;
        int index1 = -1, index2 = -1;
        
        for (int i = 0; i < size && !found; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] + array[j] == targetSum) {
                    index1 = i;
                    index2 = j;
                    found = true;
                    break;
                }
            }
        }
        
        System.out.println("\n--- Results ---");
        if (found) {
            System.out.println("Pair found!");
            System.out.println("Index 1: " + index1 + ", Value: " + array[index1]);
            System.out.println("Index 2: " + index2 + ", Value: " + array[index2]);
            System.out.println("Equation: " + array[index1] + " + " + array[index2] + " = " + targetSum);
        } else {
            System.out.println("No pair found with the target sum " + targetSum);
        }
        
        scanner.close();
    }
}
