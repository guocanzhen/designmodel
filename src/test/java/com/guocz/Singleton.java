package com.guocz;

import com.guocz.single.EnumSingleton;
import com.guocz.single.HungrySingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author guocz
 * @date 2022/9/1 13:35
 */
public class Singleton {

    public static void main(String[] args) throws Exception{
        // 演示利用反射破坏单例模式
//        Constructor<?>[] constructors = HungrySingleton.class.getDeclaredConstructors();
//        constructors[0].setAccessible(true);
//        Object o = constructors[0].newInstance();
//        Object o1 = constructors[0].newInstance();

        // 利用序列化与反序列化破坏单例模式
//        Path path = Paths.get("D:" + File.separator + "file" + File.separator + "Singleton.file");
//        File file = new File(path.toUri());
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path));
//        HungrySingleton o1 = HungrySingleton.getInstance();
//        oos.writeObject(HungrySingleton.getInstance());
//        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path));
//        Object o2 = ois.readObject();
//        System.out.println(o1 == o2);

        // 枚举实现单例
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance1 = EnumSingleton.INSTANCE;

    }
}
