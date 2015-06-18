package com.test.dp.strategy;

public class Client {

	public static void main(String[] args) {
		CompressStrategy rar = CompressStrategyUtil.getCompressStrategy("rar");
		CompressStrategy zip = CompressStrategyUtil.getCompressStrategy("zip");
		
		// project runtime location
		CompressionWorker cw = new CompressionWorker();
		cw.setDiskLocation(new ProjectDiskFolder());

		cw.setCs(rar);
		cw.compress();

		cw.setCs(zip);
		cw.compress();


		// jre runtime location
		cw = new CompressionWorker();
		cw.setDiskLocation(new JREDiskFolder());

		cw.setCs(rar);
		cw.compress();

		cw.setCs(zip);
		cw.compress();
	
	
	
	}

}
