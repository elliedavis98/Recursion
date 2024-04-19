import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int n = input.nextInt() +1;
            input.nextLine();

            int[] nthLine = new int[n];
            generateNthLine(n, nthLine);

            for (int i = 0; i < n; i++) {
                System.out.print(nthLine[i] + " ");
            }
        }

        public static void generateNthLine(int n, int[] line) {
            if (n == 1) {
                line[0] = 1;
            } else {
                generateNthLine(n - 1, line); // Recursive call for the previous line
                line[n - 1] = 1; // Last element is always 1
                for (int i = n - 2; i > 0; i--) {
                    line[i] += line[i - 1]; // Calculate the current element as the sum of the two above it
                }
            }
        }
    }
