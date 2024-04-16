package com.soroko.project.Homework27.Task01;

public class Task01 {
    public static final String FILE_PATH_1 =
            "C:\\Users\\yuriy\\IdeaProjects\\lessons\\src\\com\\soroko\\project\\Homework27\\Task01\\file1.txt";
    public static final String FILE_PATH_2 =
            "C:\\Users\\yuriy\\IdeaProjects\\lessons\\src\\com\\soroko\\project\\Homework27\\Task01\\file2.txt";
    public static final String FILE_PATH_3 =
            "C:\\Users\\yuriy\\IdeaProjects\\lessons\\src\\com\\soroko\\project\\Homework27\\Task01\\file3.txt";
    public static final String FILE_PATH_4 =
            "C:\\Users\\yuriy\\IdeaProjects\\lessons\\src\\com\\soroko\\project\\Homework27\\Task01\\file4.txt";

    public static void main(String[] args) throws InterruptedException {
        FileParsing fileParsing1 = createAndStart("firstThread", FILE_PATH_1);
        fileParsing1.getT().join();
        System.out.println();
        FileParsing fileParsing2 = createAndStart("secondThread", FILE_PATH_2);
        fileParsing2.getT().join();
        System.out.println();
        FileParsing fileParsing3 = createAndStart("thirdThread", FILE_PATH_3);
        fileParsing3.getT().join();
        System.out.println();
        FileParsing fileParsing4 = createAndStart("fourthThread", FILE_PATH_4);
        fileParsing4.getT().join();
    }

    public static FileParsing createAndStart(String name, String filePath) {
        FileParsing fileParsing = new FileParsing(name, filePath);
        fileParsing.getT().start();
        return fileParsing;
    }
}
