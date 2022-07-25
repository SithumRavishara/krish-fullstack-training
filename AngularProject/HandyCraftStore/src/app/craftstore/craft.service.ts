import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpService } from '../shared/http.service';
import { Crafts } from './Craft.model';

@Injectable({
  providedIn: 'root'
})
export class GemeeService {

  constructor(private httpService: HttpService) { }

  getCrafts(): Observable<Crafts[]> {
    return this.httpService.getAllCrafts();
  }
}
