package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author hwang-yunho on 2019-07-18
 * @project Algorithm
 */
public class Hwang10825 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<StudentA> students = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            students.add(new StudentA(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3])));
        }

        Collections.sort(students, new Comparator<StudentA>() {
            @Override
            public int compare(StudentA o1, StudentA o2) {

                if(o1.getKorScore() == o2.getKorScore()) {
                    if(o1.getEngScore() == o2.getEngScore()){
                        if(o1.getMathScore() == o2.getMathScore()) {
                            // 국 영 수 equal 이름 up
                            return o1.getName().compareTo(o2.getName());
                        }
                        // 국 영 equal  수학 down
                        return Integer.compare(o2.getMathScore(), o1.getMathScore());
                    }
                    // 국 equal then eng up
                    return Integer.compare(o1.getEngScore(), o2.getEngScore());
                }
                // 국 down
                return Integer.compare(o2.getKorScore(), o1.getKorScore());
            }
        });

        for(StudentA student:students) {
            System.out.println(student);
        }


    }
}

class StudentA {
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    public StudentA(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
