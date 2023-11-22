package core;

import java.util.ArrayList;

public class Stack implements IStack {
	
	private ArrayList<Object> elm = new ArrayList<>();

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (elm == null || elm.size()==0) {
			return true;
		}
		else
			return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void push(Object element) {
		// TODO Auto-generated method stub
		elm.add(element);
	}
	
	@Override
	public Object Top() {
		// TODO Auto-generated method stub
		return elm.get(elm.size()-1);
	}
}