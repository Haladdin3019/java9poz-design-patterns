package com.sda.factory.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class BaseUnit implements UnitActions{

    private String name;
    private Integer health;
    private Integer baseAttack;
    private Integer baseDefence;
    private List<Attribute> attributes;


    @Override
    public void attack(BaseUnit baseUnit) {
        System.out.println("Attack with " + baseAttack);
    }

    @Override
    public void defence(BaseUnit baseUnit) {
        System.out.println("Defence " + baseDefence);
    }
}
