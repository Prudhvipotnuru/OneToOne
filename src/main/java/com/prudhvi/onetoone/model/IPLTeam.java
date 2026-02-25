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
	
	//fetch type doesnt matter for oneToOne mapping(no matter if it is lazy or eager, it works the same)
	@OneToOne(mappedBy = "iplTeam",cascade = CascadeType.ALL)
	private HomeGround homeGround;
}
