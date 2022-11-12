package com.projekt2;

public class BasicMath {
    public static Integer basicMath(String op, int v1, int v2)
    { int result = 0;
        if (op=="+"){
            result = v1+v2;
        } else if (op=="-"){
            result = v1-v2;
        } else if (op=="*"){
            result = v1*v2;
        } else {
            result = v1/v2;
        }
            return result;
    }
}
