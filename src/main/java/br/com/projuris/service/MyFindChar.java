package br.com.projuris.service;

import br.com.projuris.repository.FindCharachterRepository;

public class MyFindChar implements FindCharachterRepository {
	
	public char findChar(String word) {		
		for (char c : word.toCharArray()) {
			if(word.indexOf(c) == word.lastIndexOf(c)) {
				return c;
			}			
		}
		
		return ' ';		
	}

}
