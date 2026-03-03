class uc5{

    public static void main(String[] args) {

        // Declare and initialize array in single statement
        String[] banner = {
                String.join("   ", " ***** ", "*     *", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "     * "),
                String.join("   ", " ***** ", "*     *", " ***** ", " ***** ")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
