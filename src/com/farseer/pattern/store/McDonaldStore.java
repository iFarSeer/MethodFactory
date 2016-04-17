package com.farseer.pattern.store;

import com.farseer.pattern.hamburg.Hamburg;
import com.farseer.pattern.hamburg.McDonalBaconHamburg;
import com.farseer.pattern.hamburg.McDonalWheatHamburg;
import com.farseer.pattern.hamburg.McdonalVegetarianHamburg;

/**
 * Created by zhaosc on 16/4/17.
 * 麦当劳
 */
public class McDonaldStore extends HamburgStore {
    @Override
    public Hamburg createHamburg(String type) {
        Hamburg hamburg = null;
        if ("bacon".equals(type)) {
            hamburg = new McDonalBaconHamburg();
        } else if ("vegetarian".equals(type)) {
            hamburg = new McdonalVegetarianHamburg();
        } else if ("wheat".equals(type)) {
            hamburg = new McDonalWheatHamburg();
        }
        return hamburg;
    }
}
