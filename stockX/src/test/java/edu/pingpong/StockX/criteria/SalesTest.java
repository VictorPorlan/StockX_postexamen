package edu.pingpong.StockX.criteria;

import edu.pingpong.StockX.item.Ask;
import edu.pingpong.StockX.item.Bid;
import edu.pingpong.StockX.item.Sale;
import edu.pingpong.StockX.item.Sneaker;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesTest {
        Sneaker sneaker;
        Sneaker sneaker2;
        @Before
        public void setupBid(){
            this.sneaker = new Sneaker("Jordan", "Negras");
            this.sneaker2 = new Sneaker("Jordanss", "Rojas");
            Sale sale = new Sale("13", 550);
            sneaker2.add(sale);
            sneaker2.add(new Sale("6", 200));
            sneaker2.add(new Sale("9.5", 479));
            sneaker2.add(new Sale("13", 338));
            sneaker2.add(new Sale("9.5", 480));
            Sale sale2 = new Sale("13", 550);
            sneaker.add(sale2);
            sneaker.add(new Sale("6", 200));
            sneaker.add(new Sale("9.5", 479));
            sneaker.add(new Sale("13", 338));
            sneaker.add(new Sale("9.5", 480));
            Ask ask = new Ask("13", 288);
            sneaker.add(ask);
            sneaker.add(new Ask("6", 600));
            sneaker.add(new Ask("9.5", 333));
            sneaker.add(new Ask("9.5", 340));
            sneaker.add(new Ask("13", 330));
        }
        @Test
        public void testCheckCriteria() {
            Criteria sales = new Asks();
            assertEquals(sales.checkCriteria(sneaker), sales.checkCriteria(sneaker2));
        }
}
