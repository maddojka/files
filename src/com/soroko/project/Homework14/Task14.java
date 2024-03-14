package com.company.project.lesson14.task;

import com.company.project.lesson14.properties.PairContainer;
import com.company.project.lesson14.properties.vehicle.*;
import com.soroko.project.Homework14.PairContainer;

public class Task14 {

    public static <T extends Vehicle, K extends T> K[] task01(T first, K second, Car car){
        // какие методы можно вызвать у second?
        // Ответ: у second можно вызвать все методы Vehicle и его супертипов, а также методы интерфейсов,
        // которые он реализует.
        // какие из аргументов можно добавить в массив, а какие нет и почему
        // Ответ: по идее можем добавить все подтипы Vehicle (сам Vehicle абстрактный класс и экземпляров иметь не может)
        // также вопрос: мы не можем создать новый экземпляр массива с типом K, как тогда
        // реализуется алгоритм создания массива?
        // вычитал, что можно только ссылку объявить либо присвоить уже существующий, интересно было бы разобрать на
        // занятии
        K[] arr = {};
        return arr;
    }

    public static void main(String[] args) {
        // Задание 1
        // какие типы можно указать в угловых скобках вместо ??? и
        // экземпляры каких классов передать?
        /*
        какие типы можно указать в угловых скобках вместо ??? и
        экземпляры каких классов передать?
        в первую строку можно указать Vehicle и его подтипы,
        экзмепляры первые два: Vehicle и его наследники, третий параметр только Car
        Если мы ограничивыем тип например до Car, тогда Car - верхняя планка и параметры будут его подклассы уже и тд.
        Для второй строки мы можем добавить типы Car, Vehicle, MiniCar - в зависимости от этого уже будет влиять на
        передаваемые параметры: для Vehicle, MiniCar - > Bus, miniCar, car и тд.
        Для третьего случая можно объявлять тип Train и его возможных наследников, но в данном случае будет только Train
        следовательно и параметры будут первые два только экземпляры Train
         */


        Task14.<Vehicle, ???>task01();
        Task14.<???, MiniCar >task01();
        Task14.<Train, ???>task01();

        // Задание 2
        // Написать метод, который принимает на вход массив чисел (использовать дженерик)
        // и возвращает PairContainer, где ключи - сумма четных элементов
        // значения - сумма нечетных элементов
        Integer[] arr = new Integer[]{123, 2, 4};
        Double[] arr1 = new Double[]{1.2, 2.3, 4.6};
        Float[] arr2 = new Float[]{1.F, 2.F, 4.F};
        Long[] arr3 = new Long[]{14L, 2L, 4L};
        String[] arr4 = new String[] {"yes", "no", "ok"};
        PairContainer<Number, Number> pairContainer = Task14.createPairContainer(arr3);
        System.out.println(pairContainer.getKey());
        System.out.println(pairContainer.getValue());
    }
    public static <T extends Number> PairContainer<Number, Number> createPairContainer(T[] elem) {
        if (elem == null) return null;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < elem.length; i++) {
            if (i % 2 == 0) evenSum += elem[i].intValue();
            else oddSum += elem[i].intValue();
        }
        return new PairContainer<>(evenSum, oddSum);
        
    
}
