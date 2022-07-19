package com.demo.repositories;

import com.demo.entities.Accomodation;
import com.demo.entities.Role;
import com.demo.entities_api.AccomodationApi;
import com.demo.entities_api.RoleApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccomodationRepository extends JpaRepository<Accomodation,Integer> {
    @Query("select new com.demo.entities_api.AccomodationApi(id, category.id, city.id, staff.id, name, status) from Accomodation where status =true")
    public List<AccomodationApi> findAllAccomodation();

    @Query("select new com.demo.entities_api.AccomodationApi(id, category.id, city.id, staff.id, name, status) from Accomodation where status =true and staff.id = :hostId")
    public List<AccomodationApi> findAllAccomodationByHostId(int hostId);

    @Query("select new com.demo.entities_api.AccomodationApi(id, category.id, city.id, staff.id, name, status) from Accomodation where status =true")
    public List<AccomodationApi> findAllAccomodationSort(Sort sort);

    @Query("select new com.demo.entities_api.AccomodationApi(id, category.id, city.id, staff.id, name, status) from Accomodation where status =true")
    public List<AccomodationApi> findAllAccomodationPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.AccomodationApi(id, category.id, city.id, staff.id, name, status) from Accomodation where status =true and id=:id")
    public AccomodationApi findAccomodationById(@Param("id") int id);

}
