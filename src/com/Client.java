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
		//注册并关联同事对象和中介者对象间的关系
		mediator.register(engineerColleage);
		mediator.register(testColleage);
		
		//同事间信息交互
		engineerColleage.notifyColleage();
		testColleage.notifyColleage();
	}
}
