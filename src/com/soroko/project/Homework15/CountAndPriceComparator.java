package com.soroko.project.Homework15;

import java.util.Comparator;

public class CountAndPriceComparator implements Comparator<FruitToStorageInfo> {
    @Override
    public int compare(FruitToStorageInfo firstFruitInfo, FruitToStorageInfo secondFruitInfo) {
        if (firstFruitInfo.getCount() != secondFruitInfo.getCount())
            return Integer.compare(firstFruitInfo.getCount(), secondFruitInfo.getCount());
        else
        return Double.compare(secondFruitInfo.getPrice(), firstFruitInfo.getPrice());
    }
}
