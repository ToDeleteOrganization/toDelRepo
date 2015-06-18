package com.test.dp.strategy;

import java.io.File;
import java.util.Iterator;
import java.util.List;

// TODO: change to more proxy like, the file/folder reading should be made only whne needed
public class ProjectDiskFolder implements DiskFolderCollection {

	private final DiskFolderCollection simple;

	public ProjectDiskFolder() {
		String projPath = System.getProperty("java.class.path");
		simple = new SimpleFolderCollections(projPath);
	}

	public Iterator<File> iterator() {
		return simple.iterator();
	}

	public List<File> getFiles() {
		return simple.getFiles();
	}

	public List<File> getFolders() {
		return simple.getFolders();
	}

	public String getFolderPath() {
		return simple.getFolderPath();
	}

}
