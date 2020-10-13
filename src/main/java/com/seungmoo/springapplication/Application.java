package com.seungmoo.springapplication;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import javax.swing.*;
import java.io.PrintStream;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(Application.class)
				.banner((Environment environment, Class<?> sourceClass, PrintStream out) -> {
							out.println("==============================");
							out.println("SEUNGMOO'S SPRING-BOOT PROJECT");
							out.println("==============================");
						})
				//.listeners(new SampleListener()) 어플리케이션 시작 전에 실행되는 이벤트는 Bean 설정 불가 및 리스너 따로 등록 필요
				.web(WebApplicationType.NONE) // 스프링MVC -> SERVLET(가장 우선 순위), webflux 있는데 SERVLET 없으면 REACTIVE
				.run(args);

		/*
		SpringApplication app = new SpringApplication(Application.class);
		// banner.txt 파일에 셋팅된 배너가 우선한다.
		app.setBanner((Environment environment, Class<?> sourceClass, PrintStream out) -> {
							out.println("==============================");
							out.println("SEUNGMOO'S SPRING-BOOT PROJECT");
							out.println("==============================");
						});
		//app.setBannerMode(Banner.Mode.OFF);
		app.addListener(new SampleListener())
		app.run(args);
		 */
	}

}
