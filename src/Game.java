public class Game{
    public static int game(int player){
        int cpu=Rps.main();
        if(player==0&&cpu==0){
            return 1;
        }else if(player==0&&cpu==1){
            return 2;
        }else if(player==0&&cpu==2){
            return 3;
        }else if(player==1&&cpu==0){
            return 4;
        }else if(player==1&&cpu==1){
            return 5;
        }else if(player==1&&cpu==2){
            return 6;
        }else if(player==2&&cpu==0){
            return 7;
        }else if(player==2&&cpu==1){
            return 8;
        }else if(player==2&&cpu==2){
            return 9;
        }
        return -1;
    }
}