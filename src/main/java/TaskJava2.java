/*
2.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
    1 Расширение файла: txt
    2 Расширение файла: pdf
    3 Расширение файла:
    4 Расширение файла: jpg
 */

import java.io.File;

public class TaskJava2 {
    public static void main(String[] args) {

        FileExtension("E:\\1\\Учеба\\Репозитории Java\\PracticalJava\\HomeWorkJava2\\src\\main\\java\\Something");

//        File folder = new File("E:\\1\\Учеба\\Репозитории Java\\PracticalJava\\HomeWorkJava2\\src\\main\\java\\Something");
//        File[] files = folder.listFiles();
//        int count = 0;
//        assert files != null;
//        for (File file : files) {
//            if (file.isFile()) {
//                String fileName = file.getName();
//                int dotIndex = fileName.lastIndexOf('.');
//                if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
//                    String extension = fileName.substring(dotIndex + 1);
//                    System.out.println(++count + " Расширение файла: " + extension);
//                } else {
//                    System.out.println(++count + " Расширение файла:");
//                }
//            }
//        }
    }
    private  static void FileExtension(String nameFileString) {
        File filefolder = new File(nameFileString);
        File[] files = filefolder.listFiles();
        int count = 0;
        assert files != null;
        for (File file : files) {
            if (file.isFile()) {
                String fileName = file.getName();
                int dotIndex = fileName.lastIndexOf('.');
                if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                    String extension = fileName.substring(dotIndex + 1);
                    System.out.println(++count + " Расширение файла: " + extension);
                } else {
                    System.out.println(++count + " Расширение файла:");
                }
            }
        }
    }
}
