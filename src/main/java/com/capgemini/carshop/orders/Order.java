package com.capgemini.carshop.orders;


import com.capgemini.carshop.artikels.AbstractArticle;
import com.capgemini.carshop.artikels.Shipping;
import com.capgemini.carshop.strategy_design_pattern.Context;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private Sender sender;
    private final boolean readyToSend;
    private final Customer customer;
    private final List<AbstractArticle> articles;
    private final LocalDate dateOfPurchase;
    private final Shipping shipping;
    private LocalDate shippingDate;

    public Order(Sender sender, boolean readyToSend, Customer customer, List<AbstractArticle> articles, LocalDate dateOfPurchase, Shipping shipping, LocalDate shippingdate) {
        this.sender = sender;
        this.readyToSend = readyToSend;
        this.customer = customer;
        this.articles = articles;
        this.dateOfPurchase = dateOfPurchase;
        this.shipping = shipping;
        this.shippingDate = shippingdate;
    }

    public void checkOrder() {
        if (readyToSend) {
            sender.sendMessage();
        }
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    private List<AbstractArticle> getUniqueParts(List<AbstractArticle> articles) {
        return Context.chooseAlgoAndGetUniqueList(articles);
    }

    public List<AbstractArticle> optimizeCart() {
        return getUniqueParts(articles);
    }

    public void changeShippingDate(LocalDate date) {
        this.shippingDate = date;
    }
}
