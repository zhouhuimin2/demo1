package com.chiquan.entity;

import org.junit.Test;

/**
 * hello类测试
 * @author syuukeiibinn
 * @createDate 2019-4-8
 * @updateDate 2019-4-8
 * @version 1.0
 */
public class HelloTest {
	/**
	 * 测试say方法
	 */
	Hello he = new Hello();
	@Test
	public void say(){
		//调用say方法
		he.say("周慧敏");
	}
	/**
	 * 测试Out方法
	 */
	@Test
	public void out(){
		String msg = he.out();
		System.out.println(msg);
	}
}
