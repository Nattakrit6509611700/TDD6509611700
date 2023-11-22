package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	void push(Object elm);
	Object Top();
	boolean isFull();
}
