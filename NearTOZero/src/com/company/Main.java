package com.company;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		int j, k;
		System.out.println("Enter Size of Array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Elements of array : ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int sum = 0;
		int min_sum = Integer.MAX_VALUE;
		j=0;
		k=n-1;
		int min_l = j,min_r=k;
		while (j < k) {
			sum = a[j] + a[k];
			if (Math.abs(sum) < Math.abs(min_sum)) {
				min_sum = sum;
				min_l = j;
				min_r = k;
			}
			if (sum < 0)
				j++;
			else
				k--;
		}
		System.out.println(a[min_l] + " , " + a[min_r]);
	}
}

