package com.zzg.mybatis.generator.bridge;

import org.mybatis.generator.config.TableConfiguration;

public class ConfigContext {

    static TableConfiguration tableConfiguration;

    private static String primaryKeyName;

    private static String baseMapperDir;

    public static void setTableConfiguration(TableConfiguration tableConfiguration) {
        ConfigContext.tableConfiguration = tableConfiguration;
    }

    public static void setPrimaryKeyName(String pkn) {
        primaryKeyName = pkn;
    }

    public static String getPrimaryKeyName() {
        return primaryKeyName;
    }

    public static String getBaseMapperDir() {
        return baseMapperDir;
    }

    public static void setBaseMapperDir(String baseMapperDir) {
        ConfigContext.baseMapperDir = baseMapperDir;
    }
}
