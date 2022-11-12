package com.projekt2;

public class DRoot {
    public static int digital_root(int n) {
        int i = n;
        if (i/10 == 0) {
            return i;
        } else {
            int sum = 0;
            while (i > 0){
                sum += i % 10; //561/10= 56,1, modulo %=1, sum = 1
                i /= 10; //561/10= 56,1, i = 56,1
            }
            return digital_root(sum); //sum = 1;
            /* teraz sum=1, ale
            * wykona się znów pętla if, bo i/10 !=0, oraz while bo i>0
            * sum += i%10; czyli sum=1, a więc i/10 czyli 56/10 = 5,6
            * przy konwersji automatycznie 56,1 zmieniło się w 56 ucinając przecinek
            * modulo z i/10 to 6,a więc dodane do 1 to 7;
            * teraz sum = 7, i = 5,6 a więc 5 (konwersja dziesiętna)
            * teraz operacja wykona się ponownie, a że 5/10= 1, to while
            * i = 0,5 czyli % = 5 czyli suma 7 i 5 da nam 12, co przy kolejnym obrocie pętli
            * da nam 3 jako zmienną sum

        //Inne rozwiązania:
            /*
            public class DRoot {
                public static int digital_root(int n) {
                    return (n != 0 && n%9 == 0) ? 9 : n % 9;
                } */
            // https://www.codewars.com/kata/541c8630095125aba6000c00/solutions/java
            }
        }

    }

