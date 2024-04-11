package com.soroko.project.Homework24;

import java.io.*;

public class XORDecryption extends FilterInputStream {

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected XORDecryption(InputStream in) {
        super(in);
    }

    public byte[] decrypt() throws IOException {
        byte cipher = 99;
        byte[] bytes = new byte[in.available()];
        in.read(bytes);
        for (int j = 0; j < bytes.length; j++) {
            bytes[j] = (byte) (bytes[j] ^ cipher);
        }
        return bytes;
    }
}
