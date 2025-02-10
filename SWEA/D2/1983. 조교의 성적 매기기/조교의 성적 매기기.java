import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    static class Student implements Comparable<Student> {
        int id;
        double score;

        public Student(int id, double score) {
            this.id = id;
            this.score = score;
        }

        @Override
        public int compareTo(Student o) {
            return Double.compare(o.score, this.score);
        }
    }

    private static final String[] GRADES = {
        "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int studentsPerGrade = N / 10;

            Student[] students = new Student[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                double midterm = Double.parseDouble(st.nextToken()) * 0.35;
                double finals = Double.parseDouble(st.nextToken()) * 0.45;
                double assignment = Double.parseDouble(st.nextToken()) * 0.2;
                students[i] = new Student(i + 1, midterm + finals + assignment);
            }

            Arrays.sort(students);

            int studentRank = 0;
            for (int i = 0; i < N; i++) {
                if (students[i].id == K) {
                    studentRank = i;
                    break;
                }
            }

            int gradeIndex = studentRank / studentsPerGrade;
            sb.append(String.format("#%d %s\n", tc + 1, GRADES[gradeIndex]));
        }

        System.out.println(sb);
        br.close();
    }
}