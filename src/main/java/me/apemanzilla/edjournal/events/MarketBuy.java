package me.apemanzilla.edjournal.events;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class MarketBuy extends JournalEvent {
	private String type;
	private int count;
	private int buyPrice;
	private long totalCost;
}
