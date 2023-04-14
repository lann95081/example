import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {CoSo} from '../model/co-so';
import {Observable} from 'rxjs';

class Page<T> {
}

@Injectable({
  providedIn: 'root'
})
export class CoSoService {

  constructor(private httpClient: HttpClient) {}

  findAll(page: number): Observable<CoSo[]> {
    return this.httpClient.get<CoSo[]>('http://localhost:8080?page=' + page);
  }
}
