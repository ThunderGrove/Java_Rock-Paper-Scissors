import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RpsTest{
    @Test
    void testMain(){
        //Test to verify that the random method generate a int within valid range.
        for(int i=0;i<9999;i++){
            int result = Rps.main();
            assertTrue(3>=result,"The result is to high");
            assertTrue(-1<=result,"The result is to low");
        }
    }
    @Test
    void testConvertResult(){
        //Test to make sure that all possible return strings gets returned
        assertEquals("error",Rps.convertResult(0),"When a invalid value is passed convertResult is should only return error");
        assertEquals("Draw! You both selected Rock",Rps.convertResult(1),"Wrong string returned. Should have been result for Rock vs Rock");
        assertEquals("You lose! You selected Rock and CPU selected Paper",Rps.convertResult(2),"Wrong string returned. Should have been result for Rock vs Paper");
        assertEquals("You win! You selected Rock and CPU selected Scissor",Rps.convertResult(3),"Wrong string returned. Should have been result for Rock vs Scissor");
        assertEquals("You win! You selected Paper and CPU selected Rock",Rps.convertResult(4),"Wrong string returned. Should have been result for Paper vs Rock");
        assertEquals("Draw! You both selected Paper",Rps.convertResult(5),"Wrong string returned. Should have been result for Paper vs Paper");
        assertEquals("You lose! You selected Paper and CPU selected Scissor",Rps.convertResult(6),"Wrong string returned. Should have been result for Paper vs Scissor");
        assertEquals("You lose! You selected Scissor and CPU selected Rock",Rps.convertResult(7),"Wrong string returned. Should have been result for Scissor vs Rock");
        assertEquals("You win! You selected Scissor and CPU selected Paper",Rps.convertResult(8),"Wrong string returned. Should have been result for Scissor vs Paper");
        assertEquals("Draw! You both selected Scissor",Rps.convertResult(9),"Wrong string returned. Should have been result for Scissor vs Scissor");
    }
}