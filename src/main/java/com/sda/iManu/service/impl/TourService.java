package com.sda.iManu.service.impl;

import com.sda.iManu.domain.Tour;
import com.sda.iManu.repository.TourRepository;
import com.sda.iManu.service.ITourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by RENT on 2016-09-21.
 */
@Service
@Scope("session")
public class TourService implements ITourService {

    @Autowired
    TourRepository tourRepository;

    @Override
    public boolean addTour(Tour tour) {

        Tour savedTour = tourRepository.save(tour);
        return savedTour != null;
    }

    @Override
    public void deleteTour(int tourId) {
        tourRepository.delete(String.valueOf(tourId));
    }

    @Override
    public List<Tour> showAllTours(Tour tour) {
        return tourRepository.findAll();
    }
}
