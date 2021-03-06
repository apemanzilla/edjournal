package me.apemanzilla.edjournal.events;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import me.apemanzilla.edjournal.gameobjects.StationServices;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class Docked extends JournalEvent {
	private String stationName;
	private String stationType;
	private String starSystem;
	private boolean cockpitBreach = false;
	private String stationFaction;
	private String factionState;
	private String stationAllegiance;
	private String stationEconomy;
	private String stationGovernment;
	private double distFromStarLS;
	private List<StationServices> services;
}
