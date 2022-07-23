import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Exhibition} from "./exhibition";

@Injectable({
  providedIn: 'root'
})
export class ExhibitionService {

  private baseUrl = "http://localhost:8080/exhibitions"

  constructor(private httpClient: HttpClient) { }

  getExhibitions(): Observable<Exhibition[]> {
    return this.httpClient.get<Exhibition[]>(`${this.baseUrl}`);
  }

  createExhibition(exhibition: Exhibition): Observable<Object> {
    return this.httpClient.post(`${this.baseUrl}`, exhibition);
  }

  addWorksToExhibition(exhibitionId: number, worksId: Number[]): Observable<Object> {
    return this.httpClient.put(`${this.baseUrl}/${exhibitionId}`, worksId);
  }
}
