package com.xmen.domain.models;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stats {
	
	private long count_mutant_dna;
	private long count_human_dna;
	private double ratio;
}
