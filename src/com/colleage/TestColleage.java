package com.colleage;
/**
 * ���Թ���ʦ
 * @author Administrator
 *
 */
public class TestColleage extends AbstractColleage {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("���ǲ��Թ���ʦ�������ڲ����Ƿ���bug����������");
	}
	
	@Override
	public void notifyColleage() {
		// TODO Auto-generated method stub
		this.mediator.notifyColleage(this, "�Ҳ�����5��bug���뿪����Ա���bug----------");
	}
}
