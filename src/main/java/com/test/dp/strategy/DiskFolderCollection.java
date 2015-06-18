package com.test.dp.strategy;

import java.io.File;
import java.util.List;

public interface DiskFolderCollection extends Iterable<File> {

	public List<File> getFiles();

	public List<File> getFolders();

	public String getFolderPath();
}
