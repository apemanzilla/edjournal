package me.apemanzilla.edjournal.events;

import lombok.*;
import me.apemanzilla.edjournal.gameobjects.DockingDenialReason;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class DockingDenied extends JournalEvent {
	private String stationName;
	private DockingDenialReason reason;
}
