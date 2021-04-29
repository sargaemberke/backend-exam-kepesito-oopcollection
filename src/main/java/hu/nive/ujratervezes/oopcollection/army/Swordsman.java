package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean isFirstDamage = true;

    public Swordsman(boolean hasArmor) {
        super(10, hasArmor, 100);
    }

    @Override
    public void sufferDamage(int damage) {
        if (isFirstDamage) {
            isFirstDamage = false;
            return;
        }
        super.sufferDamage(damage);
    }
}