package com.soroko.project.Homework22;


public class Task02 {
    public static void main(String[] args) {
        // Sensor creation
        Sensor temperatureSensor = new Sensor();
        // Anonymous classes - creation
        Reactionable red = new Reactionable() {

            double logValue;

            @Override
            public void react(double value) {
                if (value >= 300 && value <= 1000) {
                    System.out.println("red " + (int) value + " градусов");
                    logValue = value;
                }
            }

            @Override
            public void log() {
                for (int i = 300; i < logValue; i += 50) {
                    if (i == 300) System.out.println("Авария: критичная температура");
                    else System.out.println("Авария: критичная температура. " +
                            "Превышение на " + (i - 300) + " градусов");
                }
            }

            @Override
            public String toString() {
                return "red";
            }
        };


        Reactionable yellow = new Reactionable() {
            double logValue;

            @Override
            public void react(double value) {
                if (value >= 200 && value < 300)
                    System.out.println("yellow " + (int) value + " градусов");
                logValue = value;
            }


            @Override
            public void log() {
                for (int i = 200; i < logValue; i += 30) {
                    if (i == 200 && logValue > 200 && logValue < 300)
                        System.out.println("Предупреждение: температура выше нормы");
                    else if (logValue > 200 && logValue < 300)
                        System.out.println("Предупреждение: температура выше нормы. " +
                                "Превышение на " + (i - 200) + " градусов");
                }
            }

            @Override
            public String toString() {
                return "yellow";
            }
        };

        Reactionable green = new Reactionable() {
            double logValue;

            @Override
            public void react(double value) {
                if (value >= 100 && value < 200)
                    System.out.println("green " + (int) value + " градусов");
                logValue = value;

            }

            @Override
            public void log() {
                for (int i = 100; i < logValue; i += 10) {
                    if (i == 100 && logValue > 100 && logValue < 200) System.out.println("Температура в норме");
                    else if (logValue > 100 && logValue < 200) System.out.println("Температура в норме. " +
                            "Превышение на " + (i - 100) + " градусов");
                }

            }

            @Override
            public String toString() {
                return "green";
            }
        };

        // Adding classes to list
        temperatureSensor.addReactionables(green);
        temperatureSensor.addReactionables(yellow);
        temperatureSensor.addReactionables(red);
        // request
        temperatureSensor.temperatureRequest();

    }
}


