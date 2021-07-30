package com.f4.hellopuppyalram.domain.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AlramType {
	WALK_START,MONITOR_START,WALK_END,MONITORING,REVIEW,
	RESERV,REJECTION,COMPLETE,CANCEL
}
