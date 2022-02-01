package org.example;

public class Ellwood extends Grandma {
    public Ellwood() {
        super("Ellwood");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length()==0) {
            return false;
        }

        while(str.lastIndexOf("o")<str.length()-1){
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(str.indexOf("o") + 1) == 'o') {
                    return true;
                }
                if (str.charAt(str.lastIndexOf("o") + 1) == 'o') {
                    return true;
                }
//        }

            } return false;
        }return false;

    }
}
