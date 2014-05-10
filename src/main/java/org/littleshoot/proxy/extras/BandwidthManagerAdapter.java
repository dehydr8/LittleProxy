package org.littleshoot.proxy.extras;

public class BandwidthManagerAdapter implements BandwidthManager {

	@Override
	public long upstream() {
		return 0;
	}

	@Override
	public long downstream() {
		return 0;
	}

}
