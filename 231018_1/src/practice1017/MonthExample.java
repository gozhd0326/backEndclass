package practice1017;

import java.util.Calendar;

public class MonthExample {
public static void main(String[]args) {
	Month today = null;
	
	Calendar cal = Calendar.getInstance();
	
	int month = cal.get(Calendar.MONTH);
	
	switch(month) {
	case 0: today = Month.JANUARY ; break;
	case 1: today = Month.FEBRUARY ; break;
	case 2: today = Month.MARCH ; break;
	case 3: today = Month.APRIL ; break;
	case 4: today = Month.MAY ; break;
	case 5: today = Month.JUNE ; break;
	case 6: today = Month.JULY ; break;
	case 7: today = Month.AUGUST ; break;
	case 8: today = Month.SEPTEMBER ; break;
	case 9: today = Month.OCTOBER ; break;
	case 10: today = Month.NOVEMBER ; break;
	case 11: today = Month.DECEMBER ; break;
	
	}
	if(today == Month.JANUARY) {
		System.out.println("새로운 해가 시작되는 달인 1월은 겨울이지용");

	}else if(today == Month.FEBRUARY) {
		System.out.println("1년중 가장 짧은 달인 2월도 겨울이죵");
	}else if(today == Month.MARCH) {
		System.out.println("새학기가 시작되는 3월은 봄이에요!");
	}else if(today == Month.APRIL) {
		System.out.println("꽃이 피는 4월은 봄이랍니다~");
	}else if(today == Month.MAY) {
		System.out.println("가정의 달 5월도 봄이에요! 가족과 함께 즐거운 시간을 보내요~");
	}else if(today == Month.JUNE) {
		System.out.println("여름이 시작되는 6월!");
	}else if(today == Month.JULY) {
		System.out.println("장마철인 7월은 여름이에요~~");
	}else if(today == Month.AUGUST) {
		System.out.println("너무 더워요...ㅠ 8월은 여름입니다!");
	}else if(today == Month.SEPTEMBER) {
		System.out.println("날씨가 선선해지기 시작하는 9월은 가을이랍니다~~");
	}else if(today == Month.OCTOBER) {
		System.out.println("천고마비의 계절... 하늘은 높고 나는 살이찌고..가을인 10월입니다!");
	}else if(today == Month.NOVEMBER) {
		System.out.println("가을타나봐... 11월이에요..");
	}else if(today == Month.DECEMBER) {
		System.out.println("어머나! 벌써 크리스마스가 있는 12월이네요~ 12월은 눈내리는 겨울이랍니다!");		
	}
	
	
}
}
