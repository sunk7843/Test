package com.po;

public class StringCalculator {
static int count; // to count no of call to add method
	
	public static void main(String[] args) {
		try{
		System.out.println("Total number after adding: " +add("//-1,2**5\n-8\n-821,//"));
	}catch (Exception e) {
		
		e.printStackTrace();
	}
	System.out.println("Total number called to add(): "+GetCalledCount());
	}
	
	
	public static int add(String numbers)throws NegativeNotAloowedException{
		count++;
		
		int sum=0;
		String neNum="";
		if(numbers.isEmpty()){
			return 0;
		}else{
			char c1[]=numbers.toCharArray();
			String num = "0";
			for(int i=0;i<c1.length;i++){
				if(!(c1[i]==','||c1[i]=='*'||c1[i]=='\n'||c1[i]=='/'||c1[i]=='['||c1[i]==']'||c1[i]=='%')){
					//c1[i]=0;
					num+=c1[i];
					
					if(c1[i]=='-'){
						num="";
						num+=c1[i];
					}
					
					if(i==c1.length-1 && Integer.parseInt(num)>0){
						sum+=Integer.parseInt(num);
						}
					
				}else{
					if(Integer.parseInt(num)<0){
						
						neNum+=num;
						num="0";
					}else if(i==c1.length-1 && neNum!=null && !neNum.isEmpty()){
						throw new NegativeNotAloowedException(neNum);
							
					}else if(Integer.parseInt(num)>1000){
					sum+=Integer.parseInt(num)-1000;
				} else if(Integer.parseInt(num)>=0){
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
