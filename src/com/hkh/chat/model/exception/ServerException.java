package com.hkh.chat.model.exception;

import com.hkh.chat.model.data.response.ErrorResponse;

public abstract class ServerException extends Exception {
    public ServerException(String errorMsg) {
        super(errorMsg);
    }

    public abstract ErrorResponse getError();
}
