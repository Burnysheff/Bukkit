package org.bukkit.entity.ender;

import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.living.Damageable;

/**
 * Represents an ender dragon part
 */
public interface EnderDragonPart extends ComplexEntityPart, Damageable, Ender {
    public EnderDragon getParent();
}
