package br.com.projuris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projuris.service.MyFindChar;

@RestController
@RequestMapping("/find-char")
public class FindCharController  {

	@Autowired
	private MyFindChar myFindChar;
	
	@PostMapping
	public char findArray(@RequestBody String word) {		
		return this.myFindChar.findChar(word);		
	}
}
