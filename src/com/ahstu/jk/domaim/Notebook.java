package com.ahstu.jk.domaim;

public class Notebook implements Equipment {
    private String model;//�����ͺ�
    private double price;//�۸�



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Notebook() {
    }
    public Notebook(String model, double price) {
        this.model = model;
        this.price = price;
    }


    @Override
    public String getDescription() {
        return model+"{"+price+"}";
    }
}
