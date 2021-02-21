package edu.pingpong.StockX.criteria;

import edu.pingpong.StockX.item.Item;
import edu.pingpong.StockX.item.Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Size implements Criteria{
    String size = "";
    List<Offer> sized= new ArrayList<Offer>();
    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        sneaker.offers().stream().filter(o -> o.size().equals(this.size)).forEach(sized :: add);
        return sized;
    }
}
