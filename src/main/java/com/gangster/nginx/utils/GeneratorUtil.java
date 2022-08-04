package com.gangster.nginx.utils;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author blue-light
 * Date: 2022-08-04
 * Description:
 */
public class GeneratorUtil {
    private static final String url = "jdbc:mysql://192.168.118.130:3306/nginx-neo";
    private static final String username = "root";
    private static final String password = "Tv75aYT8@";
    private static final String class_path = "D:\\Workspace\\neo-code\\nginx-gangster-master\\src\\main\\java";
    private static final String mapper_path = "D:\\Workspace\\neo-code\\nginx-gangster-master\\src\\main\\resources\\mapper";

    public static void main(String[] args) {
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("blue-light")
                            .outputDir(class_path); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.gangster")
                            // 设置父包模块名
                            .moduleName("nginx")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapper_path)); // 设置mapperXml生成路径
                })
                .strategyConfig((scanner, builder) -> builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                        .controllerBuilder().enableRestStyle().enableHyphenStyle()
                        .entityBuilder().enableLombok().addTableFills(
                                new Column("create_time", FieldFill.INSERT)
                        ).build())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
