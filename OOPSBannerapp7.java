public class OOPSBannerapp7 {
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
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];
        characterPatternMap[0] = new CharacterPatternMap('O', new String[]{
            " ***   ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            " ***   "
        });
        characterPatternMap[1] = new CharacterPatternMap('P', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });
        characterPatternMap[2] = new CharacterPatternMap('S', new String[]{
            "  *****",
            " *    ",
            " *    ",
            "  **** ",
            "      *",
            "      *",
            " ***** "
        });
        characterPatternMap[3] = new CharacterPatternMap(' ', new String[]{
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        });
        return characterPatternMap;
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap charMap : charMaps) {
            if (charMap.getCharacter() == ch) {
                return charMap.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        String[] patterns[] = new String[message.length()][];
        for (int i = 0; i < message.length(); i++) {
            patterns[i] = getCharacterPattern(message.charAt(i), charMaps);
        }
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < message.length(); j++) {
                System.out.print(patterns[j][i]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}