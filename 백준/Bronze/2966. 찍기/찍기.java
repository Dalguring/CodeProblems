import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int problems = Integer.parseInt(br.readLine());
        Students Adrian = new Students("Adrian", "ABC");
        Students Bruno = new Students("Bruno", "BABC");
        Students Goran = new Students("Goran", "CCAABB");
        StringBuilder sb = new StringBuilder();

        String answer = br.readLine();

        for (int i = 0; i < problems; i++) {
            if (answer.charAt(i) == Adrian.getAnswer()) {
                Adrian.earnScore();
            }
            if (answer.charAt(i) == Bruno.getAnswer()) {
                Bruno.earnScore();
            }
            if (answer.charAt(i) == Goran.getAnswer()) {
                Goran.earnScore();
            }

            Adrian.controlIndex();
            Bruno.controlIndex();
            Goran.controlIndex();
        }

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(Adrian);
        studentsList.add(Bruno);
        studentsList.add(Goran);
        studentsList.sort(Comparator.comparingInt(Students::getScore).reversed());

        int maxScore = studentsList.get(0).getScore();
        sb.append(maxScore).append("\n");
        sb.append(studentsList.get(0).getName()).append("\n");

        if (studentsList.get(1).getScore() == maxScore) {
            sb.append(studentsList.get(1).getName()).append("\n");
        }
        if (studentsList.get(2).getScore() == maxScore) {
            sb.append(studentsList.get(2).getName());
        }

        System.out.println(sb);
        br.close();
    }
}

class Students {
    private final String name;
    private int score;
    private int index;
    private final String answer;

    public Students(String name, String answer) {
        this.name = name;
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getIndex() {
        return index;
    }

    public void earnScore() {
        this.score++;
    }

    public void controlIndex() {
        if (this.index >= this.answer.length() - 1) {
            this.index = 0;
        } else {
            this.index++;
        }
    }

    public char getAnswer() {
        return answer.charAt(this.index);
    }

}
