import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Choose mode (0=One game vs CPU, 1=25 games vs CPU, 2=1000 CPU vs CPU): ");
        int mode=input.nextInt();
        if(mode==0){
            System.out.print("Choose between 0 (Rock), 1 (Paper) and 2 (Scissor): ");
            int player=input.nextInt();
            System.out.println(Rps.convertResult(Game.game(player)));
        }else if(mode==1){
            Games games=new Games();
            int i=0;
            while(i<25){
                System.out.print("Choose between 0 (Rock), 1 (Paper) and 2 (Scissor): ");
                int player=input.nextInt();
                int result=Game.game(player);
                System.out.println(Rps.convertResult(result));
                if(result!=-1){
                    games.addResult(result);
                    i++;
                }
            }

            System.out.println();
            System.out.println("Number of Draws: "+games.numbersOfDraws());
            System.out.println("Number of Wins: "+games.numbersOfWins());
            System.out.println("Number of Losses: "+games.numbersOfLosses());

        }else if(mode==2){
            Games games=new Games();

            int cpuOne = 0;

            for(int i = 0; i < 25; i++){
                cpuOne = (int)(Math.random()*3);

                int result=Game.game(cpuOne);
                if(result!=-1){
                    games.addResult(result);
                    i++;
                }
            }

            System.out.println();
            System.out.println("Number of Draws: "+games.numbersOfDraws());
            System.out.println("Number of Wins: "+games.numbersOfWins());
            System.out.println("Number of Losses: "+games.numbersOfLosses());
        }else{
            System.out.println("No valid mode was selected");
        }
    }
}