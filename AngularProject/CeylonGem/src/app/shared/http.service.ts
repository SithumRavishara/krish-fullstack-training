import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Crafts } from "../craftstore/Craft.model";

@Injectable({
    providedIn: 'root'
})
export class HttpService {

    private employeeUrl: string = 'http://localhost:3000/Crafts'

    constructor(private http: HttpClient) {

    }

    getAllCrafts(): Observable<Crafts[]> {

        return this.http.get<Crafts[]>(this.employeeUrl)

    }

}
