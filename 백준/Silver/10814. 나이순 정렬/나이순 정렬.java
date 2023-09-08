import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Person[] people = new Person[N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            people[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(people, (o1, o2) -> o1.age - o2.age);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < people.length; i++) {
            sb.append(people[i].age).append(" ").append(people[i].name).append("\n");
        }

        System.out.println(sb);
    }

    static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}

