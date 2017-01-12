package com.weidian.qiulei.orgApacheCommonsLang3.stringUtils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by qiulei on 17/1/3.
 */
public class Trim {

    public static String trim(final String str) {
        return str == null ? null : str.trim();
    }

    public static String trimToNull(final String str) {
        String s = trim(str);
        return StringUtils.isEmpty(s) ? null : s;
    }

    public static String trimToEmpty(final String str) {
        return str == null ? "" : str.trim();
    }
}
