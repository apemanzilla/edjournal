package me.apemanzilla.edjournal.events;

import javax.annotation.Nullable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import me.apemanzilla.edjournal.gameobjects.Ship;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class ModuleStore extends JournalEvent {
	private String slot;
	private Ship ship;
	private int shipID;
	private String storedItem;

	@Nullable
	private String engineerModifications;

	@Nullable
	private String replacementItem;

	@Nullable
	private Long cost;
}
