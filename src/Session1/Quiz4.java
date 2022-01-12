package Session1;

import java.util.*;

class Main {
    public ArrayList<String> solution(int n, String[] str){

        ArrayList<String> answer=new ArrayList<>();

        for(String s : str){
            String tmp=new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str=new String[n];

        for(int i=0; i<n; i++){
            str[i] = in.next();
        }

        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
