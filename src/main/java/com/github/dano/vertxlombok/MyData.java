package com.github.dano.vertxlombok;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by dan on 4/9/16.
 */
@DataObject
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
public class MyData {
    private static final String DATA_KEY = "DATA";
    private String data;

    public MyData(MyData other) {
        this.data = other.data;
    }

    public MyData(JsonObject json) {
        data = json.getString(DATA_KEY);
    }
}
