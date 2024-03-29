package com.app.dependency.di.qualifier.task;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Qualifier("vips")
public class Vips implements Restaurant {
    private int steak = Restaurant.steak - 20000;

    @Override
    public boolean isSaladBar() {
        return true;
    }
}
