package com.xmen.domain.models;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "dna")
public class dna implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String _id;
	private String[] dna;
	private boolean ismutant;
}
