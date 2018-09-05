package grstbr.minecraft.gsbmod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.Logger;

import grstbr.minecraft.gsbmod.items.ItemPaint;

@Mod(modid = GsbMod.MODID, name = GsbMod.NAME, version = GsbMod.VERSION)
@Mod.EventBusSubscriber(modid = GsbMod.MODID)
public class GsbMod {
  public static final String MODID = "gsb-mod";
  public static final String NAME = "GSB's Mod";
  public static final String VERSION = "1.0";

  private static Logger logger;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    logger = event.getModLog();
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    // some example code
    logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
  }

}
