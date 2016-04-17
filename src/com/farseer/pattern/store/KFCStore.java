package com.farseer.pattern.store;

import com.farseer.pattern.hamburg.Hamburg;
import com.farseer.pattern.hamburg.KFCBaconHamburg;
import com.farseer.pattern.hamburg.KFCVegetarianHamburg;
import com.farseer.pattern.hamburg.KFCWheatHamburg;

/**
 * Created by zhaosc on 16/4/17.
 * 肯德基
 */
public class KFCStore extends HamburgStore {
    @Override
    public Hamburg createHamburg(String type) {
        Hamburg hamburg = null;
        if ("bacon".equals(type)) {
            hamburg = new KFCBaconHamburg();
        } else if ("vegetarian".equals(type)) {
            hamburg = new KFCVegetarianHamburg();
        } else if ("wheat".equals(type)) {
            hamburg = new KFCWheatHamburg();
        }
        return hamburg;
    }
}
