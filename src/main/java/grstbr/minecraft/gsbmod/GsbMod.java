package grstbr.mindecraft.gsbmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = GsbMod.MODID, name = GsbMod.NAME, version = GsbMod.VERSION)
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
