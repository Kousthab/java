package com.kousthab.dsjava2;

public class BinarySearch {
	int bs(int a[],int l,int r,int x){
		if(r>=l){
			int mid=l+(r-l)/2;
			if(a[mid]==x)
				return mid;
			if(x<a[mid])
				return bs(a,l,mid-1,x);
			return bs(a,mid+1,r,x);
		}
		return -1;
	}
	void bsString(String s[],String str){
		int lb=0,ub=str.length();
		if(ub>=lb){
			int mid=lb+(ub-lb)/2;
			if(s[mid].compareTo(str)==0){
				System.out.println("String Found");
				return;}
			else if(s[mid].compareTo(str)>=1){
				lb=mid+1;
			}
			else{
				ub=mid-1;
			}
				
		}
		System.out.println("String not Found");
	}
	
	public static void main(String[] args) {
		BinarySearch b=new BinarySearch();
		int arr[]={10,20,30,40,50};
		int n=arr.length;
		int x=40;
		int pos=b.bs(arr, 0, n-1, x);
		if(pos==-1)
			System.out.println("Not found");
		else
			System.out.println("Element found at "+(pos+1)+" position");
	}
}