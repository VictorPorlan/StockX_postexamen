package edu.pingpong.StockX.criteria;

import edu.pingpong.StockX.item.Bid;
import edu.pingpong.StockX.item.Item;
import edu.pingpong.StockX.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxBid implements Criteria{
    private List<Offer> maxBid = new ArrayList<Offer>();
    private List<Offer> soloBids;
    Criteria bids = new Bids();

    public MaxBid() {}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        soloBids = bids.checkCriteria(sneaker);
        Offer maxBd = soloBids.stream().filter(o -> o!=null).max(Comparator.comparing(o -> o.value())).orElse(null);
        maxBid.add(maxBd);
        return maxBid;
        }
}

