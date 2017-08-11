package me.apemanzilla.edjournal.events;

import javax.annotation.Nullable;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class EngineerApply extends JournalEvent {
	private String engineer;
	private String blueprint;
	private int level;
	
	@Nullable
	private String override;
}
