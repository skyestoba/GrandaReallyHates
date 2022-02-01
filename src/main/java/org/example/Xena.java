package org.example;

public class Xena extends Grandma {
    public Xena() {
        super("Xena");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length()==0) {
            return false;
        }
        if(str.contains("x") || str.contains("y")|| str.contains("z")|| str.contains("q")){
            return true;
        }
        return false;
    }
}
