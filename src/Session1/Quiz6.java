package Session1;

import java.util.*;

class Main {
    public String solution(String str){
        String answer="";

        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i)
                answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args){
        Main Quiz6 = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print(Quiz6.solution(str));
    }
}
