public class Rps{
    public static int main(){return (int)(Math.random()*3);}

    public static String convertResult(int result){
        //This method convert a CPU friendly number into readable.
        if(result==1){
            return "Draw! You both selected Rock";
        }else if(result==2){
            return "You lose! You selected Rock and CPU selected Paper";
        }else if(result==3){
            return "You win! You selected Rock and CPU selected Scissor";
        }else if(result==4){
            return "You win! You selected Paper and CPU selected Rock";
        }else if(result==5){
            return "Draw! You both selected Paper";
        }else if(result==6){
            return "You lose! You selected Paper and CPU selected Scissor";
        }else if(result==7){
            return "You lose! You selected Scissor and CPU selected Rock";
        }else if(result==8){
            return "You win! You selected Scissor and CPU selected Paper";
        }else if(result==9){
            return "Draw! You both selected Scissor";
        }

        return "error";
    }
}