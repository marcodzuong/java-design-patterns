package com.marco.model;

import com.marco.ElfKingdomFactory;
import com.marco.KingdomFactory;
import com.marco.OrcKingdomFactory;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Kingdom {
    private King king;
    private Army army;
    private Castle castle;


    @Override
    public String toString() {

        return super.toString();
    }

    /**
     * The factory of kingdom factories.
     */
    public static class FactoryMaker {

        /**
         * Enumeration for the different types of Kingdoms.
         */
        public enum KingdomType {
            ELF, ORC
        }

        /**
         * The factory method to create KingdomFactory concrete objects.
         */
        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");
            }
        }
    }

}
