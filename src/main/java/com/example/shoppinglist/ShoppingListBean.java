package com.example.shoppinglist;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class ShoppingListBean implements Serializable {     // для SessionScoped
    private final List<Item> items = new ArrayList<>();
    @NotBlank
    private String itemName;
    private int counter = 1;

    public void addItem() {
        var i = new  Item();
        i.setId(counter);
        counter++;
        i.setName(itemName);
        items.add(i);

        itemName = null;
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
}
