package com.hkh.chat.client.communication;

import com.hkh.chat.client.communication.receiveListener.general.IReceiveListener;
import com.hkh.chat.model.data.GeneralData;

import java.io.IOException;

public interface IClientCommunicator {
    void send(GeneralData data) throws IOException;

    void startReceivingServerMessages(IReceiveListener receiveListener);

}
