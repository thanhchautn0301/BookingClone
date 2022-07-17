package com.demo.repositories;

import com.demo.entities.Image;
import com.demo.entities_api.ImageApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
    @Query("select new com.demo.entities_api.ImageApi(id, accomodation.id, room.id, name, status) from Image where status =true")
    public List<ImageApi> findAllImage();

    @Query("select new com.demo.entities_api.ImageApi(id, accomodation.id, room.id, name, status) from Image where status =true")
    public List<ImageApi> findAllImageSort(Sort sort);

    @Query("select new com.demo.entities_api.ImageApi(id, accomodation.id, room.id, name, status) from Image where status =true")
    public List<ImageApi> findAllImagePagination(Pageable pageable);

    @Query("select new com.demo.entities_api.ImageApi(id, accomodation.id, room.id, name, status) from Image where status =true and id =:id")
    public ImageApi findImageById(@Param("id") int id);
}
