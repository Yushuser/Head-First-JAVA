package edu.northeastern.yushu;

public class Main {

    public static void main(String[] args) {
	// The Guessing Game
        GuessGame game=new GuessGame();
        game.start();
    }
}
class GuessGame{
    Player p1;
    Player p2;
    Player p3;
    public void start(){
        p1=new Player();
        p2=new Player();
        p3=new Player();
        int guessP1=0;
        int guessP2=0;
        int guessP3=0;
        boolean p1Right=false;
        boolean p2Right=false;
        boolean p3Right=false;
        int target=(int)(Math.random()*10);
        System.out.println("Think of a number between 0-9");
        while (true){
            System.out.println("Number to guess is : " + target);
            p1.guess();
            p2.guess();
            p3.guess();
            guessP1=p1.number;
            System.out.println("1st Player guessed : "+guessP1);
            guessP2=p2.number;
            System.out.println("2nd Player guessed : "+guessP2);
            guessP3=p3.number;
            System.out.println("3rd Player guessed : "+guessP3);
            if (guessP1==target){
                p1Right=true;
            }
            if (guessP2==target){
                p2Right=true;
            }
            if (guessP3==target){
                p3Right=true;
            }
            if (p1Right||p2Right||p3Right){
                System.out.println("Winner!");
                System.out.println("1st player ? "+p1Right);
                System.out.println("2nd player ? "+p2Right);
                System.out.println("3rd player ? "+p3Right);
                System.out.println("Over!");
                break;
            }else {
                System.out.println("Try again!");
            }
        }
    }
}
class Player{
    int number=0;
    public void guess(){
        number=(int)(Math.random()*10);
        System.out.println("Guessing : "+number);
    }
}
