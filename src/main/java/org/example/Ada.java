package org.example;

public class Ada extends Grandma {
    public Ada() {
        super("Ada");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length()==0){
            return false;
        }
        int count = 0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'){
                count = count+1;
            }
            else{
                count = count;
            }

        }
        if(count>=2){
            return true;

        }

        return false;
    }
}
