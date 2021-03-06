package com.epam.zhagparov.flowershop.entity;

public abstract class BaseEntity {
    private int id;
    private int price;
    private int count;
    private String description;
    private String madePlace;
    private String name;
    private String colour;

    public BaseEntity() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMadePlace() {
        return madePlace;
    }

    public void setMadePlace(String madePlace) {
        this.madePlace = madePlace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
