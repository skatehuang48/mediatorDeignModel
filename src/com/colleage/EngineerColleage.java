package com.colleage;

/**
 * 开发工程师  具体同事角色 抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 * @author Administrator
 *
 */
public class EngineerColleage extends AbstractColleage{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("我是开发工程师，我正在开发中。。。。。");
	}
	
	@Override
	public void notifyColleage() {
		// TODO Auto-generated method stub
		this.mediator.notifyColleage(this,"开发工作已完成，请测试人员测试");
	}
	
}
