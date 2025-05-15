package com.ibm.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean
	public TextEditor textEditor() {
		return new TextEditor();
	}

	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}

}
