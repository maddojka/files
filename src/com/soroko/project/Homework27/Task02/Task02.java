package com.soroko.project.Homework27.Task02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task02 {
    public static final String FILE_PATH_1 =
            "C:\\Users\\yuriy\\IdeaProjects\\lessons\\src\\com\\soroko\\project\\Homework27\\Task02\\file1.txt";
    public static final String FILE_PATH_2 =
            "C:\\Users\\yuriy\\IdeaProjects\\lessons\\src\\com\\soroko\\project\\Homework27\\Task02\\file2.txt";
    public static final String FILE_PATH_3 =
            "C:\\Users\\yuriy\\IdeaProjects\\lessons\\src\\com\\soroko\\project\\Homework27\\Task02\\file3.txt";
    public static final String FILE_PATH_4 =
            "C:\\Users\\yuriy\\IdeaProjects\\lessons\\src\\com\\soroko\\project\\Homework27\\Task02\\file4.txt";
    public static final String FILE_PATH_WRITE =
            "C:\\Users\\yuriy\\IdeaProjects\\lessons\\src\\com\\soroko\\project\\Homework27\\Task02\\file5.txt";

    public static void main(String[] args) throws InterruptedException {
        Parsing parsing1 = createAndStart("firstThread", FILE_PATH_1);
        parsing1.getT().join();
        System.out.println();
        Parsing parsing2 = createAndStart("secondThread", FILE_PATH_2);
        parsing2.getT().join();
        System.out.println();
        Parsing parsing3 = createAndStart("thirdThread", FILE_PATH_3);
        parsing3.getT().join();
        System.out.println();
        Parsing parsing4 = createAndStart("fourthThread", FILE_PATH_4);
        parsing4.getT().join();
        System.out.println();
        Map<String, Good> result =
                Stream.of(parsing1.getGoods(), parsing2.getGoods(), parsing3.getGoods(), parsing4.getGoods())
                        .flatMap(List::stream)
                        .sorted(Comparator.comparingDouble(Good::getPrice))//
                        .collect(Collectors.toMap(
                                Good::getTitle,
                                good -> good,
                                (x1, _) -> x1
                        ));
        for (Map.Entry<String, Good> stringGoodEntry : result.entrySet()) {
            System.out.println(stringGoodEntry);
        }
        List<Good> goods = new ArrayList<>(result.values());
        System.out.println(goods);
        Thread daemonSender = new Thread(() -> {
            for (Good good : goods) {
                try {
                    writeWithFiles(FILE_PATH_WRITE, good.getId() + ":" + good.getQuantity() + '\n');
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        daemonSender.setDaemon(true);
        daemonSender.setName("daemonSender");
        daemonSender.start();
        daemonSender.join();
    }

    public static Parsing createAndStart(String name, String filePath) {
        Parsing parsing = new Parsing(name, filePath);
        parsing.getT().start();
        return parsing;
    }

    public static void writeWithFiles(String filename, String data) throws IOException {
        Files.writeString(Paths.get(filename), data, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
