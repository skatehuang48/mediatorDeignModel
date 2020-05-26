package com.mediator;

import com.colleage.AbstractColleage;

/**
 * 抽象中介者 负责同事之间信息的转发与同时对象的注册
 * @author Administrator
 *
 */
public abstract class AbstractMediator {

	public void register(AbstractColleage colleage){};
	
	public void notifyColleage(AbstractColleage colleage,String notifyMsg){};
}
