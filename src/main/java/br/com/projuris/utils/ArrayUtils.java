package br.com.projuris.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUtils {

	public static List<Integer> convertIntArrayToIntegerList(int[] array) { 
		return Arrays.stream(array).boxed().collect(Collectors.toList());        
	}
}
