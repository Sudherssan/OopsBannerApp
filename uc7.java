import java.util.HashMap;
import java.util.Map;

class uc7 {

    public static void main(String[] args) {

        // Initialize pattern map
        Map<Character, CharacterPatternMap> patternMap = initializePatterns();

        String word = "OOPS";

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                CharacterPatternMap pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern.getPattern()[i]).append("   ");
                }
            }

            System.out.println(lineBuilder);
        }
    }

    // Method to initialize character patterns
    private static Map<Character, CharacterPatternMap> initializePatterns() {

        Map<Character, CharacterPatternMap> map = new HashMap<>();

        map.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        map.put('P', new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        map.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));

        return map;
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}
