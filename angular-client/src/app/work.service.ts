import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Work} from "./work";

@Injectable({
  providedIn: 'root'
})
export class WorkService {

  private baseUrl = "http://localhost:8080/works"

  constructor(private httpClient: HttpClient) { }

  getWorks(): Observable<Work[]> {
    return this.httpClient.get<Work[]>(`${this.baseUrl}`);
  }

  addWork(artistId: number, work: Work): Observable<Object> {
    return this.httpClient.post(`${this.baseUrl}/${artistId}`, work);
  }
}
