import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {
    static class CharacterPatternMap {
        Character character;
        String[] pattern;
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public Character getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static Map<Character, String[]> createCharacterPatternMap() {
        Map<Character, String[]> charMap = new HashMap<>();
        charMap.put('O', new String[]{
            " ***   ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            " ***   "
        });     
        charMap.put('P', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });    
        charMap.put('S', new String[]{
            "  *****",
            " *    ",
            " *    ",
            "  **** ",
            "      *",
            "      *",
            " ***** "
        });
        charMap.put(' ', new String[]{
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        });  
        return charMap;
    }
    public static String[] getCharacterPattern(char ch, Map<Character, String[]> charMap) {
        return charMap.getOrDefault(ch, charMap.get(' '));
    }
    public static void displayBanner(String message, Map<Character, String[]> charMap) {
        int patternHeight = charMap.get('O').length;
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMap);
                sb.append(pattern[line]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {
        Map<Character, String[]> charMap = createCharacterPatternMap();
        displayBanner("OOPS", charMap);
    }
}