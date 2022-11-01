package com.kodak;

public class CanonStills {
	
	
public static void main(String[] args) {
	byte iso=110;  //widenning type casting
	short shutter=iso;
	System.out.println(shutter);
	
	short battery=98;
	int power=battery;
	System.out.println(power);
	
	int memory=2158;
	long capacity=memory;
	System.out.println(capacity);
	
	float fstop=6.85f;
	double length=fstop;
	System.out.println(length);
	
	float focus=10586;
	byte clips  =(byte)focus;//narrow type casting//
	System.out.println(clips);
	
	double pay=85245;
	int cash=(int)pay;
	System.out.println(cash);
	
	long price =102589;
	short Rate=(short)price;
	System.out.println(Rate);
	
	double camera=-85468;
	float rpoint=(float)camera;
	System.out.println(rpoint);
	
}
}
