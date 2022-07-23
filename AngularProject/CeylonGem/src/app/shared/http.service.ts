import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Gemstone } from "../gemstone/Gem.model";

@Injectable({
    providedIn: 'root'
})
export class HttpService {

    private employeeUrl: string = 'http://localhost:3000/gemstone'

    constructor(private http: HttpClient) {

    }

    getAllGemstone(): Observable<Gemstone[]> {

        return this.http.get<Gemstone[]>(this.employeeUrl)

    }

}