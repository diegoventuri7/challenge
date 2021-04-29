package br.com.projuris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projuris.model.FindArray;
import br.com.projuris.service.MyFindArray;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "FindArrayController")
@RequestMapping("/find-array")
public class FindArrayController  {

	@Autowired
	private MyFindArray myFindArray;
	
	@PostMapping
	@ApiOperation(value = "Given two arrays, returns the first occurrence in the second one")
	public int findArray(@RequestBody FindArray data) {		
		return this.myFindArray.findArray(data.getMainArray(), data.getSubArray());		
	}
}
