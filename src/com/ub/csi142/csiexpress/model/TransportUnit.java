/**
 * MANWEDI CLAUDE 202101524
 */

package com.ub.csi.csiexpress;

public class TransportUnit {
    protected String unitID;
    protected unit capacity;

    public TransportUnit (String unitID, int capacity) {
        this.unitID = unitID;
        this.capacity = capacity;
    }
    public String getUnitID{
        return unitID;
    }
    public String getCapacity {
        return capacity;
    }
}