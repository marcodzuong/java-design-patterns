package com.marco;

public class Main {
    public static void main(String[] args) {
        Blacksmith blacksmith = new ElfBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(Weapon.WeaponType.AXE);
        System.out.println(weapon);
        blacksmith = new OrcBlacksmith();
        weapon = blacksmith.manufactureWeapon(Weapon.WeaponType.AXE);
        System.out.println(weapon);
    }
}
