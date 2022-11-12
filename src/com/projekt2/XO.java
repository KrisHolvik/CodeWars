package com.projekt2;

public class XO {
    public static boolean getXO (String str) {
        int oCount = 0;
        int xCount = 0;
        for (int i=0; i<str.length(); i++){
            char temp = str.charAt(i);
            if (temp=='o'||temp=='O'){
                oCount++;
            }
            if (temp=='x'||temp=='X'){
                xCount++;
            }
        } return xCount == oCount;
    }
}
