package com.jagex.game.client;

import com.jagex.game.client.StockMarketOffer;
import org.openrs2.deob.annotation.OriginalMember;

public class StockMarketManager {

	@OriginalMember(owner = "com.jagex.client!qp", name = "d", descriptor = "[Lclient!q;")
	public static final StockMarketOffer[] offers = new StockMarketOffer[6];

}
