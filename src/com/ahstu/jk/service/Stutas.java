package com.ahstu.jk.service;
/**
 * 表示员工的状态
 */
public class Stutas {
    private final String NAME;
    public Stutas(String name) {
        this.NAME=name;
    }

    public static final Stutas FREE = new Stutas("FREE");
    public static final Stutas BUSY = new Stutas("BUSY");
    public static final Stutas VOCATION= new Stutas("VOCATION");
}
