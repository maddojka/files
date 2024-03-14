package com.soroko.project.Homework14;

public class PairContainer<T, K extends Number> {
    private T key;
    private K value;

    public PairContainer(T key, K value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }
}
