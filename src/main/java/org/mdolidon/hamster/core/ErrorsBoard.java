package org.mdolidon.hamster.core;

import java.util.ArrayList;
import java.util.List;

public class ErrorsBoard {
	
	private List<String> errors = new ArrayList<String>();
	
	public ErrorsBoard() {}
	
	public void note(String s) {
		errors.add(s);
	}
	
	public boolean hasErrors() {
		return !errors.isEmpty();
	}
	
	public String getErrorMessage() {
		return String.join("\n", errors);
	}
	
	public List<String> listErrors() {
		return errors;
	}
}
