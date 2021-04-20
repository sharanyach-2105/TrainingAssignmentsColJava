package com.batsman.records;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjectOutputStreamOneBatsanData {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Batsman bt1 = new Batsman(1, "Jadeja", 50, 80, 7845341);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.dat"));
		oos.writeObject(bt1);
	}
}


