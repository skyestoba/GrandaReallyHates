package org.example;

public class Thelma extends Grandma {
    public Thelma() {
        super("Thelma");
    }

    @Override
    public boolean likesWord(String str) {

        if(str.length()==0) {
            return false;
        }

        while(str.lastIndexOf("t")<str.length()-1){
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(str.indexOf("t") + 1) == 'h') {
                    return true;
                }
                if (str.charAt(str.lastIndexOf("t") + 1) == 'h') {
                    return true;
                }
//        }

            } return false;
        }return false;

    }
}
