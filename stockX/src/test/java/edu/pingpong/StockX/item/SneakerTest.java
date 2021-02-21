package edu.pingpong.StockX.item;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class SneakerTest {
    Sneaker sneaker;
    @Before
    public void setupSneaker(){
        this.sneaker = new Sneaker("Azules", "Jordan");

    }
    @Test
    public void constructorTest(){
        assertNotNull(sneaker);
        assertEquals("Jordan Azules", sneaker.toString());
    }
    @Test
    public void getBid(){
        sneaker.setBid(200);
        assertEquals(200, sneaker.getBid());
    }
    @Test
    public void getAsk(){
        sneaker.setAsk(300);
        assertEquals(300, sneaker.getAsk());

    }
    @Test
    public void getSale(){
        sneaker.setSale(250);
        assertEquals(250, sneaker.getSale());
    }
}
