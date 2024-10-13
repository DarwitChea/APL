import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

class FileDownload implements Runnable {
    private URL url;
    private String filename;

    public FileDownload(URL url, String filename) {
        this.url = url;
        this.filename = filename;
    }

    @Override
    public void run() {
        try (InputStream inputStream = url.openStream()) {
            File file = new File(filename);
            file.createNewFile();
            byte[] buffer = new byte[1024];
            int bytesRead;
            FileOutputStream outStream = new FileOutputStream(file);
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class MultiThreadFileDownloader {
    public static void main(String[] args) throws IOException {
//        Get the URL of the file to download
        URL[] url = {
                new URL("https://file-examples.com/storage/fe0eca90ba64a099e9d0525/2017/10/file_example_JPG_100kB.jpg"),
                new URL("https://file-examples.com/storage/fe0eca90ba64a099e9d0525/2017/10/file_example_JPG_500kB.jpg"),
                new URL("https://file-examples.com/storage/fe0eca90ba64a099e9d0525/2017/10/file_example_JPG_1MB.jpg")
        };
        File folder = new File("Download");
        if(!folder.exists())
        {
            folder.mkdir();
        }
        int numThreads = url.length;
        Thread[] threads = new Thread[numThreads];
        for(int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new FileDownload(url[i], folder.getName() + "/File_" + i));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        try {
            for(Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File download successfully!");;;
    }
}
