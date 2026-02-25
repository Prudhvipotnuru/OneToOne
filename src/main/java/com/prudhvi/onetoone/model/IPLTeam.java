package com.prudhvi.onetoone.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class IPLTeam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer teamId;
	private String teamName;
	private Double purse;
	private String captainName;
	
	@OneToOne(mappedBy = "iplTeam",cascade = CascadeType.ALL)
	private HomeGround homeGround;
}
