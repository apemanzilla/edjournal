package me.apemanzilla.edjournal.events;

import javax.annotation.Nullable;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class EngineerProgress extends JournalEvent {
	private String engineer;
	
	@Nullable
	private Integer rank;
	private String progress;
}
