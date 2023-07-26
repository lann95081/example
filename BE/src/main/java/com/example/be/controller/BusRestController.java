//package com.example.be.controller;
//
//import com.example.be.model.Bus;
//import com.example.be.model.BusType;
//import com.example.be.service.IBusService;
//import com.example.be.service.IBusTypeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//List
//
//@RestController
//@CrossOrigin("*")
//@RequestMapping("")
//public class BusRestController {
//
//    @Autowired
//    private IBusService iBusService;
//
//    @Autowired
//    private IBusTypeService iBusTypeService;
//
////    @GetMapping("/list")
////    private ResponseEntity<?> showList(@PageableDefault(value = 2) Pageable pageable) {
////        Page<Bus> busPage = iBusService.findAll(pageable);
////        return new ResponseEntity<>(busPage, HttpStatus.OK);
////    }
//
//    @GetMapping("/list")
//    private ResponseEntity<?> showList() {
//        List<Bus> busPage = iBusService.findAll();
//        return new ResponseEntity<>(busPage, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/list/{id}")
//    private ResponseEntity<?> delete(@PathVariable("id") Integer id) {
//        try {
//            iBusService.delete(id);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @GetMapping("/bus-type")
//    private ResponseEntity<List<BusType>> busTypeList() {
//        List<BusType> busTypeList = iBusTypeService.findAll();
//        if (busTypeList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(busTypeList, HttpStatus.OK);
//    }
//
//    @PostMapping("/create")
//    private ResponseEntity<?> save(@RequestBody Bus bus) {
//
//        try {
//            iBusService.save(bus.getBusNumber(), bus.getGarageName(), bus.getPhone(), bus.getEmail(), bus.getTimeGo(), bus.getTimeOut(), bus.getStartGo(), bus.getEndGo(), bus.getBusType().getBusTypeId());
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PutMapping("/update")
//    private ResponseEntity<?> update(@RequestBody Bus bus) {
//        iBusService.update(bus.getBusNumber(), bus.getGarageName(), bus.getPhone(), bus.getEmail(), bus.getTimeGo(), bus.getTimeOut(), bus.getStartGo(), bus.getEndGo(), bus.getId());
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}
