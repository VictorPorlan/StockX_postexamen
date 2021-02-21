package edu.pingpong.StockX.item;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class AskTest {
    Ask ask;
    @Before
    public void setupBid(){
        this.ask = new Ask("13", 200);
    }
    @Test
    public void constructorTest(){
        assertNotNull(ask);
        assertEquals("\n\t\t"+ "13" +"\t\t"+ "200", ask.toString());
    }
}
