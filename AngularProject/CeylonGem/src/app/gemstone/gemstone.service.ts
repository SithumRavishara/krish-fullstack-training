import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpService } from '../shared/http.service';
import { Gemstone } from './Gem.model';

@Injectable({
  providedIn: 'root'
})
export class GemeeService {

  constructor(private httpService: HttpService) { }

  getGemstone(): Observable<Gemstone[]> {
    return this.httpService.getAllGemstone();
  }
}