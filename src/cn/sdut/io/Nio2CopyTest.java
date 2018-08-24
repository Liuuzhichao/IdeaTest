package cn.sdut.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by liuzhichao on 2018/8/24.
 */
public class Nio2CopyTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Path path = Paths.get("F:\\io\\a.txt");
        System.out.println(path.getNameCount() + "\t"
                + path.getFileName() + "\t"
                + path.getParent() + "\t"
                + path.getRoot());
        System.out.println("===========================");
        /**
         * 进行文件的赋值操作
         */
        try {
            Files.copy(Paths.get("f:\\io\\copysrc.doc"), Paths.get("f:\\io\\copydes.doc"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
