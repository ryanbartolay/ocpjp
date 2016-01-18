package com.ryan.enthuware.generics;

import java.util.List;

class Booby {} 
class Dooby extends Booby {}
class Tooby extends Dooby {}

public class Number6 {
	Booby b = new Booby();
	Tooby t = new Tooby();
	Dooby d = new Dooby();
	
	public void addData1(List<? super Dooby> dataList) {
		dataList.add(d);
		dataList.add(t);
	}
	
	public void addData2(List<? extends Dooby> dataList){
		b = dataList.get(0);
		//dataList.addAll(new Dooby());
	}
}
