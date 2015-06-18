package com.test.dp.strategy;

public class CompressionWorker {

	private CompressStrategy cs;


	public void setCs(CompressStrategy cs) {
		this.cs = cs;
	}

	public void compress(DiskFolderCollection folder) {
		if (cs == null) {
			cs = new NullCompressStrategy();
		}
		
		cs.compressfiles(folder);
	}
}
