package edu.pingpong.StockX.criteria;

import edu.pingpong.StockX.item.Ask;
import edu.pingpong.StockX.item.Bid;
import edu.pingpong.StockX.item.Sneaker;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AsksTest {
    Sneaker sneaker;
    Sneaker sneaker2;
    @Before
    public void setupAsk(){
        this.sneaker = new Sneaker("Jordan", "Negras");
        this.sneaker2 = new Sneaker("Jordanss", "Rojas");
        Ask ask2 = new Ask("13", 550);
        sneaker2.add(ask2);
        sneaker2.add(new Ask("6", 200));
        sneaker2.add(new Ask("9.5", 479));
        sneaker2.add(new Ask("13", 338));
        sneaker2.add(new Ask("9.5", 480));
        Bid bid2 = new Bid("13", 550);
        sneaker.add(bid2);
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
        Ask ask = new Ask("13", 288);
        sneaker.add(ask);
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Ask("9.5", 333));
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));
    }
    @Test
    public void testCheckCriteria() {
        Criteria asks = new Asks();
        assertEquals(asks.checkCriteria(sneaker), asks.checkCriteria(sneaker2));
    }
}
