package com.test.dp.strategy;

import java.io.File;

public class ZipCompressStrategy implements CompressStrategy {

	public void compressfiles(DiskFolderCollection folder) {
		System.out.println("Zipping: " + folder.getFiles().size() + " files, and " + folder.getFolders().size() + " folders.");
		for (File f : folder) {
			System.out.println("Zipping: " + f.getAbsolutePath());
		}
	}

}
