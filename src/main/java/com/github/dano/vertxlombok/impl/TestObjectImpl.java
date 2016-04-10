package com.github.dano.vertxlombok.impl;

import com.github.dano.vertxlombok.TestObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

/**
 * Created by dan on 4/9/16.
 */
public class TestObjectImpl implements TestObject {
    @Override
    public void ping(String test, Handler<AsyncResult<String>> resultHandler) {
        resultHandler.handle(Future.succeededFuture("ping " + test));
    }
}
