package com.example.shoppinglist;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class ShoppingListBean implements Serializable {     // для SessionScoped
    private final List<Item> items = new ArrayList<>();
    private int counter = 1;
    @NotBlank
    private String itemName;
    @DecimalMin("0.01")
    private BigDecimal itemQuantity;
    @NotBlank
    private String itemUnits;


    public void addItem() {
        var i = new Item();
        i.setId(counter);
        counter++;
        i.setName(itemName);
        i.setQuantity(itemQuantity);
        i.setUnits(itemUnits);

        items.add(i);
        itemName = null;
        itemQuantity = null;
        itemUnits = null;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(BigDecimal itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemUnits() {
        return itemUnits;
    }

    public void setItemUnits(String itemUnits) {
        this.itemUnits = itemUnits;
    }
}
