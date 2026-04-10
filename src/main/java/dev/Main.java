package dev;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.text.Text;

public class Main implements ModInitializer {

    @Override
    public void onInitialize() {
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server ) -> {
            String playerName = handler.getPlayer().getName().getString();
            Text message = Text.literal(playerName);
            handler.getPlayer().sendMessage(message, false);
        });
    }
}
