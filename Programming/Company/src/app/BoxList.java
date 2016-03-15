package app;

import java.util.ArrayList;
import java.util.List;

public class BoxList<T> {
	
	public final List<T> list;
	
	public BoxList() {
		list = new ArrayList<>();
	}
	
	public void add(T obj) {
		list.add(obj);
	}
	
	public List<T> getList() {
		return list;
	}
}
