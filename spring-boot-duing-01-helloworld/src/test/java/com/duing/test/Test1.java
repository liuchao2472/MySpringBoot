package com.duing.test;

import org.jasypt.util.text.BasicTextEncryptor;

public class Test1 {

    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("123456!@#");

        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("root123");

        System.out.println(username);
        System.out.println(password);
    }
}
