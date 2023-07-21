package controller;

import service.NumDeptMapper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumDeptMapper ndm = new NumDeptMapper();
		
		System.out.println(ndm.findDept(""));
		
	}

}
