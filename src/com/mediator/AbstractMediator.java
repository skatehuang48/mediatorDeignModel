package com.mediator;

import com.colleage.AbstractColleage;

/**
 * �����н��� ����ͬ��֮����Ϣ��ת����ͬʱ�����ע��
 * @author Administrator
 *
 */
public abstract class AbstractMediator {

	public void register(AbstractColleage colleage){};
	
	public void notifyColleage(AbstractColleage colleage,String notifyMsg){};
}
