import java.util.Scanner;

public class pra4{ 
static void arrange(int []arr,int len){

	int i=0;
	int j=len-1;

	while(i<j)
	{
		while(i<=len-1 && arr[i]>0){
			i+=1;
		}

			while(j>0&&arr[j]<0){
				j-=1;
			}
				if(i<j){

					swap(arr,i,j);
				 }
			
		
	}

	if(i==0 || i==len)
		return;

	int k=0;

	while(k<len && i<len){

		swap(arr,k,i);
		i+=1;
		k+=2;
	}

}            

static void swap(int[] arr,int i,int j){

	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}                 
	public static void main(String[] args) {

		System.out.println("Enter the length of array");
		
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		
		
		int [] arr=new int[len]; 

			

		System.out.println("enter the elemnts");

		for(int i=0;i<len;i++){

		arr[i]=sc.nextInt();
        }


		arrange(arr,len);
		for(int j=0;j<len;j++){
			System.out.print(" "+arr[j]);
		}
		









		}
	}