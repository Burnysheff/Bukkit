package org.bukkit.entity.living.animal.animals;

import org.bukkit.entity.living.animal.animals.Animals;
import org.bukkit.material.Colorable;

/**
 * Represents a Sheep.
 */
public interface Sheep extends Animals, Colorable {

    /**
     * @return Whether the sheep is sheared.
     */
    public boolean isSheared();

    /**
     * @param flag Whether to shear the sheep
     */
    public void setSheared(boolean flag);
}
