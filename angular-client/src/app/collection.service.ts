import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Collection} from "./collection";

@Injectable({
  providedIn: 'root'
})
export class CollectionService {

  private baseUrl = "http://localhost:8080/collections"

  constructor(private httpClient: HttpClient) { }

  getCollectionList(): Observable<Collection[]> {
    return this.httpClient.get<Collection[]>(`${this.baseUrl}`);
}
}
