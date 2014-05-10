package org.littleshoot.proxy.extras;

import java.util.concurrent.ScheduledExecutorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.handler.traffic.GlobalTrafficShapingHandler;
import io.netty.handler.traffic.TrafficCounter;

public class GlobalBandwidthShaper extends GlobalTrafficShapingHandler {
	
	public static final Logger logger = LoggerFactory.getLogger(GlobalBandwidthShaper.class);

	public GlobalBandwidthShaper(ScheduledExecutorService executor, long writeLimit, long readLimit, long checkInterval) {
		super(executor, writeLimit, readLimit, checkInterval);
	}
	
	@Override
	protected void doAccounting(TrafficCounter counter) {
		super.doAccounting(counter);
		logger.info("trafficShaper " + this);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
