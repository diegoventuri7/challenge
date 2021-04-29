package br.com.projuris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projuris.service.MyFindChar;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "FindCharController")
@RequestMapping("/find-char")
public class FindCharController  {

	@Autowired
	private MyFindChar myFindChar;
	
	@PostMapping
	@ApiOperation(value = "Given a string, return the first unique word")	
	public char findArray(@RequestBody String word) {		
		return this.myFindChar.findChar(word);		
	}
}
