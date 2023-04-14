import {Component, OnInit} from '@angular/core';
import {BusService} from '../../service/bus.service';
import {Bus} from '../../model/bus';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  busList: Bus[];
  bus: Bus = {};

  constructor(private busService: BusService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.busService.findAll().subscribe(data => {
      this.busList = data;
    });
  }

  delete() {
    this.busService.delete(this.bus.id).subscribe(data => {
      this.getAll();
      alert('Xoa thanh cong');
    });
  }

}
