package com.hkh.chat.server.requestProcession.specific;

//import com.hkh.chat.model.data.Client;
import com.hkh.chat.model.data.User;
import com.hkh.chat.model.exception.ServerException;
//import com.hkh.chat.server.util.ClientContainer;

import java.io.IOException;
import java.util.Set;

public interface ISpecificRequestProcessor<T> {

    void processRequest(User requestingUser, Set<User> users) throws IOException, ServerException;

    void setData(T data);
}
