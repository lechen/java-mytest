package com.le.base.io;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestNIO {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("");
      FileChannel fc = fis.getChannel();
      ByteBuffer buffer = ByteBuffer.allocate(1024);
      fc.read(buffer);
      fis.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
