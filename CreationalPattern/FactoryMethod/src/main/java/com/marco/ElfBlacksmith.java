package com.marco;

public class ElfBlacksmith implements Blacksmith {

    @Override
    public Weapon manufactureWeapon(Weapon.WeaponType type) {
        return new ElfWeapon(type);
    }

}
