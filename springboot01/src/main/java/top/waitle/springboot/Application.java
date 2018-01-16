package top.waitle.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//创建SpringApplication对象
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		//设置横幅模式(关闭控制台上的广告)
		springApplication.setBannerMode(Banner.Mode.OFF);
		System.out.println(111);
		//调用run方法
		springApplication.run(args);
	}

}
