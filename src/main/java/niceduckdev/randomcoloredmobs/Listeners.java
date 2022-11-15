package niceduckdev.randomcoloredmobs;

import org.bukkit.DyeColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Shulker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Random;

public class Listeners implements Listener {
    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.SHULKER) {
            Shulker shulker = (Shulker) event.getEntity();
            shulker.setColor(Utilities.RandomColor());
        }
        if (event.getEntityType() == EntityType.SHEEP) {
            Sheep sheep = (Sheep) event.getEntity();
            int random = new Random().nextInt(100);

            if (random > 50) {
                sheep.setColor(DyeColor.WHITE);
            }
            else {
                sheep.setColor(Utilities.RandomColor());
            }
        }
    }
}
