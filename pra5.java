import java.util.Scanner;						 //jai kalbhairav//
class pra5{

	public static void main(String[] args) {
		
	// taking  length of array from user
		System.out.println("Enter the length of array");
		
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
	
		
		int [] arr=new int[len]; 

			//taking array elements from user 

		System.out.println("enter the elemnts");

		for(int i=0;i<len;i++){

		arr[i]=sc.nextInt();
        }

		int sum,flage=0;

		for(int i=0;i<arr.length;i++){

          sum=0;

          for(int j=i;j<arr.length;j++){

            sum+=arr[j];

          	if(sum==0){

          		flage=1;
          		break;
          	}
         }
          	
          
          }
          if(flage==1){
          	System.out.println("true");

          }
          else{

          	  System.out.println("false");


          }



		}


	}
