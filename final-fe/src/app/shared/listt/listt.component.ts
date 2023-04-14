import { Component, OnInit } from '@angular/core';
import {CoSo} from '../../model/co-so';
import {CoSoService} from '../../service/co-so.service';

@Component({
  selector: 'app-listt',
  templateUrl: './listt.component.html',
  styleUrls: ['./listt.component.css']
})
export class ListtComponent implements OnInit {
  coSo: CoSo[] = [];
  constructor(private coSoService: CoSoService) {
  }

  ngOnInit(): void {
    this.getAll(0);
  }

  getAll(page: number) {
    this.coSoService.findAll(page).subscribe(data => {
        this.coSo = data["content"];
        console.log(this.coSo);
      }
    );
  }

}
