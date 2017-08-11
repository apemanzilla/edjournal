package me.apemanzilla.edjournal.events;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class CapShipBond extends JournalEvent {
	private long reward;
	private String awardingFaction;
	private String victimFaction;
}
