package com.test.dp.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// TODO: create a proxy for this
public class SimpleFolderCollections implements DiskFolderCollection {

	private List<File> files = new ArrayList<File>();

	private List<File> folders = new ArrayList<File>();

	private String path;

	public SimpleFolderCollections(String path) {
		this.path = path;
		init();
	}

	private void init() {
		File ff = new File(path);

		for (File fileFolder : ff.listFiles()) {
			if (fileFolder.isFile()) {
				this.files.add(fileFolder);

			} else if (fileFolder.isDirectory()) {
				this.folders.add(fileFolder);
			}
		}
	}

	public List<File> getFiles() {
		return this.files;
	}

	public List<File> getFolders() {
		return this.folders;
	}

	public String getFolderPath() {
		return this.path;
	}

	public Iterator<File> iterator() {
		final List<File> all = new ArrayList<File>();
		all.addAll(getFiles());
		all.addAll(getFolders());
		return all.iterator();
	}
}
