package com.soroko.project.Homework15;

import java.util.Comparator;

public class TypeComparator implements Comparator<FruitToStorageInfo> {
    @Override
    public int compare(FruitToStorageInfo firstFruitInfo, FruitToStorageInfo secondFruitInfo) {
        return firstFruitInfo.getType().compareTo(secondFruitInfo.getType());
    }
}
