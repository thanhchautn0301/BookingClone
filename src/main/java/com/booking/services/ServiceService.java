package com.booking.services;

import com.booking.apis.APIClient;
import com.booking.apis.ServiceAPI;
import com.booking.apis.StaffAPI;
import com.booking.entities.Staff;
import org.springframework.stereotype.Service;
import retrofit2.Response;

@Service
public class ServiceService implements IServiceService {

    private ServiceAPI serviceAPI;

    @Override
    public com.booking.entities.Service create(com.booking.entities.Service service) {

        try {
            serviceAPI = APIClient.getClient().create(ServiceAPI.class);
            Response<com.booking.entities.Service> response = serviceAPI.create(service).execute();
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
