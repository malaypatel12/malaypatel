import java.util.*;								//jai kalbhairav//
public class pra3{
	public static void main(String[] args) {

		// taking  length of array from user
		System.out.println("Enter the length of array");
		
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		int sum=1,temp=0;
		
		int [] arr=new int[len]; 

			//taking array elements from user 

		System.out.println("enter the elemnts");

		for(int i=0;i<len;i++){

		arr[i]=sc.nextInt();
        }

  //sorting the array using bubble sort algorithm
  

      for(int i=0;i<len-1;i++){

       	 for(int j=0;j<len-i-1;j++){

       	 	 if(arr[j]>arr[j+1]){

       	 		temp=arr[j];
       	 		arr[j]=arr[j+1];
       	 		arr[j+1]=temp;
       	 	}

       	  }
}



      //calaculating the leat comman integer value
	//if arr[a] has lesser vale than the sum then its calaculate sum
      

      for(int a=0;a<arr.length;a++){

      	if(arr[a]<=sum){

       	 		sum+=arr[a];
			}
			else{
				break;
			}
       	 
       	  System.out.println(sum);

      }

}

}