//pyramid

class pyramid{

	public static void main(String x[]){
		
		for(int i=0; i<5; i++){

			for(int j=i; j<5; j++){
	
				if(i<=j){
		
					System.out.print("*");
				
				}else{
			
					System.out.print(" ");
				
				}
			}
			System.out.println();
		}
		
	}
}
			