import java.util.*;

class orderbyfreq{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
int carr[]=new int[n];
int darr[]=new int[n];
int c=0,l=0,max;
String st=s.nextLine();
System.out.println(st);
for(int i=0;i<n;i++)
	arr[i]=s.nextInt();
Arrays.sort(arr);
for(int i=0;i<n;i++)
{
	for(int j=i;j<n;j++){
		if(arr[i]==arr[j])
			c++;
	}
	if(l==0||(l!=0&&(arr[i]!=arr[i-1]))){
			darr[l]=arr[i];
			carr[l++]=c;			
		}
		c=0;
}

for(int i=0;i<l;i++)
{
	for(int j=i;j<l;j++){
		if(carr[i]>carr[j]){
			int t=carr[i];
			carr[i]=carr[j];
			carr[j]=t;
			t=darr[i];
			darr[i]=darr[j];
			darr[j]=t;
		}
	}
}
int j=1,k=0;
for(int i=0;i<l;i++)
{
	while(j<=carr[i]){
	System.out.print(darr[k]+" ");
	j++;
	}
	k++;
j=1;	
}
}
}