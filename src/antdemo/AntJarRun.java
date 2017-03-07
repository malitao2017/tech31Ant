package antdemo;


import java.util.Arrays;

import org.apache.commons.lang.StringUtils;

public class AntJarRun {
	/**
	 * 目标：ant使用固定版本jdk打成jar包
	 * jar包相关的运行详细配置情况参考： 项目：tech02JarMain 的 testjar02run.JarRun
	 * 使用： 如果代码是如下面的目录结构组织的，不需要修改什么，直接在终端运行ant命令即可在out目录输出对应的jar文件。
	 * 运行： java -jar AntJarRun.jar（到out目录中）
	 * 注意： 主要是lib/*.jar的路径需要注意: jar包里的jar包是不能被识别为classpath
	 * 参考： http://peirenlei.iteye.com/blog/1688184
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("测试 jar 命令运行方式：引用了其他的包需要一块打进去jar包");
		String[] strs = new String[10];
		Arrays.fill(strs, "!");
		System.out.println(StringUtils.join(strs));
	}
	
}
