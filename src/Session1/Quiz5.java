package Session1;

import java.util.*;
class Quiz5 {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int a = 0, b = str.length()-1;
        while(a < b){
            if(!Character.isAlphabetic(s[a])) a++;
            else if(!Character.isAlphabetic(s[b])) b--;
            else{
                char tmp=s[a];
                s[a]=s[b];
                s[a]=tmp;
                a++;
                b--;
            }
        }
        answer=String.valueOf(s);
        return answer;
    }

    public static void main(String[] args){
        Quiz5 q = new Quiz5();
        Scanner in = new Scanner(System.in);
        String str=in.next();
        System.out.println(q.solution(str));
    }
}