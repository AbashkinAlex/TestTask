package com.alexabashkin.utils;

/**
 * Created by Abashkin Aleksandr on 16.05.2016.
 */
public final class ClassNameUtil {
    private ClassNameUtil() {
    }
    public static String getCurrentClassName(){
        try {
            throw new RuntimeException();
        } catch (RuntimeException e){
            return e.getStackTrace()[1].getClassName();
        }
    }
}
