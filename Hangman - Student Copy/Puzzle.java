import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {

    String word = "hashemi";
    String underscores = "";
    String guesses = "";
    private int lettersGuessed = 0;

    Puzzle() {  
        for(int i = 0; i < word.length(); i++) {
            underscores = underscores + "_";
        }
    }

    public String word() {
        return word;
    }

    public boolean isUnsolved() {
        if(lettersGuessed == word.length()) {
            return false;
        } else {
            return true;
        }
    }

    public void show() {
        System.out.println(underscores);
        System.out.println("");
        System.out.println("Guesses: " + guesses);
    }

    public boolean makeGuess(String guess) {

        if(word.contains(guess)) {
            
            for(int i = 0; i < word.length(); i++) {
                String index = "" + word.substring(i, i+1);
                if(index.equals(guess)) {
                    underscores = underscores.substring(0, i) + guess + underscores.substring(i+1, underscores.length());
                }
            }
            
            lettersGuessed += 1;

            guesses = guesses + guess + ", ";
            return true;
        } 

        else {
            guesses = guesses + guess + ", ";
            return false;
        }
    }
}
