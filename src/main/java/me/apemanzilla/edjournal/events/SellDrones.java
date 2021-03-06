package me.apemanzilla.edjournal.events;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class SellDrones extends JournalEvent {
	private String type;
	private int count;
	private int sellPrice;
	private long totalSale;
}
