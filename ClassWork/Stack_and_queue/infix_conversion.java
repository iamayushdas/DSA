import java.io.*;
import java.util.*;

public class infix_conversion{


public static int precedence(char opr){
    if(opr == '+' || opr == '-')
        return 1;
    return 2;       // * OR /   
}
public static boolean isOpr(char ch){
    if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
        return true;
    }
    return false;
}

  

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> opr = new Stack<>();

        int n = exp.length();
        for(int i = 0; i<n; i++){
            char ch = exp.charAt(i);

            if(ch=='('){
                opr.push(ch);
            }
            else if((ch >= '0' && ch <= '9') || (ch >='A' && ch<='Z') || (ch >='a' && ch<='z')){
                postfix.push(ch+"");
                prefix.push(ch+"");
                
            }
            else if(ch == ')'){
                while(opr.peek() != '('){
                    char operator = opr.pop();
                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();

                    String calPost = postv1 + postv2 + operator;
                    postfix.push(calPost);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();

                    String calPre = operator + prev1 + prev2;
                    prefix.push(calPre);
                }
                opr.pop();
            }
            else if(isOpr(ch)){
                while(opr.size() != 0 && opr.peek() != '(' && precedence(opr.peek()) >= precedence(ch)){
                   char operator = opr.pop();
                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();

                    String calPost = postv1 + postv2 + operator;
                    postfix.push(calPost);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();

                    String calPre = operator + prev1 + prev2;
                    prefix.push(calPre);
                }
                opr.push(ch);
            }
        }

        while(opr.size() != 0){
                   char operator = opr.pop();
                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();

                    String calPost = postv1 + postv2 + operator;
                    postfix.push(calPost);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();

                    String calPre = operator + prev1 + prev2;
                    prefix.push(calPre);
        }

        System.out.println(postfix.peek());
        System.out.println(prefix.peek());
    }
}