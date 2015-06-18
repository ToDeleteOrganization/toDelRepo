package com.test.dp.strategy;

import java.io.File;

public class RarCompressStrategy implements CompressStrategy {

	public void compressfiles(DiskFolderCollection folder) {
		System.out.println("Rarring: " + folder.getFiles().size() + " files, and " + folder.getFolders().size() + " folders.");
		for (File f : folder) {
			System.out.println("Rarring: " + f.getAbsolutePath());
		}
	}

}
