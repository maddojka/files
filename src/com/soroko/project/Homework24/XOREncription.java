package com.soroko.project.Homework24;

import java.io.*;



public class XOREncription extends FilterOutputStream {

    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field {@code this.out} for later use, or
     *            {@code null} if this instance is to be
     *            created without an underlying stream.
     */
    public XOREncription(OutputStream out) {
        super(out);
    }

    public void encrypt(byte[] bytes) throws IOException {
        byte cipher = 99;
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ cipher);
        }
        out.write(bytes);
    }

}
