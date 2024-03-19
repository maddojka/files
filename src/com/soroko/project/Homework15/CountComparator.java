package com.soroko.project.Homework15;

import java.util.Comparator;

public class CountComparator implements Comparator<FruitToStorageInfo> {
    @Override
    public int compare(FruitToStorageInfo firstFruitInfo, FruitToStorageInfo secondFruitInfo) {
        return Integer.compare(secondFruitInfo.getCount(), firstFruitInfo.getCount());
    }
}
