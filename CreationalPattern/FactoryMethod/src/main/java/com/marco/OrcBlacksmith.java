package com.marco;

public class OrcBlacksmith implements  Blacksmith {
    @Override
    public Weapon manufactureWeapon(Weapon.WeaponType type) {
        return new OrcWeapon(type);
    }
}
