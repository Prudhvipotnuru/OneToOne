package com.prudhvi.onetoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prudhvi.onetoone.model.HomeGround;
import com.prudhvi.onetoone.model.IPLTeam;
import com.prudhvi.onetoone.repos.HomeGroundRepo;
import com.prudhvi.onetoone.repos.IPLTeamRepo;

@SpringBootApplication
public class OneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToOneApplication.class, args);
		IPLTeamRepo repo = context.getBean(IPLTeamRepo.class);
		HomeGroundRepo grepo = context.getBean(HomeGroundRepo.class);
		
		IPLTeam team=new IPLTeam();
		team.setCaptainName("virat kohli");
		team.setPurse(88.0);
		team.setTeamName("RCB");
		
		HomeGround ground=new HomeGround();
		ground.setIplTeam(team);
		ground.setName("chinnaswamy");
		
		team.setHomeGround(ground);
		
		repo.save(team);
	}

}
