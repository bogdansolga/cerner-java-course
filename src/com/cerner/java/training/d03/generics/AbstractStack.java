package com.cerner.java.training.d03.generics;

import java.util.ArrayList;
import java.util.List;

// the stack is a _generic_ stack --> its type will be defined when it is used
public abstract class AbstractStack<Element> {
	
	private List<Element> elements = new ArrayList<>();
	
	public void add(Element element) {
		elements.add(element);
	}
	
	public Element remove() {
		return elements.remove(elements.size() - 1);
	}
}
