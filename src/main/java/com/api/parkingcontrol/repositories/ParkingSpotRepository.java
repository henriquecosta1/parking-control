package com.api.parkingcontrol.repositories;

import java.util.UUID;

import com.api.parkingcontrol.models.ParkingSpotModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicencePlateCar(String licencePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartment(String apartment);
    boolean existsByBlock(String block);
    
}
