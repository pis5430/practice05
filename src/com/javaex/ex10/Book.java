package com.javaex.ex10;

public class Book {
    
	
	//필드
    private int bookNo; //책번호
    private String title; //책제목
    private String author; //작가
    int stateCode; //상태코드 (대여 유무를 나타내는 상태코드)
    
    
    //생산자
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	stateCode = 1;
    }
    
    // 메소드 게터, 세터
    
    
    public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	//일반메소드
	
	
    public void rent() {
    	this.stateCode = 0;
    	System.out.println(title + "이(가) 대여됐습니다.");
    	
    }

	public void print() {
		
		if(stateCode==0) {
			System.out.println(bookNo+" 책 제목:" + title + ", 작가" + author + ", 대여 유무 : 재고없음" );
			
		}else if(stateCode==1) {
			System.out.println(bookNo+" 책 제목:" + title + ", 작가" + author + ", 대여 유무 : 재고있음" );
		}
    	
    }
    
    
    
}
