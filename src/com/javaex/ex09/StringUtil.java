package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       
        //메소드 내용작성  -- >반복문으로 배열값이 반복되게
    	
    	String total = ""; //초기값 설정해줘야됨
    	
    	for(int i=0; i<strArray.length; i++ ) {
    		
    		total += strArray[i];
    	}
    	
    	return total;
    	
    	
        
    }

}
