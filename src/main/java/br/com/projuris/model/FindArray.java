package br.com.projuris.model;

import io.swagger.annotations.ApiModel;

@ApiModel("Find Array")
public class FindArray {
	private int[] mainArray;
	private int[] subArray;
	
	public int[] getMainArray() {
		return mainArray;
	}
	public void setMainArray(int[] mainArray) {
		this.mainArray = mainArray;
	}
	public int[] getSubArray() {
		return subArray;
	}
	public void setSubArray(int[] subArray) {
		this.subArray = subArray;
	}	
}
