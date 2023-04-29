package org.bukkit.entity.minecart;

import org.bukkit.entity.vehicle.Minecart;
import org.bukkit.inventory.InventoryHolder;

/**
 * Represents a minecart with a chest. These types of {@link Minecart
 * minecarts} have their own inventory that can be accessed using methods
 * from the {@link InventoryHolder} interface.
 */
public interface StorageMinecart extends Minecart, InventoryHolder {
}
