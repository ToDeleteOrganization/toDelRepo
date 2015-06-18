package com.test.dp.strategy;


public class NullCompressStrategy implements CompressStrategy {

	public void compressfiles(DiskFolderCollection folder) {
		System.out.println("Not compressing anything: " + folder.getFolderPath());
	}

}
