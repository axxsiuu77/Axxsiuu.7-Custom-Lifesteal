package com.axxsiuu7.lifesteal;

import com.axxsiuu7.lifesteal.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Axxsiuu7sCustomLifesteal implements ModInitializer {
	public static final String MOD_ID = "axxsiuu7s-custom-lifesteal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}