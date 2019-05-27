package com.cx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @ClassName: SpringController.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: cx
* @date: 2019年5月24日 上午11:35:51 
 */
@RestController	//Controller+ResponseBody,即整个Controller方法的返回值为Json或Json对象
public class SpringController {
	
	/**
	 * 当作用在控制器类上的时候，该注解会应用到控制类中所有的方法上，控制器类中方法使用的RequestMapping都是基于控制器类上的RequestMapping
	 * 当直接作用在方法上的时候，即绝对路径，也就是根路径"/"而言
	 */
	@RequestMapping("/") //配置url映射到控制器类或控制器类的方法上，作用在控制器类中的方法上或作用在控制器类上

	public String index(){
		return "This is First SpringBoot Project";
	}

}
/**
 * 
控制器Controller 负责处理由DispatcherServlet 分发的请求，
它把用户请求的数据经过业务处理层处理之后封装成一个Model ，
然后再把该Model 返回给对应的View 进行展示
@Controller	//处理http请求，标注类为控制器类的一个对象

public class SpringController {
	@RequestMapping("/")
	@ResponseBody //该注解用于将Controller返回对象，通过适当的HttpMessageConverter转换为指定格式后，写入Response对象的Body数据区
	public String index(){
		return "This is First SpringBoot Project";
	}
	}
*/

//Controller只能配合模板使用,可以显示页面，如果需要返回json对象，必须联合ResponeseBody使用
//RestController 不显示页面   直接返回对象  比如控制器直接返回This is First SpringBoot Project


