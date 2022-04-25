package trywithresources;

import java.io.*;

public class Document {

    private static final int BUFFER_SIZE = 1024;

    public static String firstLineOfFile(String path, String defaultValue) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(path))) {
            return reader.readLine();
        } catch (IOException e) {
            return defaultValue;
        }
    }

    public static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
        }
    }
}
