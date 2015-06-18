package com.test.dp.strategy;

public class Client {

	public static void main(String[] args) {
		CompressStrategy rar = CompressStrategyUtil.getCompressStrategy("rar");
		CompressStrategy zip = CompressStrategyUtil.getCompressStrategy("zip");
		
		// project runtime location
		CompressionWorker cw = new CompressionWorker();

		cw.setCs(rar);
		cw.compress(new ProjectDiskFolder());

		cw.setCs(zip);
		cw.compress(new ProjectDiskFolder());


		// jre runtime location
		cw.setCs(rar);
		cw.compress(new JREDiskFolder());

		cw.setCs(zip);
		cw.compress(new JREDiskFolder());

	}

}
