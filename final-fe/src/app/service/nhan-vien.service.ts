import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class NhanVienService {

  constructor(private httpClient: HttpClient) { }

}
