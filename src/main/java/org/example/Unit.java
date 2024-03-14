package org.example;

public class Unit {
    private boolean isZeroRange;
    private int hp;
    private int sp;
    Unit(boolean isZeroRange, int hp, int sp) {
        this.isZeroRange = isZeroRange;
        this.hp = hp;
        this.sp = sp;
    }

    public boolean isZeroRange() {
        return isZeroRange;
    }

    public void setZeroRange(boolean zeroRange) {
        isZeroRange = zeroRange;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }
}
