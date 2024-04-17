package section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        File file = new File("src/main/java/section01/file/test.txt");

        //파일 생성 후 성공/실패 여부를 boolean으로 리턴 (생성되면 true)
        try {
            boolean cSuccess = file.createNewFile();
            System.out.println(cSuccess); // 한번 true 다음엔 새롭게 파일 만들지 않으므로 false
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(file.length());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());

        String path = "src/main/java/section01/file";
        File filePath = new File(path);

        boolean mkdir = filePath.mkdir();
        System.out.println(mkdir);

        boolean deleteSuccess = file.delete();
        System.out.println(deleteSuccess);

        boolean deletePath = filePath.delete();
        System.out.println(deletePath);

    }
}
