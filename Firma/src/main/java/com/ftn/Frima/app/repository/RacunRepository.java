package com.ftn.Frima.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ftn.Frima.app.models.RacunModel;



public interface RacunRepository extends JpaRepository<RacunModel, Long>{

	public RacunModel findByBrojRacuna(String brojRacuna);
}
