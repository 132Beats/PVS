package com.hkh.chat.server.sender;

import com.hkh.chat.model.data.GeneralData;

import java.io.IOException;

public interface IToClientSender {

    void send(GeneralData data) throws IOException;
}
