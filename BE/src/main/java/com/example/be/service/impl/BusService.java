package com.example.be.service.impl;

import com.example.be.model.Bus;
import com.example.be.repository.IBusRepository;
import com.example.be.service.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService implements IBusService {
    @Autowired
    private IBusRepository iBusRepository;

    @Override
    public List<Bus> findAll() {
        return iBusRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        iBusRepository.deleteLogical(id);
    }

    @Override
    public void save(Integer busNumber, String garageName, String phone, String email, String timeGo, String timeOut, String startGo, String endGo, Integer busTypeId) {
        iBusRepository.save(busNumber, garageName, phone, email, timeGo, timeOut, startGo, endGo, busTypeId);
    }

    @Override
    public Bus findBus(Integer id) {
        return iBusRepository.findBus(id);
    }

    @Override
    public void update(Integer busNumber, String garageName, String phone, String email, String timeGo, String timeOut, String startGo, String endGo, Integer id) {
        iBusRepository.update(busNumber, garageName, phone, email, timeGo, timeOut, startGo, endGo, id);
    }
}
