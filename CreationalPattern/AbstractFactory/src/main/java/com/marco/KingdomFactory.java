package com.marco;

import com.marco.model.Army;
import com.marco.model.Castle;
import com.marco.model.King;

public interface KingdomFactory {

    King createKing();
    Castle createCastle();
    Army createArmy();

}
