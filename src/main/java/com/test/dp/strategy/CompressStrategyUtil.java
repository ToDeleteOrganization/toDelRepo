package com.test.dp.strategy;

public class CompressStrategyUtil {

	public static CompressStrategy getCompressStrategy(String strategy) {
		CompressStrategy cs = new NullCompressStrategy();

		if ("rar".equals(strategy)) {
			cs = new RarCompressStrategy();

		} else if ("zip".equals(strategy)) {
			cs = new ZipCompressStrategy();
		}

		return cs;
	}

}
