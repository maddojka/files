package com.soroko.project.fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


public class Fitness {
    private final int SUB_SIZE = 2;
    private final String GYM_ZONE = "тренажерный зал";
    private final String POOL_ZONE = "бассейн";
    private final String GROUP_ZONE = "групповые занятия";
    private final String GYM_IS_FULL = "В тренажерном зале нет свободных мест";
    private final String POOL_IS_FULL = "В бассейне нет свободных мест";
    private final String GROUP_IS_FULL = "На групповых занятиях нет свободных мест";
    private final LocalDateTime CURR_DATE_TIME = LocalDateTime.now();
    private final static LocalDate MIN_DATE = LocalDate.MIN;
    private Subscription[] gymZone = new Subscription[SUB_SIZE];
    private Subscription[] poolZone = new Subscription[SUB_SIZE];
    private Subscription[] groupZone = new Subscription[SUB_SIZE];

    public Subscription[] getGymZone() {
        return gymZone;
    }

    public Subscription[] getPoolZone() {
        return poolZone;
    }

    public Subscription[] getGroupZone() {
        return groupZone;
    }

    private void addToGymZone(Subscription subscription) {
        boolean isFull = false;
        for (int i = 0; i < gymZone.length; i++) {
            isFull = true;
            if (gymZone[i] == null) {
                gymZone[i] = subscription;
                isFull = false;
                System.out.println(subscription.getSurname() + " " + subscription.getName() + GYM_ZONE);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy H:mm:ss");
                String text = dtf.format(CURR_DATE_TIME);
                System.out.println(text);
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (gymZone[gymZone.length - 1] != null && isFull) System.out.println(GYM_IS_FULL);
    }

    private void addToPoolZone(Subscription subscription) {
        boolean isFull = false;
        for (int i = 0; i < poolZone.length; i++) {
            isFull = true;
            if (poolZone[i] == null) {
                poolZone[i] = subscription;
                isFull = false;
                System.out.println(subscription.getSurname() + " " + subscription.getName() + POOL_ZONE);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy H:mm:ss");
                String text = dtf.format(CURR_DATE_TIME);
                System.out.println(text);
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (poolZone[poolZone.length - 1] != null && isFull) System.out.println(POOL_IS_FULL);
    }

    private void addToGroupZone(Subscription subscription) {
        boolean isFull = false;
        for (int i = 0; i < groupZone.length; i++) {
            isFull = true;
            if (groupZone[i] == null) {
                groupZone[i] = subscription;
                isFull = false;
                System.out.println(subscription.getSurname() + " " + subscription.getName() + GROUP_ZONE);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy H:mm:ss");
                String text = dtf.format(CURR_DATE_TIME);
                System.out.println(text);
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (groupZone[groupZone.length - 1] != null && isFull) System.out.println(GROUP_IS_FULL);
    }

    public void addToDesiredZone(String zone, Subscription subscription) {
        if (zone.equalsIgnoreCase(GYM_ZONE) &&
                (subscription.getAccess() == 1 || subscription.getAccess() == 2 || subscription.getAccess() == 3)) {
            addToGymZone(subscription);
        } else if (zone.equalsIgnoreCase(POOL_ZONE) &&
                (subscription.getAccess() == 1 || subscription.getAccess() == 3)) {
            addToPoolZone(subscription);
        } else if (zone.equalsIgnoreCase(GROUP_ZONE) &&
                (subscription.getAccess() == 2 || subscription.getAccess() == 3)) {
            addToGroupZone(subscription);
        } else {
            System.out.println("Введите правильную зону");
        }
    }

    public void printGroups() {
        System.out.println("Посетители тренажерного зала:");
        System.out.println(Arrays.toString(getGymZone()));
        System.out.println("Посетители бассейна:");
        System.out.println(Arrays.toString(getPoolZone()));
        System.out.println("Посетители групповых занятий:");
        System.out.println(Arrays.toString(getGroupZone()));
    }

    public static void initializeZone(Subscription[] subscriptions) {
        Subscription initialSubscription = new Subscription
                (-1, "просрочен", MIN_DATE, "Пользователь", "Неизвестный", 1970);
        for (int i = 0; i < subscriptions.length; i++) {
            subscriptions[i] = initialSubscription;
        }
    }
}
