package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static List<String> knownWords;

    public static void main(String[] args) {
        knownWords = new ArrayList<>();
        //This code below will populate the knownWords list with about 27,000 English words.
        try {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while ((nextWord = br.readLine()) != null) {
                knownWords.add(nextWord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        Grandma grandma = new Barb();
        System.out.println("I'm grandma " + grandma.getName());
        System.out.println("Enter a word");
        String word = scanner.nextLine();
        //System.out.println(grandma.likesWord(word));
        int guessCount = 5;
        int correctness = 0;

        while (guessCount > 1) {
            if (grandma.likesWord(word) == true && knownWords.contains(word)) {
                System.out.println("Grandma likes that word!");
                guessCount = guessCount - 1;
                correctness = correctness +1;
                System.out.println("You have " + guessCount + " guesses left");
                word = scanner.nextLine();
            }

            if (!(grandma.likesWord(word)) == true && knownWords.contains(word)) {
                System.out.println("Grandma HATES that word!");
                guessCount = guessCount - 1;
                System.out.println("You have " + guessCount + " guesses left");
                word = scanner.nextLine();
            }

            if (!(knownWords.contains(word))) {
                System.out.println("Grandma doesn't know that word!");
                System.out.println("You have " + guessCount + " guesses left");
                word = scanner.nextLine();
            }





//        System.out.println("Hello, I'm Grandma Betty");
//        System.out.println("Enter a word");
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//        boolean correct = hasDoubleLetters(word);
//        int guessCount = 5;
//        for(int i = 1; i<5; i++){
//
//            if(correct==true && knownWords.contains(word)){
//                System.out.println("Grandma likes that word!");
//                System.out.println("You have "+ guessCount-- + " guesses left");
//                word = scanner.nextLine();
//                correct = hasDoubleLetters(word);
//
//            }
//            if(!(knownWords.contains(word))){
//                System.out.println("Grandma Doesn't know that word?");
//                word = scanner.nextLine();
//                correct = hasDoubleLetters(word);
//            }
//            else{
//                System.out.println("Grandma hates that word!");
//                System.out.println("You have "+ guessCount-- + " guesses left");
//                word = scanner.nextLine();
//                correct = hasDoubleLetters(word);
//            }
//        }
//
//        System.out.println("You're done");
//    }
//
//
//
//}
        }
        guessCount = guessCount -1;
        if(guessCount==0){

            if (grandma.likesWord(word) == true && knownWords.contains(word)) {
                System.out.println("Grandma likes that word!");
                //guessCount = guessCount - 1;
                //System.out.println("You have " + guessCount + " guesses left");
                //word = scanner.nextLine();
            }

            if (!(grandma.likesWord(word)) == true && knownWords.contains(word)) {
                System.out.println("Grandma HATES that word!");
//                guessCount = guessCount - 1;
//                System.out.println("You have " + guessCount + " guesses left");
//                word = scanner.nextLine();
            }
            if(correctness>=3){
                System.out.println("You won!");
            }
            else{
                System.out.println("You're done");
            }
        }

    }
}