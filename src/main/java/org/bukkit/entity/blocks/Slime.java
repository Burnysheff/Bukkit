package org.bukkit.entity.blocks;

import org.bukkit.entity.living.LivingEntity;

/**
 * Represents a Slime.
 */
public interface Slime extends LivingEntity {

    /**
     * @return The size of the slime
     */
    public int getSize();

    /**
     * @param sz The new size of the slime.
     */
    public void setSize(int sz);
}
