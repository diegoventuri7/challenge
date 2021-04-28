package br.com.projuris.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projuris.model.FindArray;
import br.com.projuris.service.MyFindArray;

@RestController
@RequestMapping("/find-array")
public class FindArrayController  {

	private MyFindArray myFindArray = new MyFindArray();
	
	@PostMapping
	public int findArray(@RequestBody FindArray data) {		
		return myFindArray.findArray(data.getMainArray(), data.getSubArray());		
	}
}