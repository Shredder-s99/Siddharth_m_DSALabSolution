package driver;

import service.checkBraces;

import java.util.Stack;

public class BracketInputs {
    public static void main(String []args){
        String brackets = "([[{}]]))"; //input braces string
        checkBraces ob= new checkBraces(); // for pushing or poping check method
        Stack<Character> ab = new Stack<>();
        boolean flag = false;
        String Action;
        for(char x : brackets.toCharArray()){
            Action =  ob.checkBracesInput(x);
            if(Action.equals("push")){
                ab.push(x);
            }
            else if(Action.equals("pop") ){
                try {
                    if(ab.isEmpty()){
                        flag = true;
                        System.out.println("The entered Strings do not contain Balanced Brackets");
                    }
                    else{
                        System.out.println(ab.pop());
                    }

                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        if(ab.isEmpty() && flag == false){
            System.out.println("The entered String has Balanced Brackets");
        }
        else if(flag == false) {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
}
