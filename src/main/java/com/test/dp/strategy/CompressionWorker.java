package com.test.dp.strategy;

public class CompressionWorker {

	private CompressStrategy cs;

	private DiskFolderCollection folder;

	public void setDiskLocation(DiskFolderCollection folder) {
		this.folder = folder;
	}

	public void setCs(CompressStrategy cs) {
		this.cs = cs;
	}

	public void compress() {
		if (cs == null) {
			cs = new NullCompressStrategy();
		}
		
		cs.compressfiles(folder);
	}
}
