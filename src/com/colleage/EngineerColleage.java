package com.colleage;

/**
 * ��������ʦ  ����ͬ�½�ɫ ����ͬ�����ʵ���ߣ�����Ҫ������ͬ�¶��󽻻�ʱ�����н��߶���������Ľ�����
 * @author Administrator
 *
 */
public class EngineerColleage extends AbstractColleage{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("���ǿ�������ʦ�������ڿ����С���������");
	}
	
	@Override
	public void notifyColleage() {
		// TODO Auto-generated method stub
		this.mediator.notifyColleage(this,"������������ɣ��������Ա����");
	}
	
}
