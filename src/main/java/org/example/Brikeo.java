package org.example;
import java.lang.Math;

public class Brikeo extends Grandma {
    public Brikeo() {
        super("Brikeo");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length()==0){
            return false;
        }
        if(str.length()==6){

            int one = str.codePointAt(0);
            int two = str.codePointAt(1);
            int three = str.codePointAt(2);
            int four = str.codePointAt(3);
            int five = str.codePointAt(4);
            int six = str.codePointAt(5);

            int first = Math.abs((one+two)-(three+four));
            int second = Math.abs((three+four)-(five+six));

            if(first==second){
                return true;
            }
        }
        return false;
    }
}
