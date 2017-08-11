package me.apemanzilla.edjournal.events;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class DockingGranted extends JournalEvent {
	private String stationName;
	private int landingPad;
}
