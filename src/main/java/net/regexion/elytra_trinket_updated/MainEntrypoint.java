package net.regexion.elytra_trinket_updated;

import net.fabricmc.api.ModInitializer;

/** The server- and client-side entrypoint for Elytra Trinket. */
public final class MainEntrypoint implements ModInitializer {
	/** Run the mod initializer. */
	@Override
	public void onInitialize() {
		ServerTools.registerFlight();
	}
}
