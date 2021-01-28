package fr.neatmonster.nocheatplus.checks.moving.player;

import fr.neatmonster.nocheatplus.NCPAPIProvider;
import fr.neatmonster.nocheatplus.checks.Check;
import fr.neatmonster.nocheatplus.checks.CheckType;
import org.bukkit.entity.Player;

public class BackwardsSprint extends Check {
    /**
     * Instantiates a new check.
     *
     * @param type the type
     */
    public BackwardsSprint(CheckType type) {
        super(CheckType.FALSE_ROTATION_MOVEMENT);
    }

    public boolean check() {
        return false;
    }
}
