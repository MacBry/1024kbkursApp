package com.mac.bry.kurs1024kb.utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	public static void createNewFile(String fileName) throws IOException {
		File file = new File(fileName);
		file.createNewFile();
	}
}
