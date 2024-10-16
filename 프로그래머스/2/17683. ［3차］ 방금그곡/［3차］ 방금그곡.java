import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        List<Music> musicList = new ArrayList<>();
        m = replaceString(m);

        for (int i = 0; i < musicinfos.length; i++) {
            String[] infos = musicinfos[i].split(",");
            int hour = Integer.parseInt(infos[1].split(":")[0]) - Integer.parseInt(infos[0].split(":")[0]);
            int minute = Integer.parseInt(infos[1].split(":")[1]) - Integer.parseInt(infos[0].split(":")[1]);
            int playTime = 60 * hour + minute;

            String music = replaceString(infos[3]);
            boolean contains = music.repeat(playTime / music.length())
                    .concat(music.substring(0, playTime % music.length()))
                    .contains(m);

            if (contains) {
                musicList.add(new Music(infos[2], playTime, i));
            }
        }

        if (musicList.size() != 0) {
            musicList.sort(new Comparator<Music>() {
                @Override
                public int compare(Music o1, Music o2) {
                    if (o1.getPlayTime() < o2.getPlayTime()) {
                        return 1;
                    } else if (o1.getPlayTime() == o2.getPlayTime()) {
                        return o1.getIndex() - o2.getIndex();
                    } else {
                        return -1;
                    }
                }
            });

            answer = musicList.get(0).getMusicName();
        }
        
        return answer;
    }
    
    static String replaceString(String str) {
        str = str.replaceAll("C#", "c")
            .replaceAll("D#", "d")
            .replaceAll("F#", "f")
            .replaceAll("G#", "g")
            .replaceAll("B#", "b")
            .replaceAll("A#", "a");

        return str;
    }
}

class Music {
    private final String musicName;
    private final int playTime;
    private final int index;

    public Music(String musicName, int playTime, int index) {
        this.musicName = musicName;
        this.playTime = playTime;
        this.index = index;
    }

    public String getMusicName() {
        return musicName;
    }

    public int getPlayTime() {
        return playTime;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Music{" +
                "musicName='" + musicName + '\'' +
                ", playTime=" + playTime +
                ", index=" + index +
                '}';
    }
}

