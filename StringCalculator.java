package com.po;

public class StringCalculator {
static int count; // to count no of call to add method
	
	public static void main(String[] args) {
		try{
		System.out.println(add("//1,2**5\n\n821\n"));
	}catch (Exception e) {
		
		e.printStackTrace();
	}
	System.out.println("Total number called to add(): "+GetCalledCount());
	}
	
	
	public static int add(String numbers)throws NegativeNotAloowedException{
		count++;
		
		int sum=0;
		
		if(numbers.isEmpty()){
			return 0;
		}else if(!numbers.isEmpty()){
			char c1[]=numbers.toCharArray();
			String num = "0";
			for(int i=0;i<c1.length;i++){
				if(!(c1[i]==','||c1[i]=='*'||c1[i]=='\n'||c1[i]=='/'||c1[i]=='['||c1[i]==']'||c1[i]=='%')){
					//c1[i]=0;
					num+=c1[i];
					if(i==c1.length-1){
						sum+=Integer.parseInt(num);
					}
				}else{
					if(Integer.parseInt(num)<0){
						num="0";
						throw new NegativeNotAloowedException(Integer.parseInt(num));
					}
				else if(Integer.parseInt(num)>1000)
				{
					sum+=Integer.parseInt(num)-1000;
				} else{
					sum+=Integer.parseInt(num);
					num="0";
				}
				}

					}
		}	
            		return sum;
	}
	
	// To count number of call to add method
	public static int GetCalledCount(){
		
		return count;
		
	}
}
