package com.lab6.builders;

import java.io.IOException;

public abstract class Builder<T extends Object> {
    public abstract T build() throws IOException;

}