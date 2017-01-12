package com.weidian.qiulei.orgApacheCommonsLang3.stringUtils;

import org.apache.commons.lang3.ArrayUtils;


/**
 * Created by qiulei on 16/12/30.
 */
public class Empty {
    /**
     * Checks if a CharSequence is empty ("") or null.
     */
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * Checks if a CharSequence is not empty ("") and not null.
     */
    public static boolean isNotEmpty(final CharSequence cs) {
        return !isEmpty(cs);
    }

    /**
     * Checks if any one of the CharSequences are empty ("") or null
     */
    public static boolean isAnyEmpty(final CharSequence... css) {
        if (ArrayUtils.isEmpty(css)) {                                  //判断数组是否为null或空数组
            return true;
        }
        for (final CharSequence cs : css) {
            if (isEmpty(cs)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if none of the CharSequences are empty ("") or null
     */
    public static boolean isNoneEmpty(CharSequence... css) {
        return !isAnyEmpty(css);
    }

    /**
     * Checks if a CharSequence is whitespace, empty ("") or null
     */
    public static boolean isBlank(final CharSequence cs) {
        if (isEmpty(cs)) {
            return true;
        }
        for (int i = 0; i < cs.length(); ++i) {
            if (Character.isWhitespace(cs.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if a CharSequence is not empty (""), not null and not whitespace only
     */
    public static boolean isNotBlank(final CharSequence cs) {
        return !isBlank(cs);
    }

    /**
     * Checks if any one of the CharSequences are blank ("") or null and not whitespace only
     */
    public static boolean isAnyBlank(final CharSequence... css) {
        if (ArrayUtils.isEmpty(css)) {
            return true;
        }

        for (final CharSequence cs : css) {
            if (isBlank(cs)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if none of the CharSequences are blank ("") or null and whitespace only
     */
    public static boolean isNoneBlank(final CharSequence... css) {
        return !isAnyBlank(css);
    }
}
