import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String, CharacterType> characterTypeMap = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] characters = {"RT", "CF", "JM", "AN"};

        for (int i = 0; i < survey.length; i++) {
            String delim = survey[i];
            char c = choices[i] - 4 < 0 ? delim.charAt(0) : delim.charAt(1);
            int score = Math.abs(choices[i] - 4);

            if (delim.charAt(0) > delim.charAt(1)) {
                delim = new StringBuilder(delim).reverse().toString();
            }

            if (!characterTypeMap.containsKey(delim)) {
                characterTypeMap.put(delim, new CharacterType(delim));
            }

            characterTypeMap.get(delim).setScore(c, score);
        }

        for (String character : characters) {
            if (!characterTypeMap.containsKey(character)) {
                sb.append(character.charAt(0));
            } else {
                sb.append(characterTypeMap.get(character).findCharacter());
            }
        }
        
        return sb.toString();
    }
}

class CharacterType {
    private final char chr1;
    private final char chr2;
    private int score1;
    private int score2;

    public CharacterType(String delim) {
        this.chr1 = delim.charAt(0);
        this.chr2 = delim.charAt(1);
    }

    public void setScore(char c, int score) {
        if (c == chr1) {
            this.score1 += score;
        } else {
            this.score2 += score;
        }
    }

    public Character findCharacter() {
        return score1 >= score2 ? chr1 : chr2;
    }

    @Override
    public String toString() {
        return "chr1 : " + chr1 + "\nchr2 : " + chr2 + "\nscore1 : " + score1 + "\nscore2 : " + score2 + "\n";
    }
}