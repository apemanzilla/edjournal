package me.apemanzilla.edjournal.events;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class CrewAssign extends JournalEvent {
	private String name;
	private String role;
}
