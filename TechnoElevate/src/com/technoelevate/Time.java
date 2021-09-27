package com.technoelevate;
public class Time {
	
	public String getDurationString(int mins,int sec) {
		
		if(mins>=0 && sec>=0 && sec<=59) {
			if(mins<60) {
				return "0hr"+mins+"m"+sec+"ss";
			}else if(mins>60) {
			int hour=mins/60;
			int minutes=mins%60;
			return hour+"h"+minutes+"m"+sec+"s";
		}
		}
			return "invalid value";
	}

	public String getDurationString(int secs) {
			if(secs>=0) {
				int minu=0;
				if(secs>=60) {
					minu=secs/60;
					secs=secs%60;
					return minu+"m"+secs+"s";
				}
			}
			
			return "invalid value";
	}
}
