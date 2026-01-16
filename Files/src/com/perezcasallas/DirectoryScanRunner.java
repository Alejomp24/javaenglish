package com.perezcasallas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("./resources/write.txt");
		// List<String> lines = Files.readAllLines(pathFileToRead);
		// System.out.println(lines);

		List<String> list = List.of("Bogotá", "Mosquera", "San Agustín", "Pitalito");
		Files.write(pathFileToWrite, list);
		// Files.lines(pathFileToRead).map(String::toLowerCase).filter(str ->
		// str.contains("a"))
		// .forEach(System.out::println);
	}
}
