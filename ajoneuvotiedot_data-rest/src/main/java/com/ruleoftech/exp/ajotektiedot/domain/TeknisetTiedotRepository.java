package com.ruleoftech.exp.ajotektiedot.domain;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Repository interface for {@link TeknisetTiedot} instances. The interface is
 * used to declare so called query methods, methods to retrieve single entities
 * or collections of them.
 */
@RepositoryRestResource(collectionResourceRel = "tekniset-tiedot", path = "tekniset-tiedot")
public interface TeknisetTiedotRepository extends
PagingAndSortingRepository<TeknisetTiedot, Long> {

	/**
	 * Find entities by kaupallinenNimi.
	 *
	 * @param malli
	 * @return
	 */
	List<TeknisetTiedot> findByKaupallinenNimi(@Param("malli") String malli,
			Pageable pageable);

	/**
	 * Find entities by merkkiSelvakielinen and/or kaupallinenNimi.
	 *
	 * @param merkki
	 * @param malli
	 * @return
	 */
	// FIXME: malli always NULL
	@Query("SELECT t FROM TeknisetTiedot t WHERE t.merkkiSelvakielinen LIKE :merkki AND t.kaupallinenNimi LIKE %:malli%")
	List<TeknisetTiedot> findByMerkkiAndMalli(@Param("merkki") String merkki,
			@Param("malli") String malli, Pageable pageable);
}
