package com.demo.repositories;

import com.demo.entities.Accomodation;
import com.demo.entities_api.AccomodationApi;
import com.demo.entities_api.RoleApi;
import com.demo.entities_api.RoomDetail;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccomodationRepository extends JpaRepository<Accomodation,Integer> {
    @Query("select new com.demo.entities_api.AccomodationApi(A.id, A.category.id, A.category.name, A.city.id, A.city.name , A.staff.id, A.name, A.status, I.name, A.description) " +
            "from Accomodation A LEFT OUTER JOIN Image I " +
            "ON A.id = I.accomodation.id " +
            "where A.status =true")
    public List<AccomodationApi> findAllAccomodation();


    @Query("select new com.demo.entities_api.AccomodationApi(A.id, A.category.id, A.category.name, A.city.id, A.city.name , A.staff.id, A.name, A.status, I.name, A.description) " +
            "from Accomodation A LEFT OUTER JOIN Image I " +
            "on A.id = I.accomodation.id "+
            "where A.status =true")
    public List<AccomodationApi> findAllAccomodationSort(Sort sort);

    @Query("select new com.demo.entities_api.AccomodationApi(A.id, A.category.id, A.category.name, A.city.id, A.city.name , A.staff.id, A.name, A.status, I.name, A.description) " +
            "from Accomodation A LEFT OUTER JOIN Image I " +
            "on A.id = I.accomodation.id " +
            "where A.status =true")
    public List<AccomodationApi> findAllAccomodationPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.AccomodationApi(A.id, A.category.id, A.category.name, A.city.id, A.city.name , A.staff.id, A.name, A.status, I.name, A.description) " +
            "from Accomodation A LEFT OUTER JOIN Image I " +
            "on A.id=:id and A.id = I.accomodation.id " +
            "where A.status =true")
    public AccomodationApi findAccomodationById(@Param("id") int id);

    @Query("select new com.demo.entities_api.AccomodationApi(A.id, A.category.id, A.category.name, A.city.id, A.city.name , A.staff.id, A.name, A.status, I.name, A.description) " +
            "from Accomodation A LEFT OUTER JOIN Image I " +
            "on A.id = I.accomodation.id " +
            "where A.status =true and A.staff.id = :hostId")
    public List<AccomodationApi> findAllAccomodationByHostId(@Param("hostId") int hostId);


    @Query("select new com.demo.entities_api.AccomodationApi(A.id,A.category.name, A.city.name, A.name, A.status, I.name, A.description) " +
            "from Accomodation A LEFT OUTER JOIN Image I " +
            "on A.id = I.accomodation.id " +
            "where A.status =true and  A.city.id = :cityId")
    public List<AccomodationApi> findAllAccomodationByCityId(@Param("cityId") int cityId);

    @Query("select new com.demo.entities_api.AccomodationApi(A.id,A.category.name, A.city.name, A.name, A.status, I.name, A.description) " +
            "from Accomodation A LEFT OUTER JOIN Image I " +
            "on A.id = I.accomodation.id " +
            "where A.status =true and A.city.name = :cityName")
    public List<AccomodationApi> findAllAccomodationByCityName(@Param("cityName") String cityName);

    @Query("select new com.demo.entities_api.AccomodationApi(A.id,A.category.name, A.city.name, A.name, A.status, I.name, A.description) " +
    "from Accomodation A LEFT OUTER JOIN Image I " +
    "on A.id = I.accomodation.id " +
    "where A.status =true and  A.category.id = :categoryId")
     public List<AccomodationApi> findAllAccomodationByCategoryId(@Param("categoryId") int categoryId);

}
