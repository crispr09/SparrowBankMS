package com.sparrowbank.orderservice.utilities;

import java.math.BigDecimal;

import com.sparrowbank.orderservice.domain.Product;

public class CartUtilities {

    public static BigDecimal getSubTotalForItem(Product product, int quantity){
       return (product.getPrice()).multiply(BigDecimal.valueOf(quantity));
    }
}
