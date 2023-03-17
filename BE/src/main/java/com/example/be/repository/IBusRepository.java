package com.example.be.repository;


import com.example.be.model.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface IBusRepository extends JpaRepository<Bus, Integer> {
    @Query(value = "select * from bus", nativeQuery = true)
    Page<Bus> findAll(Pageable pageable);

    @Modifying
    @Transactional
    @Query(value = "delete from bus where id = :id", nativeQuery = true)
    void deleteLogical(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "insert into bus(bus_number,garage_name,phone,email,time_go,time_out,start_go,end_go,bus_type_id) value(:busNumber, :garageName, :phone, :email, :timeGo, :timeOut, :startGo, :endGo, :busTypeId)", nativeQuery = true)
    void save(@Param("busNumber") Integer busNumber,
              @Param("garageName") String garageName,
              @Param("phone") String phone,
              @Param("email") String email,
              @Param("timeGo") String timeGo,
              @Param("timeOut") String timeOut,
              @Param("startGo") String startGo,
              @Param("endGo") String endGo,
              @Param("busTypeId") Integer busTypeId);

    @Query(value = "select * from bus where id= :id", nativeQuery = true)
    Bus findBus(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "update bus set bus_number = :busNumber, garage_name = :garageName, phone = :phone, email = :email, time_go = :timeGo, time_out = :timeOut, start_go = :startGo, end_go = :endGo where id = :id", nativeQuery = true)
    void update(@Param("busNumber") Integer busNumber,
                @Param("garageName") String garageName,
                @Param("phone") String phone,
                @Param("email") String email,
                @Param("timeGo") String timeGo,
                @Param("timeOut") String timeOut,
                @Param("startGo") String startGo,
                @Param("endGo") String endGo,
                @Param("id") Integer id);
}
