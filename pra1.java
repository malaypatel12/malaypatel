import java.util.*;         						 //jai kalbhairav//
import java.io.*;

public class pra1{
	public static void main(String[] args) {

		
		int arr1[]={1,5,10,20,40,80,100};
		int arr2[]={6,7,10,20,40,80,100};
		int arr3[]={3,4,10,15,20,30,70,80,100,120};
		

		int temp=0;

		System.out.println("commans elements are ");

		// calaculating the commans elements present in the array

		for(int i=0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++)
			{
					for(int k=0;k<arr3.length;k++){

						if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]){

							temp=arr1[i]=arr2[j]=arr3[k];
							System.out.print(" "+temp);
							
						}

					}
				
					
				}
				


			}

                 
		}

		
		}
		
	
