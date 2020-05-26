package com.colleage;
/**
 * 测试工程师
 * @author Administrator
 *
 */
public class TestColleage extends AbstractColleage {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("我是测试工程师，我正在测试是否有bug。。。。。");
	}
	
	@Override
	public void notifyColleage() {
		// TODO Auto-generated method stub
		this.mediator.notifyColleage(this, "我测试了5个bug，请开发人员解决bug----------");
	}
}
