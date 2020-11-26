package com.javaex.ex07_1;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3]; // Friend 는 주소, 친구 3명등록
        
        Friend p1 = new Friend();
        Friend p2 = new Friend();
        Friend p3 = new Friend();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용 --> i값으로 가능한지
            
        	// 친구정보(이름) 입력받기 String name = sc.nextIine(); 

        	// 친구정보(핸드폰) 입력받기 String hp = sc.nextIine(); 
        
        	// 친구정보(학교) 입력받기 String school = sc.nextIine(); 

            // Friend 인스턴스 생성하여 데이터 넣기 p1.getName();

            // 인스턴스 주소를 배열에 대입  -->friendArray[0] = p1; --> p1주소
        
        for(int j = 0; j <friendArray.length; j++) {
        	
        	System.out.print("이름: ");
        	String name = sc.nextLine();
        	System.out.print("핸드폰: ");
        	String hp = sc.nextLine();
        	System.out.print("학교: ");
        	String school = sc.nextLine();
        	
        	System.out.println("------------------------");
        	
        	/*  --> 3번째 값만 출력되는 이유가 뭘까,,,?
        	p1.setName(name);
        	p1.setHp(hp);
        	p1.setSchool(school);
        	
        	p2.setName(name);
        	p2.setHp(hp);
        	p2.setSchool(school);
        	
        	p3.setName(name);
        	p3.setHp(hp);
        	p3.setSchool(school);
        	*/
        	
        	
        	friendArray[0] = p1;
        	friendArray[1] = p2;
        	friendArray[2] = p3;
        }
        
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        
        

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {  
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
