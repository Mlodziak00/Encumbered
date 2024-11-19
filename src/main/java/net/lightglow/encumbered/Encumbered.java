package net.lightglow.encumbered;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encumbered implements ModInitializer {
	public static final String MOD_ID = "encumberedstone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItem.initialize();
	}
}