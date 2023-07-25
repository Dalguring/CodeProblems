import java.util.*;

class Solution {
    public String solution(String letter) {
        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'";
        String[] morses = morse.replace("'", "").replace(",", " ").split(" ");
        Map<String, String> map = new HashMap<>();
        for(String s : morses)
            map.put(s.split(":")[0], s.split(":")[1]);

        StringBuilder sb = new StringBuilder();
        for(String s : letter.split(" "))
            sb.append(map.get(s));
        
        return sb.toString();
    }
}