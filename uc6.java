class uc6 {

    public static void main(String[] args) {

        String[] letterO = buildO();
        String[] letterP = buildP();
        String[] letterS = buildS();

        // Combine O O P S dynamically
        for (int i = 0; i < letterO.length; i++) {
            System.out.println(
                    String.join("   ",
                            letterO[i],
                            letterO[i],
                            letterP[i],
                            letterS[i]
                    )
            );
        }
    }

    // Static method for letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for letter P
    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };
    }

    // Static method for letter S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}
