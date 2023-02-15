package Section1;
import com.sun.tools.javac.Main;

import java.util.*;

public class s1_01 {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        s1_01 T = new s1_01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
