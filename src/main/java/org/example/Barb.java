package org.example;

public class Barb extends Grandma {
    public Barb() {
        super("Barb");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length()==0){
            return false;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return true;
        }

        if(str.length()<2){
            return false;
        }

        return false;
    }
}
