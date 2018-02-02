package com.xy.ftl;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Ftl_Main {
    public static void main(String[] args) {
        ftl();
    }
    private static void ftl(){

        try {
            //加载配置
            Configuration configuration=new Configuration(Configuration.getVersion());
            //指定模板文件夹
            configuration.setDirectoryForTemplateLoading(new File("StaticHtml/ftl"));
            //设置编码格式
            configuration.setDefaultEncoding("UTF-8");
            //获取指定模板对象
            Template template=configuration.getTemplate("hello.ftl");
            Map<String ,Object> map=new HashMap<>();
            map.put("h","大家好");
            //根据模板生成静态文件
            template.process(map,new FileWriter("StaticHtml/tem/hello.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
