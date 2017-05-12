package module11.task3;

import module11.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kaganets.s on 12.05.2017.
 */
public class Main {

    private final static String FILENAME = "D:\\Документы\\JavaCore\\GoJava\\src\\module11\\test3.txt";

    public static void main(String[] args) throws IOException {
        File file;
        Map<String, String> replacerMap = new HashMap<>();
        replacerMap.put("a", "!");
        replacerMap.put("bb", "!!");

        if (args.length == 0) {
            file = new File(FILENAME);
        } else {
            file = new File(args[0]);
        }


        FileUtils fileUtils = new FileUtils(file);
        fileUtils.fileContentMerger(replacerMap);
    }
}
