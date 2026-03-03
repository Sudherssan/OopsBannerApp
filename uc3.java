class uc3 {

    public static void main(String[] args) {

        // Each letter pattern using String.join()

        String line1 = String.join("   ",
                " ***** ",
                "*     *",
                " ***** ",
                " ***** "
        );

        String line2 = String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *"
        );

        String line3 = String.join("   ",
                "*     *",
                "*     *",
                " ***** ",
                " ***** "
        );

        String line4 = String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "     * "
        );

        String line5 = String.join("   ",
                " ***** ",
                "*     *",
                " ***** ",
                " ***** "
        );

        // Print banner
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}