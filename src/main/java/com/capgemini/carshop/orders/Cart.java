package com.capgemini.carshop.orders;

import com.capgemini.carshop.artikels.AbstractArticle;
import com.capgemini.carshop.artikels.Shipping;
import com.capgemini.carshop.artikels.ShippingType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<AbstractArticle> cartList;

    public Cart(List<AbstractArticle> cartList) {
        this.cartList = cartList;
    }

    public Order purchase(){
        return new Order(
                new MailSender(),
                true,
                new Customer(),
                new ArrayList<AbstractArticle>(),
                LocalDate.now(),
                new Shipping(10, ShippingType.To_Doors),
                LocalDate.now().plusDays(2L));
    }

    public void addToCart(AbstractArticle article){
        cartList.add(article);
    }

    public void removeByIndex(int index){
        cartList.remove(index);
    }
}
