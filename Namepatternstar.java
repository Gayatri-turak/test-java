import java.util.Scanner;

public class Namepatternstar {
    // Define letter patterns (5x7 format using stars)
    static String[][] letters = new String[26][7];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next().toUpperCase(); // Convert input to uppercase

        initializePatterns(); // Initialize letter patterns

        // Print the name in star pattern format
        for (int row = 0; row < 7; row++) {
            for (char c : name.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    System.out.print(letters[c - 'A'][row] + "  "); // Print each letter row
                }
            }
            System.out.println(); // Move to next row
        }
        scanner.close();
    }

    // Method to initialize patterns for each letter using *
    private static void initializePatterns() {
        letters['A' - 'A'] = new String[]{
            "  *  ", " * * ", "*****", "*   *", "*   *", "*   *", "*   *"
        };
        letters['B' - 'A'] = new String[]{
            "**** ", "*   *", "**** ", "*   *", "*   *", "*   *", "**** "
        };
        letters['C' - 'A'] = new String[]{
            " ****", "*    ", "*    ", "*    ", "*    ", "*    ", " ****"
        };
        letters['D' - 'A'] = new String[]{
            "**** ", "*   *", "*   *", "*   *", "*   *", "*   *", "**** "
        };
        letters['E' - 'A'] = new String[]{
            "*****", "*    ", "***  ", "*    ", "*    ", "*    ", "*****"
        };
        letters['F' - 'A'] = new String[]{
            "*****", "*    ", "***  ", "*    ", "*    ", "*    ", "*    "
        };
        letters['G' - 'A'] = new String[]{
            " ****", "*    ", "*    ", "* ***", "*   *", "*   *", " ****"
        };
        letters['H' - 'A'] = new String[]{
            "*   *", "*   *", "*   *", "*****", "*   *", "*   *", "*   *"
        };
        letters['I' - 'A'] = new String[]{
            "*****", "  *  ", "  *  ", "  *  ", "  *  ", "  *  ", "*****"
        };
        letters['J' - 'A'] = new String[]{
            "*****", "    *", "    *", "    *", "*   *", "*   *", " *** "
        };
        letters['K' - 'A'] = new String[]{
            "*   *", "*  * ", "* *  ", "**   ", "* *  ", "*  * ", "*   *"
        };
        letters['L' - 'A'] = new String[]{
            "*    ", "*    ", "*    ", "*    ", "*    ", "*    ", "*****"
        };
        letters['M' - 'A'] = new String[]{
            "*   *", "** **", "* * *", "*   *", "*   *", "*   *", "*   *"
        };
        letters['N' - 'A'] = new String[]{
            "*   *", "**  *", "* * *", "*  **", "*   *", "*   *", "*   *"
        };
        letters['O' - 'A'] = new String[]{
            " *** ", "*   *", "*   *", "*   *", "*   *", "*   *", " *** "
        };
        letters['P' - 'A'] = new String[]{
            "**** ", "*   *", "*   *", "**** ", "*    ", "*    ", "*    "
        };
        letters['Q' - 'A'] = new String[]{
            " *** ", "*   *", "*   *", "*   *", "* * *", "*  **", " *** "
        };
        letters['R' - 'A'] = new String[]{
            "**** ", "*   *", "*   *", "**** ", "* *  ", "*  * ", "*   *"
        };
        letters['S' - 'A'] = new String[]{
            " ****", "*    ", "*    ", " *** ", "    *", "    *", "**** "
        };
        letters['T' - 'A'] = new String[]{
            "*****", "  *  ", "  *  ", "  *  ", "  *  ", "  *  ", "  *  "
        };
        letters['U' - 'A'] = new String[]{
            "*   *", "*   *", "*   *", "*   *", "*   *", "*   *", " *** "
        };
        letters['V' - 'A'] = new String[]{
            "*   *", "*   *", "*   *", "*   *", " * * ", " * * ", "  *  "
        };
        letters['W' - 'A'] = new String[]{
            "*   *", "*   *", "*   *", "* * *", "* * *", "* * *", " * * "
        };
        letters['X' - 'A'] = new String[]{
            "*   *", "*   *", " * * ", "  *  ", " * * ", "*   *", "*   *"
        };
        letters['Y' - 'A'] = new String[]{
            "*   *", "*   *", " * * ", "  *  ", "  *  ", "  *  ", "  *  "
        };
        letters['Z' - 'A'] = new String[]{
            "*****", "    *", "   * ", "  *  ", " *   ", "*    ", "*****"
        };
    }
}
