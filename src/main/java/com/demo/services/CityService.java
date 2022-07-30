package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.demo.entities.City;
import com.demo.entities_api.AccommodationOfCityApi;
import com.demo.entities_api.CityApi;
import com.demo.repositories.CityRepository;
@Service
public class CityService implements ICityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public CityApi findCityById(int id) {
		// TODO Auto-generated method stub
		return cityRepository.findCityById(id);
	}

	

	public CityApi create(CityApi cityApi) {
		// TODO Auto-generated method stub
		try {
			City city = new City();
			city.setName(cityApi.getName());
			city.setImage(cityApi.getImage());
			city.setHome(cityApi.isHome());
			city.setStatus(true);
			City newCity = cityRepository.save(city);
			cityApi.setId(newCity.getId());
			return cityApi;
		}catch(Exception e){
				e.printStackTrace();
				return null;
		}
	}

	@Override
	public boolean update(CityApi cityApi) {
		// TODO Auto-generated method stub
		 City city = cityRepository.findById(cityApi.getId()).get();
		 city.setName(cityApi.getName());
		 city.setHome(cityApi.isHome());
        return cityRepository.save(city) != null;
	}

	
	
	@Override
	public boolean delete(int id) {
		try {
			City city = cityRepository.findById(id).get();
			city.setStatus(false);
			return cityRepository.save(city)!=null;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<CityApi> findAllCityWithSort(String field) {
		// TODO Auto-generated method stub
		return  cityRepository.findAllCitySort(Sort.by(field));
	}

	@Override
	public List<CityApi> findAllPaginate(int offset, int pageSize) {
		// TODO Auto-generated method stub
		List<CityApi> cities = cityRepository.findAllCityPagination(PageRequest.of(offset,pageSize));
        return cities;
	}

	@Override
	public List<CityApi> findAllCity() {
		// TODO Auto-generated method stub
		return cityRepository.findAllCity();
	}



	@Override
	public List<AccommodationOfCityApi> findAllAccommodationOfCity() {
		return cityRepository.findAllCityWithAccommodation();
	}



	@Override
	public List<AccommodationOfCityApi> findHomeCity() {
		System.out.println("size:  " + cityRepository.findHomeCity().size());
		return cityRepository.findHomeCity();
	}



	@Override
	public List<CityApi> findAllCityWithHome() {
		return cityRepository.findAllCityWithHome();
	}
	
	

}
