import java.util.HashMap;
import java.util.Map;

class uc8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = initializePatterns();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }

    // Initialize HashMap with character patterns
    private static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return map;
    }

    // Render banner using nested loops
    private static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append("   ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}
