package club.claycoffee.ClayTech.implementation.Planets.populators;

import club.claycoffee.ClayTech.ClayTech;
import club.claycoffee.ClayTech.ClayTechItems;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.scheduler.BukkitRunnable;
import org.eclipse.jdt.annotation.NonNull;

import java.util.Random;

public class MoonKreepPopulator extends BlockPopulator {

    @Override
    public void populate(@NonNull World world, @NonNull Random random, @NonNull Chunk source) {
        new BukkitRunnable() {

            @Override
            public void run() {
                int decreaseY = random.nextInt(9) + 1;
                int x = random.nextInt(16);
                int y = 30 - decreaseY;
                int z = random.nextInt(16);
                final int tx = x;
                final int ty = y;
                final int tz = z;
                int count = 0;
                while (random.nextDouble() < 0.8D && count <= 6 || count <= 3) {
                    if (source.getBlock(x, y, z).getType() == Material.STONE) {
                        if (!SlimefunPlugin.getRegistry().getWorlds().containsKey(world.getName())) {
                            BlockStorage bs = new BlockStorage(world);
                            SlimefunPlugin.getRegistry().getWorlds().put(world.getName(), bs);
                        }
                        new BukkitRunnable() {

                            @Override
                            public void run() {
                                source.getBlock(tx, ty, tz).setType(ClayTechItems.KREEP_ROCK.getType(), false);
                                BlockStorage.addBlockInfo(source.getBlock(tx, ty, tz), "id", "KREEP_ROCK", true);
                            }

                        }.runTask(ClayTech.getInstance());
                        count++;

                    }

                    switch (random.nextInt(6)) {
                        case 0:
                            x = Math.min(x + 1, 15);
                            break;
                        case 1:
                            y = Math.min(y + 1, 20);
                            break;
                        case 2:
                            z = Math.min(z + 1, 15);
                            break;
                        case 3:
                            x = Math.max(x - 1, 0);
                            break;
                        case 4:
                            y = Math.max(y - 1, 30);
                            break;
                        default:
                            z = Math.max(z - 1, 0);
                            break;
                    }
                }

            }

        }.runTaskAsynchronously(ClayTech.getInstance());
    }

}
