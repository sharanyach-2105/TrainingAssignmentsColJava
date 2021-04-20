package com.batsman.records;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream3 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("records.dat"));
		Batsman[] bArray = new Batsman[3];
		for (int i = 0; i < 3; i++) {
			bArray[i] = (Batsman) ois.readObject();
		}
		for (Batsman b : bArray) {
			System.out.println(b);
		}

	}

}
