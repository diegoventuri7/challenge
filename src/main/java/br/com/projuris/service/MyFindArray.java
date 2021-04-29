package br.com.projuris.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projuris.repository.FindArrayRepository;
import br.com.projuris.utils.ArrayUtils;

@Service
public class MyFindArray implements FindArrayRepository {
	
	public int findArray(int[] array, int[] subArray) {
		if(array.length == 0 || subArray.length == 0) {
			return -1;
		}
		
		List<Integer> listArray = ArrayUtils.convertIntArrayToIntegerList(array);
		List<Integer> listSubArray = ArrayUtils.convertIntArrayToIntegerList(subArray);
		
		int value = Collections.indexOfSubList(listArray, listSubArray); 
		
		if(value == -1) {					
			return -1;
		}
				
		for (int i = (value + subArray.length); i < array.length;) {			
			List<Integer> rest = listArray.subList(i,listArray.size());
			
			int newValue = Collections.indexOfSubList(rest, listSubArray);
			
			if(newValue == -1) {					
				break;
			}
			
			value = newValue + i;			
			i = value + subArray.length;			
		}		
			
		return value;
	}

}
