package com.velocitypowered.proxy.protocol.packet;

import com.velocitypowered.proxy.protocol.ProtocolConstants;
import com.velocitypowered.proxy.protocol.MinecraftPacket;
import io.netty.buffer.ByteBuf;

public class StatusRequest implements MinecraftPacket {
    @Override
    public void decode(ByteBuf buf, ProtocolConstants.Direction direction, int protocolVersion) {

    }

    @Override
    public void encode(ByteBuf buf, ProtocolConstants.Direction direction, int protocolVersion) {

    }
}
