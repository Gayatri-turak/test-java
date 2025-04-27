class NamePattern {
    public static void main(String[] args) {
        String name = "JAVA";
        int height = 7; // Height of the pattern

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
            case 'J':
                if (row < 6) System.out.print("   J");
                else System.out.print("J  J");
                break;
            case 'A':
                if (row == 0) System.out.print("  A  ");
                else if (row == 1) System.out.print(" A A ");
                else if (row == 2) System.out.print("AAAAA");
                else System.out.print("A   A");
                break;
            case 'V':
                if (row < 4) System.out.print("V   V");
                else if (row < 6) System.out.print(" V V ");
                else System.out.print("  V  ");
                break;
        }
    }
}

