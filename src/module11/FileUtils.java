package module11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by kaganets.s on 12.05.2017.
 */
public class FileUtils {

    private final File file;

    public FileUtils(File file) {
        this.file = file;
    }


    public String replacer(Map<String, String> replacerMap) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        Path path = Paths.get(this.file.getPath());

        Files.lines(path)
                .map(str -> str + "\r\n")
                .map(line -> {
                    final String[] result = {line};
                    replacerMap.forEach((key, value) -> {
                        if (result[0].contains(key)) {
                            result[0] = result[0].replaceAll(key, value);
                        }
                    });
                    return result[0];
                })
                .forEach(stringBuilder::append);

        return stringBuilder.toString();
    }


    public File fileContentReplacer(Map<String, String> replacerMap) throws IOException {
        String content = replacer(replacerMap);
        File file = getFile();
        Path path = Paths.get(file.getPath());

        return fileWriter(path, content.getBytes(), StandardOpenOption.WRITE);
    }


    public File fileContentMerger(Map<String, String> replacerMap) throws IOException {
        String content = replacer(replacerMap);
        File file = getFile();
        Path path = Paths.get(file.getPath());

        return fileWriter(path, content.getBytes(), StandardOpenOption.APPEND);
    }


    public int checkWord(String word) throws IOException {
        Path path = Paths.get(this.file.getPath());

        long counter = Files
                .lines(path)
                .flatMap(line -> Stream.of(line.split(" ")))
                .filter(currentWord -> currentWord.equals(word))
                .count();

        return (int) counter;
    }

    public File getFile() {
        return file;
    }

    private File fileWriter(Path path, byte[] content, StandardOpenOption option) throws IOException {
        Files.write(path, content, option);
        return path.toFile();
    }
}
