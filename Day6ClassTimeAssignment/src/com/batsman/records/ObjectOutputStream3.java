package com.batsman.records;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream3 {

	public static void main(String[] args) throws IOException {
		Batsman bt1 = new Batsman(1, "Jadeja", 50, 80, 7845341);
		Batsman bt2 = new Batsman(101, "Dhoni", 500, 1200, 458762145);
		Batsman bt3 = new Batsman(101, "Rahul", 30, 420, 587621221);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.dat"));
		oos.writeObject(bt1);
		oos.writeObject(bt2);
		oos.writeObject(bt3);

	}

}
