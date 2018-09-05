package grstbr.minecraft.gsbmod.items;

import java.util.Set;
import java.util.HashSet;

import grstbr.minecraft.gsbmod.GsbMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(GsbMod.MODID)
public class Items {
  public static final ItemPaint PAINT = new ItemPaint();

  @Mod.EventBusSubscriber(modid = GsbMod.MODID)
  public static class RegistrationHandler {
    public static final Set<Item> ITEMS = new HashSet<>();

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
      System.out.println("Registering items from items.");
      PAINT.setRegistryName(GsbMod.MODID, "paint");
      event.getRegistry().registerAll(PAINT);
      ITEMS.add(PAINT);
    }
  }
}
