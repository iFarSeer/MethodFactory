package com.farseer.pattern.store;

import com.farseer.pattern.hamburg.Hamburg;

/**
 * Created by zhaosc on 16/4/12.
 * 汉堡店
 */
public abstract class HamburgStore {



    public Hamburg orderHamburg(String type) {

        Hamburg hamburg = createHamburg(type);
        hamburg.prepare();
        hamburg.make();
        hamburg.box();

        return hamburg;
    }

    abstract Hamburg createHamburg(String type);
}
