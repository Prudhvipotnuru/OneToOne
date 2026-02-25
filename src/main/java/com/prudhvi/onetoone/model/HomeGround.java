package com.prudhvi.onetoone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class HomeGround {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer groundId;
	private String name;
	
	@OneToOne
	private IPLTeam iplTeam;
}
