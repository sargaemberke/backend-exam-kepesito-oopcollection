package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private final int damagePower;
    private final boolean hasArmor;
    private int liveStrong;

    public MilitaryUnit(int damagePower, boolean hasArmor, int initialLiveStrong) {
        this.damagePower = damagePower;
        this.hasArmor = hasArmor;
        this.liveStrong = initialLiveStrong;
    }

    public int doDamage() {
        return damagePower;
    }

    public void sufferDamage(int damage) {
        liveStrong -= hasArmor ? damage / 2 : damage;
    }

    public final int getHitPoints() {
        return liveStrong;
    }
}