package edu.pingpong.StockX.item;

import org.junit.Before;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class BidTest {
    Bid bid;
    @Before
    public void setupBid(){
        this.bid = new Bid("13", 200);
    }
    public void constructorTest(){
        assertNotNull(bid);
        assertEquals("\n\t\t"+ "13" +"\t\t"+ "200", bid.toString());
    }
}
