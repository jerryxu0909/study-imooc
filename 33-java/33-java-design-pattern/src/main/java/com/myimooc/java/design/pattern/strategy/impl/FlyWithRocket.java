package com.myimooc.java.design.pattern.strategy.impl;

import com.myimooc.java.design.pattern.strategy.FlyingStrategy;

/**
 * @title 策略模式
 * @describe 实现鸭子的飞行行为，使用火箭飞行策略类
 * @author zc
 * @version 1.0 2017-08-31
 */
public class FlyWithRocket implements FlyingStrategy {

	@Override
	public void performFly() {
		System.out.println("用火箭在太空遨游");
	}
}
