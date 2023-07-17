package com.huawei.classroom.student.h07;

public class RifleSoldier extends Soldier {



	public RifleSoldier(  ) { 
		//super(  Param.SOLDIER_HEALTH,Param.SOLDIER_RIFLE_STRENGTH);
		// TODO Auto-generated constructor stub
	}
	
	public void attack(GameObject obj) {
		int dx = this.getX() - obj.getX();
		int dy = this.getY() - obj.getY();
		double dis = Math.pow(dx * dx + dy * dy, 0.5);
		if (this.getRange() < dis) {
			return;
		}
		if (obj instanceof Dog) {
			obj.setHealth(0);
		} else {
			obj.setHealth(obj.getHealth() - this.getStrength());
		}
		
		if (obj instanceof Soldier) {
			Soldier s = (Soldier)obj;
			if (s.life == 1 && s.getHealth() <= 0) {
				s.livingSoldierCount--;
				s.deadedSoldierCount++;
				s.life = 0;
			}
		}
	}
	

}
