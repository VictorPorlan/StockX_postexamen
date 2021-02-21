package edu.pingpong.StockX.criteria;
import java.util.ArrayList;

import edu.pingpong.StockX.item.Ask;
import edu.pingpong.StockX.item.Bid;
import edu.pingpong.StockX.item.Item;
import edu.pingpong.StockX.item.Offer;
import java.util.List;

public class Asks implements Criteria{
    private List<Offer> asks = new ArrayList<Offer>();
    public Asks(){}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        sneaker.offers().stream().filter(s -> s instanceof Ask).forEach(asks :: add);
        return asks;
    }
}
