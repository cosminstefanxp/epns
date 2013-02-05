package se2.e.utilities;

import java.util.ArrayList;

public class TrackedList<T> extends ArrayList<T> {
	private static final long serialVersionUID = 1L;
	
	private T active = null;
	private int index = -1;
	
	public TrackedList() { }
	
	public boolean moveNext() {
		index++;
		if (index >= size()) return false;
		active = get(index);
		return true;
		}

	public T getActive() {
		if (index < 0 || size() <= index)
			throw new ArrayIndexOutOfBoundsException("No more items in list");
		return active;
		}

	public void reset() {
		index = -1;
		}
	
	}

