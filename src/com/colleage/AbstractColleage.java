package com.colleage;

import com.mediator.AbstractMediator;

/**
 * ����ͬ���� �����н��߶���ʹ�н��ߺ�ͬ�²����������ṩͬ�¶��󽻻��ĳ��󷽷���ʵ�������໥Ӱ���ͬ����Ĺ�������
 * @author Administrator
 *
 */
public abstract class AbstractColleage {
	protected AbstractMediator  mediator;
	/**
	 * �����н��߶��� ��ͬ�¶���Ͷ�Ӧ���н���
	 * @param mediator
	 */
	public void setMediator(AbstractMediator mediator){
		this.mediator = mediator;
	}
	
	public void work(){};
	
	public void notifyColleage(){};
}
