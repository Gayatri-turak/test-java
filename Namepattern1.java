public class Namepattern1 {
    public static void main(String[] args) {
        String name = "GAYATRI";
        int height = 9; // Height of the pattern

        for (int i = 0; i < height; i++) {
            for (char c : name.toCharArray()) {
                printLetter(c, i);
                System.out.print("  "); // Space between letters
            }
            System.out.println();
        }
    }

    private static void printLetter(char letter, int row) {
        switch (letter) {
            case 'G':
                if (row == 0 || row == 6) System.out.print(" *** ");
                else if (row == 1 || row == 5) System.out.print("*   *");
                else if (row == 2) System.out.print("*    ");
                else System.out.print("*  **");
                break;
            case 'A':
                if (row == 0) System.out.print("  *  ");
                else if (row == 1) System.out.print(" * * ");
                else if (row == 2) System.out.print("*****");
                else System.out.print("*   *");
                break;
            case 'Y':
                if (row < 3) System.out.print("*   *");
                else if (row == 3) System.out.print(" * * ");
                else System.out.print("  *  ");
                break;
            case 'T':
                if (row == 0) System.out.print("*****");
                else System.out.print("  *  ");
                break;
            case 'R':
                if (row == 0 || row == 3) System.out.print("**** ");
                else if (row == 1 || row == 2) System.out.print("*   *");
                else if (row == 4) System.out.print("* *  ");
                else System.out.print("*  **");
                break;
            case 'I':
                if (row == 0 || row == 6) System.out.print("*****");
                else System.out.print("  *  ");
                break;
        }
    }
}
