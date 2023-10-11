package com.myapp.utils;

import java.util.StringTokenizer;

public class Text {
    private String firstRow = "";
    private String secondRow = "";
    private String message = "";

    private static final StringBuilder sb = new StringBuilder();
    private static final StringBuffer sbuff = new StringBuffer();
    private static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public Text(String firstRow, String secondRow) {
        this.firstRow = firstRow;
        this.secondRow = secondRow;
    }

    public Text(String message) {
        this.message = message;
    }

    public void splitMessage() {
        StringTokenizer st = new StringTokenizer(message);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    public void showConcatenatedRows() {
        sb.append(firstRow);
        sb.append(' ');
        sb.append(secondRow);
        System.out.println(sb.toString());
    }

    public void removeVowels() {
        sbuff.append(message);
        for (char c : vowels) {
            // Converting char to string to pass it as argument for sbuff's method
            String s = String.valueOf(c);
            int lastIndex = sbuff.lastIndexOf(s);
            while (lastIndex != -1) {
                sbuff.deleteCharAt(lastIndex);
                lastIndex = sbuff.lastIndexOf(s);
            }
        }
        System.out.println(sbuff.toString());
    }
}
