package expression;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class expression {
	private ArrayList num_array = new ArrayList();
	private int[] num;

	public expression(String filename) throws IOException {
		File textfile = new File(filename);
		try {
			/*
			 * Reader reader = new InputStreamReader(new
			 * FileInputStream(filename)); int tempchar; while ((tempchar =
			 * reader.read()) != -1) { if (((char) tempchar) != '\r') {
			 * num_array.add(tempchar); //System.out.print(num_array.); } }
			 * reader.close(); for (int i = 0; i < num_array.size(); i++) {
			 * System.out.print(num_array.indexOf(i)); }
			 */
			Reader reader = new InputStreamReader(new FileInputStream(filename));
			char[] tempchars = new char[30];
			int charread = 0;
			reader = new InputStreamReader(new FileInputStream(filename));
			// 读入多个字符到字符数组中，charread为一次读取字符数
			while ((charread = reader.read(tempchars)) != -1) {
				// 同样屏蔽掉\r不显示
				if ((charread == tempchars.length)
						&& (tempchars[tempchars.length - 1] != '\r')) {
					System.out.print(tempchars);
				} else {
					for (int i = 0; i < charread; i++) {
						if (tempchars[i] == '\r') {
							continue;
						} else {
							System.out.print(tempchars[i]);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		int i = 0;
		i++;
		expression exp = new expression(args[0]);
	}
}
