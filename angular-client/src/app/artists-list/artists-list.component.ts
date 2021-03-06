import { Component, OnInit } from '@angular/core';
import { Artist } from "../artist";
import { ArtistService } from "../artist.service";
import  { Router } from "@angular/router";

@Component({
  selector: 'app-artists-list',
  templateUrl: './artists-list.component.html',
  styleUrls: ['./artists-list.component.css']
})
export class ArtistsListComponent implements OnInit {

  artists: Artist[] | undefined;

  constructor(private artistService: ArtistService, private router: Router) { }

  ngOnInit(): void {
    this.getArtists();
  }

  private getArtists() {
    this.artistService.getArtists().subscribe(data => {
      this.artists = data;
    })
  }

  deleteArtist(artistId: number | undefined) {
    if (artistId != null) {
      this.artistService.deleteArtistById(artistId).subscribe({
        next: value => console.log(value),
        error: err => console.error(err),
        complete: () => this.router.navigate(['/artists'])
      })
    }
  }
}
