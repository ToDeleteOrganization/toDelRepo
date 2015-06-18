package com.test.dp.strategy;

public class JREDiskFolder extends SimpleFolderCollections {

	public JREDiskFolder() {
		super(System.getProperty("java.home"));
	}

}
