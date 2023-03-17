package com.example.be.service;

import com.example.be.model.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBusService {
    Page<Bus> findAll(Pageable pageable);

    void delete(Integer id);

    void save(Integer busNumber, String garageName, String phone,
              String email, String timeGo, String timeOut, String startGo, String endGo, Integer busTypeId);

    Bus findBus(Integer id);

    void update(Integer busNumber, String garageName, String phone,
                String email, String timeGo, String timeOut, String startGo, String endGo, Integer id);
}
