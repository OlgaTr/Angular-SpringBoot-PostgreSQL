import { Injectable } from '@angular/core';
import {Artist} from "./artist";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ArtistService {

  private baseUrl = "http://localhost:8080/artists";

  constructor(private httpClient: HttpClient) { }

  addArtist(artist: Artist): Observable<Object> {
    return this.httpClient.post(`${this.baseUrl}`, artist);
  }

  getArtists(): Observable<Artist[]> {
    return this.httpClient.get<Artist[]>(`${this.baseUrl}`);
  }

  deleteArtistById(artistId: number): Observable<Object> {
    return this.httpClient.delete(`${this.baseUrl}/${artistId}`);
  }
}
