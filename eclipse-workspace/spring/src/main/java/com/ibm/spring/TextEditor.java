package com.ibm.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor() {
		
	}
	public TextEditor(SpellChecker spellChecker ) {
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}
	@Autowired
//	@Qualifier("spellChecker2")
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
