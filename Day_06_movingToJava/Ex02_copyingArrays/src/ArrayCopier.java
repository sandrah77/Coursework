/* 
Create a new Java class called ArrayCopier with a method called copy that takes two arrays of 
integers as parameters. The method should copy the elements of the first array (you can call it src, 
from “source”) to the second one (dst, from “destination”) as much as possible. If the second array 
is smaller, then only those elements that fit will be copied. If the second array is larger, 
it will be filled with zeroes. Write a program that creates an object of this class and uses this 
method to copy some arrays in all three cases: 

• Both arrays are of the same size. (copy all elements from source to destination)
• The source array is longer. (only the elements that fit to be copied)
• The source array is shorter. (fill with zeros)
*/


import java.util.Scanner;
import java.util.Arrays;

public class ArrayCopier {

	public static void main(String[] args) {
		//ArrayCopier test = new ArrayCopier()
		int[] source = {1, 2, 3, 4, 5};
		int[] destination = {10, 86, 115, 18, 16, 865, 16, 14, 84, 33};

		copy(source, destination);
		// int[] dstSmaller = {3,5,7,2};
		// int[] dstEqual = {2,3,8,1,9};
		// int[] dstLarger = {10,86,115,18,16,865,16,14,84,33};


		// test.copy(srcTransfer, dstSmaller);
		// test.printer(srcTransfer, dstSmaller);

		// test.copy(srcTransfer, dstEqual);
		// test.printer(srcTransfer, dstSmaller);

		// test.copy(srcTransfer, dstLarger);
		// test.printer(srcTransfer, dstSmaller);
	}

	public static void copy(int[] src, int[] dst) {
		// Src length is equal or longer than dst length.
		if (src.length >= dst.length) {
			for (int i = 0; i < dst.length; i++) {
				dst[i] = src[i];
			}
		}
		// Src length is smaller and we fill the remaining indexes with zeros.
		if (src.length < dst.length) {
			for (int i = 0; i < dst.length; i++) {
				dst[i] = 0;
			}
		}

		System.out.println("Source array is: ");
		System.out.println();
		for (int i = 0; i < src.length; i++) {
			System.out.print(src[i]);
		}
		System.out.println();
		System.out.println("Destination array is: ");
		System.out.println();
		for (int i = 0; i < dst.length; i++) {
			System.out.print(dst[i]);
		}
	}
}
		/*
		} else {
			dst = Arrays.copyOf(src, src.length);
			for (int i = 0; i < src.length; i++) {
				System.out.print("Source: " + src[i] + " ");
			}
			for (int i = 0; i < dst.length; i++) {
				System.out.print("Destination: " + dst[i] + " ");


			dst = Arrays.copyOf(src,src.length);

		for(int i = 0; i < src.length; i++) {
			if (i <= dst.length) {
				src[i] = dst[i];
			}else if(i > dst.length) {
					src[i] = src[j];
			}
			System.out.println(dst[i] + " ");
			System.out.println(src[i] + " ");
		*/		
