package com.le.base.enu;

public enum TrafficLamp {
	RED(30) {
		@Override
		public TrafficLamp nextLamp() {
			return GREEN;
		}
	},
	GREEN(45) {
		@Override
		public TrafficLamp nextLamp() {
			return YELLOW;
		}
	},
	YELLOW(5) {
		@Override
		public TrafficLamp nextLamp() {
			return RED;
		}
	};
	
	private int time; 
	private TrafficLamp(int time){
		this.time = time;
	};
	
	public abstract TrafficLamp nextLamp();
	
	
}
