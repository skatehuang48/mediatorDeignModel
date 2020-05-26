package com;

import com.colleage.AbstractColleage;
import com.colleage.EngineerColleage;
import com.colleage.TestColleage;
import com.mediator.AbstractMediator;
import com.mediator.ProjMgrMediator;

public class Client {
	public static void main(String[] args) {
		AbstractColleage testColleage = new TestColleage();
		AbstractColleage engineerColleage = new EngineerColleage();
		AbstractMediator mediator = new ProjMgrMediator();
		//ע�Ტ����ͬ�¶�����н��߶����Ĺ�ϵ
		mediator.register(engineerColleage);
		mediator.register(testColleage);
		
		//ͬ�¼���Ϣ����
		engineerColleage.notifyColleage();
		testColleage.notifyColleage();
	}
}
