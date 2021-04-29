package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean isFirstDamage = true;

    public HeavyCavalry() {
        super(20, true, 150);
    }

    @Override
    public int doDamage() {

        if (isFirstDamage) {
            isFirstDamage = false;
            return 3 * super.doDamage();
        }
        return super.doDamage();
    }
}