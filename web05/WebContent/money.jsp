<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<% 
		//money와 choice값을 받아서
		//결제 처리 후
		//금액을 클라이언트에게 전송
		
		String money = request.getParameter("money");
		String choice = request.getParameter("choice");
		
		int money2 = Integer.parseInt(money);
		double money3 = 0;
		
		if(choice.equals("3")){ //계좌이체 30%할인
				money3 = money2 * 0.7;			
		}else if(choice.equals("2")){ //20% discount
			    money3 = money2 * 0.8;	
		}else{ //1인 경우 no discount
				money3 = money2;	
		}
		//결제금액은 타입변환 (casting) 강제로 변환
		%> 최종 결제 금액은 >>  <%= (int)money3 %> 원