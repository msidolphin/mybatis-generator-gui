package com.zzg.mybatis.generator.plugins;

import com.zzg.mybatis.generator.bridge.ConfigContext;
import com.zzg.mybatis.generator.util.MethodHelper;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

public class MethodInjectPlugin extends PluginAdapter {

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        String domainObjectName = introspectedTable.getTableConfiguration().getDomainObjectName();
        interfaze.addMethod(MethodHelper.createMethod(SelectBySelectivePlugin.ID, new FullyQualifiedJavaType("List<" + domainObjectName + ">"), new Parameter(
                new FullyQualifiedJavaType(domainObjectName), "record")));
        interfaze.addMethod(MethodHelper.createMethod(SelectBySelectiveAndReturnOneRecordPlugin.ID, new FullyQualifiedJavaType(domainObjectName), new Parameter(
                new FullyQualifiedJavaType(domainObjectName), "record"
        )));
        interfaze.addMethod(MethodHelper.createMethod(BatchUpdateByPrimaryKeySelectivePlugin.ID, new FullyQualifiedJavaType("int"), new Parameter(
                new FullyQualifiedJavaType("@Param(" + '"' + "list" + '"' +") " + "List<" + domainObjectName + ">"), "records"
        )));
        interfaze.addMethod(MethodHelper.createMethod(BatchInsertBySelectivePlugin.ID, new FullyQualifiedJavaType("int"), new Parameter(
                new FullyQualifiedJavaType("@Param(" + '"' + "list" + '"' +") List<Model>"), "records"
        )));
        return true;
    }

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }
}
