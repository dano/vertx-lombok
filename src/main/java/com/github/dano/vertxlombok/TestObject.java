package com.github.dano.vertxlombok;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.serviceproxy.ProxyHelper;

/**
 * Created by dan on 4/9/16.
 */
@ProxyGen
public interface TestObject {

    static TestObject createProxy(Vertx vertx, String address) {
        return ProxyHelper.createProxy(TestObject.class, vertx, address);
    }

    void ping(String test, Handler<AsyncResult<String>> resultHandler);
}
