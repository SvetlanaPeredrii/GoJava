package module11.task1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import module11.FileUtils;

/**
 * Created by kaganets.s on 12.05.2017.
 */
public class Main {

    private final static String FILENAME = "D:\\Документы\\JavaCore\\GoJava\\src\\module11\\test.txt";

    public static void main(String[] args) throws IOException {
        File file;
        Map<String, String> replaserMap = new HashMap<>();
        replaserMap.put("a", "!");
        replaserMap.put("bb", "!!");

        if (args.length == 0) {
            file = new File(FILENAME);
        } else {
            file = new File(args[0]);
        }


        FileUtils fileUtils = new FileUtils(file);
        System.out.println(fileUtils.replacer(replaserMap));
    }
}
