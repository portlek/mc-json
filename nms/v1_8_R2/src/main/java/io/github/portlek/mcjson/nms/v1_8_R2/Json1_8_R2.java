package io.github.portlek.mcjson.nms.v1_8_R2;

import io.github.portlek.mcjson.api.IJson;
import net.minecraft.server.v1_8_R2.IChatBaseComponent;
import net.minecraft.server.v1_8_R2.Packet;
import net.minecraft.server.v1_8_R2.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_8_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Json1_8_R2 implements IJson {

    @Override
    public void sendRaw(@NotNull Player player, @NotNull String json) {
        sendPacket(player, new PacketPlayOutChat(IChatBaseComponent.ChatSerializer.a(json)));
    }

    private void sendPacket(@NotNull Player player, @NotNull Packet packet) {
        (((CraftPlayer)player).getHandle()).playerConnection.sendPacket(packet);
    }

}
