package com.le.base.enu;

/**
 * 用class模仿Enumeration
 * @author LE
 *
 */
public abstract class WeekDay1 {
	private WeekDay1(){};
	public final static WeekDay1 MON = new WeekDay1(){

		@Override
		public WeekDay1 nextDay() {
			return SON;
		}
		
	};
	public final static WeekDay1 SON = new WeekDay1(){

		@Override
		public WeekDay1 nextDay() {
			return MON;
		}
		
	};
	
	public abstract WeekDay1 nextDay();
	
//	public WeekDay1 nextDay(){
//		if (this == MON) {
//			return SON;
//		} else if(this == SON){
//			return MON;
//		}
//		return null;
//	}
	
	@Override
	public String toString() {
		return this == MON ? "MON" : "SON";
	}
	
	
}
