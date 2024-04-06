package com.soroko.project.fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import static com.soroko.project.fitness.TypeOfSubscription.*;

public class Fitness {
    private final int ZONE_SIZE = 20;
    private final String GYM_ZONE = "тренажерный зал";
    private final String POOL_ZONE = "бассейн";
    private final String GROUP_ZONE = "групповые занятия";
    private final String GYM_IS_FULL = "В тренажерном зале нет свободных мест";
    private final String POOL_IS_FULL = "В бассейне нет свободных мест";
    private final String GROUP_IS_FULL = "На групповых занятиях нет свободных мест";
    private final LocalDate CURR_DATE = LocalDate.now();
    private final LocalTime CURR_TIME = LocalTime.now();
    private final LocalDateTime CURR_DATE_TIME = LocalDateTime.now();
    private final static LocalDate MIN_DATE = LocalDate.MIN;
    private Subscription[] gymZone = new Subscription[ZONE_SIZE];
    private Subscription[] poolZone = new Subscription[ZONE_SIZE];
    private Subscription[] groupZone = new Subscription[ZONE_SIZE];
    private boolean isGym = false;
    private boolean isPool = false;
    private boolean isGroup = false;

    public Subscription[] getGymZone() {
        return gymZone;
    }

    public Subscription[] getPoolZone() {
        return poolZone;
    }

    public Subscription[] getGroupZone() {
        return groupZone;
    }

    private void checkIn(Subscription subscription, Subscription[] zone) {
        String typeOfZone = null;
        String zoneIsFull = null;

        if (zone == null) {
            System.out.println("Группа не может быть пустой");
            return;
        }

        if (subscription.getTypeOfSubscription() != FULL_TIME && subscription.getTypeOfSubscription() != DAY_TIME
                && isGroup) {
            isGroup = false;
            System.out.println("Нет доступа к групповым занятиям");
            return;
        } else if (subscription.getTypeOfSubscription() != ONE_OFF && subscription.getTypeOfSubscription() != FULL_TIME
                && isPool) {
            isPool = false;
            System.out.println("Нет доступа к бассейну");
            return;
        } else if (subscription.getTypeOfSubscription() != FULL_TIME && subscription.getTypeOfSubscription() != DAY_TIME
                && subscription.getTypeOfSubscription() != ONE_OFF && isGym) {
            isGym = false;
            System.out.println("Нет доступа к тренажерному залу");
            return;
        }

        if (isGym) {
            typeOfZone = GYM_ZONE;
            zoneIsFull = GYM_IS_FULL;
        } else if (isPool) {
            typeOfZone = POOL_ZONE;
            zoneIsFull = POOL_IS_FULL;
        } else if (isGroup) {
            typeOfZone = GROUP_ZONE;
            zoneIsFull = GROUP_IS_FULL;
        }

        boolean isFull = false;
        for (int i = 0; i < zone.length; i++) {
            isFull = true;
            if (zone[i] == null) {
                zone[i] = subscription;
                isFull = false;
                System.out.println(subscription.getPersonData().getSurname() +
                        " " + subscription.getPersonData().getName() + " " + typeOfZone);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy H:mm:ss");
                String text = dtf.format(CURR_DATE_TIME);
                System.out.println(text);
                isGym = false;
                isPool = false;
                isGroup = false;
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (zone[zone.length - 1] != null && isFull) System.out.println(zoneIsFull);
    }


    public void addToDesiredZone(String zone, Subscription subscription) {
        for (int i = 0; i < ZONE_SIZE; i++) {
            if (subscription.equals(gymZone[i])
                    || subscription.equals(poolZone[i]) || subscription.equals(groupZone[i])) {
                System.out.println("Данный пользователь уже зарегистрирован в одной из групп");
                return;
            }
        }

        if (subscription.getDateOfExpiration().isBefore(CURR_DATE)
                && !subscription.getDateOfExpiration().isEqual(CURR_DATE)) {
            System.out.println("Срок действия абонемента истек");
            return;
        }

        if (CURR_TIME.isBefore(subscription.getTypeOfSubscription().getStartTimeOfVisit())
                || CURR_TIME.isAfter(subscription.getTypeOfSubscription().getEndTimeOfVisit())) {
            System.out.println("Абонемент не активен в данное время суток");
            return;
        }

        if ((zone.equalsIgnoreCase(GYM_ZONE))) {
            isGym = true;
            checkIn(subscription, getGymZone());
        } else if ((zone.equalsIgnoreCase(POOL_ZONE))) {
            isPool = true;
            checkIn(subscription, getPoolZone());
        } else if ((zone.equalsIgnoreCase(GROUP_ZONE))) {
            isGroup = true;
            checkIn(subscription, getGroupZone());
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
        PersonData defaultPerson = new PersonData("Пользователь", "Неизвестный", 1970);
        Subscription initialSubscription = new Subscription
                (-1, defaultPerson, TypeOfSubscription.DEFAULT, MIN_DATE, MIN_DATE);
        Arrays.fill(subscriptions, initialSubscription);
    }
}
