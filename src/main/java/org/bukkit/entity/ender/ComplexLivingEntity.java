package org.bukkit.entity.ender;

import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.living.LivingEntity;

import java.util.Set;

/**
 * Represents a complex living entity - one that is made up of various smaller
 * parts
 */
public interface ComplexLivingEntity extends LivingEntity {
    /**
     * Gets a list of parts that belong to this complex entity
     *
     * @return List of parts
     */
    public Set<ComplexEntityPart> getParts();
}
