public class Games{
    private int[] results={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private int count=0;

    public void addResult(int result){
        //Add a result to array and count numbers added to array
        if(count<25){//protection against adding more to the array than allowed
            results[count]=result;
            count++;
        }
    }

    public int[] getResults(){
        return results;
    }

    public int numbersOfDraws(){
        int count=0;
        for(int i=0;i<results.length;i++){
            if(results[i]==1||results[i]==4||results[i]==9){
                count++;
            }
        }
        return count;
    }

    public int numbersOfWins(){
        int count=0;
        for(int i=0;i<results.length;i++){
            if(results[i]==3||results[i]==4||results[i]==8){
                count++;
            }
        }
        return count;
    }

    public int numbersOfLosses(){
        int count=0;
        for(int i=0;i<results.length;i++){
            if(results[i]==2||results[i]==6||results[i]==7){
                count++;
            }
        }
        return count;
    }

    public int numbersOfRockPlayer(){
        int count=0;
        for(int i=0;i<results.length;i++){
            if(results[i]==1||results[i]==2||results[i]==3){
                count++;
            }
        }
        return count;
    }

    public int numbersOfPaperPlayer(){
        int count=0;
        for(int i=0;i<results.length;i++){
            if(results[i]==4||results[i]==5||results[i]==6){
                count++;
            }
        }
        return count;
    }

    public int numbersOfScissorsPlayer(){
        int count=0;
        for(int i=0;i<results.length;i++){
            if(results[i]==7||results[i]==8||results[i]==9){
                count++;
            }
        }
        return count;
    }

    public int numbersOfRockCPU(){
        int count=0;
        for(int i=0;i<results.length;i++){
            if(results[i]==1||results[i]==4||results[i]==7){
                count++;
            }
        }
        return count;
    }

    public int numbersOfPaperCPU(){
        int count=0;
        for(int i=0;i<results.length;i++){
            if(results[i]==2||results[i]==5||results[i]==8){
                count++;
            }
        }
        return count;
    }

    public int numbersOfScissorsCPU(){
        int count=0;
        for(int i=0;i<results.length;i++){
            if(results[i]==3||results[i]==6||results[i]==9){
                count++;
            }
        }
        return count;
    }
}