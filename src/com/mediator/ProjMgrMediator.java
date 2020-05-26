package com.mediator;

import java.util.ArrayList;
import java.util.List;

import com.colleage.AbstractColleage;


public class ProjMgrMediator extends AbstractMediator {
	List<AbstractColleage> colleages = new ArrayList<AbstractColleage>();
	
	@Override
	public void register(AbstractColleage colleage) {
		colleages.add(colleage);
		colleage.setMediator(this);//将中介者和同事关联起来
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
