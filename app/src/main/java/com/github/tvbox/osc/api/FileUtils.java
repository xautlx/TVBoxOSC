package com.github.tvbox.osc.api;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

    // 写入文件
    public static void writeToFile(Context context, String fileName, String content) {
        FileOutputStream fos = null;

        try {
            fos = context.openFileOutput(fileName, Context.MODE_PRIVATE);
            fos.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 读取文件
    public static String readFromFile(Context context, String fileName) {
        FileInputStream fis = null;
        StringBuilder content = new StringBuilder();

        try {
            fis = context.openFileInput(fileName);
            int read;
            while ((read = fis.read()) != -1) {
                content.append((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return content.toString();
    }
}