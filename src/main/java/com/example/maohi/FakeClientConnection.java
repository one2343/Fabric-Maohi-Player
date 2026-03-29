package com.example.maohi;

import net.minecraft.network.ClientConnection;
import net.minecraft.network.NetworkSide;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.PacketCallbacks;
import org.jetbrains.annotations.Nullable;

public class FakeClientConnection extends ClientConnection {
    public FakeClientConnection() {
        super(NetworkSide.SERVERBOUND);
    }

    public void disableAutoRead() {
    }

    public void handleDisconnection() {
    }

    public boolean isOpen() {
        return true;
    }

    public void send(Packet<?> packet) {
    }

    public void send(Packet<?> packet, @Nullable PacketCallbacks callbacks) {
    }

    public void send(Packet<?> packet, @Nullable PacketCallbacks callbacks, boolean flush) {
    }
}

