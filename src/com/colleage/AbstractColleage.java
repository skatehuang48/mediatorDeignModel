package com.colleage;

import com.mediator.AbstractMediator;

/**
 * 抽象同事类 保存中介者对象使中介者和同事产生关联，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能
 * @author Administrator
 *
 */
public abstract class AbstractColleage {
	protected AbstractMediator  mediator;
	/**
	 * 保存中介者对象 绑定同事对象和对应的中介者
	 * @param mediator
	 */
	public void setMediator(AbstractMediator mediator){
		this.mediator = mediator;
	}
	
	public void work(){};
	
	public void notifyColleage(){};
}
