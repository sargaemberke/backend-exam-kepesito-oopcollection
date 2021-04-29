package hu.nive.ujratervezes.oopcollection.army;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Army {

    Set<MilitaryUnit> units = new HashSet<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        units.add(militaryUnit);
    }

    public void damageAll(int damage) {
        units = units.stream()
                .peek(it -> it.sufferDamage(damage))
                .filter(it -> it.getHitPoints() >= 25)
                .collect(Collectors.toSet());
    }

    int getArmyDamage() {
        return units.stream().mapToInt(MilitaryUnit::doDamage).sum();
    }

    int getArmySize() {
        return units.size();
    }

}