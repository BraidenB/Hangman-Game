public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \\\n"+
            "/\\\n",
        };

    public boolean isntDead() {
        if(numWrongGuesses == 6) {
            return false;
        } else {
            return true;
        }
    }
    
    public void show() {
        System.out.println(HangmanImage[numWrongGuesses]);
    }

    public void dieSomeMore() {
        numWrongGuesses += 1;
    }
}
