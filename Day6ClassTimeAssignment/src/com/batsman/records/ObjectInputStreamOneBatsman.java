package com.batsman.records;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ObjectInputStreamOneBatsman {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("records.dat"));
		Batsman bt1 = (Batsman) ois.readObject();
		System.out.println(bt1);
	}
}
	



