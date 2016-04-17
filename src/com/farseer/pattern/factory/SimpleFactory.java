package com.farseer.pattern.factory;

import com.farseer.pattern.hamburg.BaconHamburg;
import com.farseer.pattern.hamburg.Hamburg;
import com.farseer.pattern.hamburg.VegetarianHamburg;
import com.farseer.pattern.hamburg.WheatHamburg;

/**
 * Created by zhaosc on 16/4/12.
 */
public class SimpleFactory {

    public Hamburg createHamburg(String type){

        Hamburg hamburg = null;
        if ("bacon".equals(type)) {
            hamburg = new BaconHamburg();
        } else if ("vegetarian".equals(type)) {
            hamburg = new VegetarianHamburg();
        } else if ("wheat".equals(type)) {
            hamburg = new WheatHamburg();
        }
        return hamburg;
    }
}
