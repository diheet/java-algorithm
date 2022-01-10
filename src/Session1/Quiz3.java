package Session1;

import java.util.*;

class Quiz3 {
    public String solution(String str){
        String answer = "";
        String[] words = str.split(" ");
        for (String word : words) {
            if(answer.length() < word.length())
                answer = word;
        }

        return answer;
    }

    public static void main(String[] args){
        Quiz3 main = new Quiz3(); //main을 호출
        Scanner in = new Scanner(System.in);
        String str = in.nextLine(); //.next() 공백기준 한단어/한문자 nextLine() 한 문장기준
        System.out.print(main.solution(str));
    }
}