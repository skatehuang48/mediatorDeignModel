package com.mediator;

import java.util.ArrayList;
import java.util.List;

import com.colleage.AbstractColleage;


public class ProjMgrMediator extends AbstractMediator {
	List<AbstractColleage> colleages = new ArrayList<AbstractColleage>();
	
	@Override
	public void register(AbstractColleage colleage) {
		colleages.add(colleage);
		colleage.setMediator(this);//���н��ߺ�ͬ�¹�������
	}
	
	@Override
	public void notifyColleage(AbstractColleage colleage,String msg) {
		colleages.forEach(coll -> {
			if(coll == colleage){
				coll.work();
				System.out.println(msg);
			}
		});
	}
}
