package com.ahstu.jk.domaim;

import com.ahstu.jk.service.Stutas;

public class Programmer extends Employee {
    private int memberId;//开发团队中的id
    private Stutas stutas;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Stutas getStutas() {
        return stutas;
    }

    public void setStutas(Stutas stutas) {
        this.stutas = stutas;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
