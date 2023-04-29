package org.bukkit.entity.minecart;

import org.bukkit.entity.living.LivingEntity;
import org.bukkit.entity.living.animal.monsters.IronGolem;
import org.bukkit.entity.vehicle.Minecart;

/**
 * Represents a minecart that can have certain {@link
 * org.bukkit.entity.Entity entities} as passengers. Normal passengers
 * include all {@link LivingEntity living entities} with
 * the exception of {@link IronGolem iron golems}.
 * Non-player entities that meet normal passenger criteria automatically
 * mount these minecarts when close enough.
 */
public interface RideableMinecart extends Minecart {
}
