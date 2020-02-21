package com.zzg.mybatis.generator.util;

import java.util.*;

public class Util {

    public static boolean isEmpty(Object o) {
        if (o == null) {
            return true;
        }
        if ((o instanceof String)) {
            return ((String) o).trim().length() == 0;
        }
        if ((o instanceof List)) {
            return ((List) o).size() == 0;
        }
        if ((o instanceof Set)) {
            return ((Set) o).size() == 0;
        }
        if ((o instanceof Map)) {
            return ((Map) o).size() == 0;
        }
        if ((o instanceof Object[])) {
            return ((Object[]) o).length == 0;
        }

        return false;
    }

    public static boolean isNotEmpty(Object o) {
        return !isEmpty(o);
    }


}
