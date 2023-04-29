package org.bukkit.event.vehicle;

import org.bukkit.entity.vehicle.Vehicle;

/**
 * Raised when a vehicle collides.
 */
public abstract class VehicleCollisionEvent extends VehicleEvent {
    public VehicleCollisionEvent(final Vehicle vehicle) {
        super(vehicle);
    }
}
