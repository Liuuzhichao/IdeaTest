package cn.sdut.io;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by liuzhichao on 2018/8/24.
 */
public class Nio2WatchTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Path path = Paths.get("F:\\io");

        try {
            //创建监视器对象
            WatchService ws = FileSystems.getDefault().newWatchService();
            //注册监视器对象到path目录，以及注册事件
            path.register(ws, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);
            while (true) {
                WatchKey key = ws.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    System.out.println(event.context().toString() + "事件类型:"
                            + event.kind());
                    if (key.reset()) {
                        return;
                    }
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
