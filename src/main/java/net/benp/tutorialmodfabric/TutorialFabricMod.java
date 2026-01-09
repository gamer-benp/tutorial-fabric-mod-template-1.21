package net.benp.tutorialmodfabric;

import net.benp.tutorialmodfabric.block.ModBlocks;
import net.benp.tutorialmodfabric.item.ModItemGroups;
import net.benp.tutorialmodfabric.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialFabricMod implements ModInitializer {
	public static final String MOD_ID = "tutorialfabricmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}