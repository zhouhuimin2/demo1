package com.chiquan.entity;

import org.junit.Test;

/**
 * hello�����
 * @author syuukeiibinn
 * @createDate 2019-4-8
 * @updateDate 2019-4-8
 * @version 1.0
 */
public class HelloTest {
	/**
	 * ����say����
	 */
	Hello he = new Hello();
	@Test
	public void say(){
		//����say����
		he.say("�ܻ���");
	}
	/**
	 * ����Out����
	 */
	@Test
	public void out(){
		String msg = he.out();
		System.out.println(msg);
	}
}
