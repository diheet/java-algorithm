package Session1;

import java.util.*;

class Main {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);

        }
        return answer;
    }

    public static void main(String[] args){
        Main main = new Main(); //main을 호출
        Scanner in = new Scanner(System.in);
        String str = in.next(); //.next() 문자 또는 문자열을 공백기준으로 한단어 또는 한 문자씩 입력받는다.
        System.out.print(main.solution(str));
    }
}