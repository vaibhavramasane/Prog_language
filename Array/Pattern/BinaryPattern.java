//binary pattern

class BinaryPattern{
	
	public static void main(String x[]){
		
		for(int i=0; i<5; i++){
		
			for(int j=0; j<5; j++){
			
				if(i+j==4 || i==j){
				
					System.out.print("1");
				
				}else{
					
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
	}
}

