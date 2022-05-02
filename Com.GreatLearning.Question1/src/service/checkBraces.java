package service;

public class checkBraces {
    public String checkBracesInput(char brace){
        if(Character.compare(brace,'{')==0 || Character.compare(brace,'[')==0 || Character.compare(brace,'(')==0){
            return "push";
        }
        return "pop";
    }
}
