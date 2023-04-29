package org.bukkit.entity.living.animal.monsters;

import org.bukkit.entity.living.LivingEntity;
import org.bukkit.entity.living.animal.AgeableAnimal;

/**
 * Represents a Monster.
 */
public interface Monster extends AgeableAnimal {
    public void setAgressive(boolean value);

    public void setTarget(boolean value);

    public void setSunVulnearble(boolean value);

    public void setDamage(double value);

    public double getDamage();
}
