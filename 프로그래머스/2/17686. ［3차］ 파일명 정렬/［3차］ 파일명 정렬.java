import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public String[] solution(String[] files) {
        List<File> fileList = new ArrayList<>();

        for (String f : files) {
            File file = new File(f);
            fileList.add(file);
        }

        fileList.sort(new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                if (!o1.head.equalsIgnoreCase(o2.head)) {
                    return o1.head.compareToIgnoreCase(o2.head);
                } else {
                    return o1.intNumber - o2.intNumber;
                }
            }
        });

        String[] answer = fileList.stream()
                .map(File::getFile)
                .toArray(String[]::new);
        
        return answer;
    }
}

class File {

    String file;
    String head;
    String number;
    int intNumber;

    public File(String file) {
        this.file = file;
        setHeadAndNumber();
        setIntNumber();
    }

    public String getFile() {
        return this.file;
    }

    void setHeadAndNumber() {
        Matcher matcher = Pattern.compile("[0-9]{1,5}").matcher(file);
        if (matcher.find()) {
            int index = matcher.start();
            this.number = matcher.group();
            this.head = file.substring(0, index);
        }
    }

    void setIntNumber() {
        this.intNumber = Integer.parseInt(this.number);
    }

    @Override
    public String toString() {
        return "File{" +
                "file='" + file + '\'' +
                ", head='" + head + '\'' +
                ", number='" + number + '\'' +
                ", intNumber=" + intNumber +
                '}';
    }

}