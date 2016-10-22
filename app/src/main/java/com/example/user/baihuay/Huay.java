package com.example.user.baihuay;

import java.util.Random;

/**
 * Created by user on 22/10/2559.
 */

public class Huay {
    private String result = null;

    public Huay(int digits){
        if(digits == 2) result = getRandomTwoDigits();
        else if(digits == 3) result = getRandomThreeDigits();
    }

    public String getResult(){
        return result;
    }

    protected String getRandomTwoDigits(){
        Random r = new Random();
        result = Integer.toString(r.nextInt(100));
        if(result.length() < 2) result = addZero(result, 1);
        return result;
    }

    protected String getRandomThreeDigits(){
        Random r = new Random();
        result = Integer.toString(r.nextInt(1000));
        if(result.length() < 3) {
            int diff = 3 - result.length();
            result = addZero(result, diff);
        }
        return result;
    }

    protected String addZero(String s, int diff){
        for(int i=0;i<diff;++i){
            s = "0" + s;
        }
        return s;
    }
}
