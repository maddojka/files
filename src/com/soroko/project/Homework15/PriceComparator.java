package com.soroko.project.Homework15;

import java.util.Comparator;

public class PriceComparator implements Comparator<FruitToStorageInfo> {
    @Override
    public int compare(FruitToStorageInfo firstFruitInfo, FruitToStorageInfo secondFruitInfo) {
        return Double.compare(firstFruitInfo.getPrice(), secondFruitInfo.getPrice());
    }
}
