package module11.task4;

import module11.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by kaganets.s on 12.05.2017.
 */
public class Main {

    private final static String FILENAME = "D:\\Документы\\JavaCore\\GoJava\\src\\module11\\test4.txt";

    public static void main(String[] args) throws IOException {
        File file=null;
        try{
        if (args.length == 0) {
            file = new File(FILENAME);
        } else {
            file = new File(args[0]);
        }}
        catch(Exception e){


        FileUtils fileUtils = new FileUtils(file);
        System.out.println(fileUtils.checkWord("ab"));
    }}
}
