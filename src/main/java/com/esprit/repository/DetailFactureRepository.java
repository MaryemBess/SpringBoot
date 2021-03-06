package com.esprit.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.entities.detailFacture;
@Repository
public interface DetailFactureRepository extends JpaRepository <detailFacture, Long> {
	/*@Query(value = "Select SUM(dF.qte * dF.produit.prixUnitaire) FROM DetailFacture dF WHERE (dF.produit.idProduit=:id-produit) and (dF.facture.dateFacture between :start_date and :end_date)")
	float getRevenuBrutProduit(@Param("id-produit") Long idProduit, @Param("start_date") Date startDate,
			@Param("end_date") Date endDate);*/
}
