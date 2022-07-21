import { Component, OnInit } from '@angular/core';
import {Artist} from "../artist";
import {ArtistService} from "../artist.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-add-artist',
  templateUrl: './add-artist.component.html',
  styleUrls: ['./add-artist.component.css']
})
export class AddArtistComponent implements OnInit {

  artist: Artist = new Artist();
  constructor(private artistService: ArtistService) { }

  ngOnInit(): void {
  }

  onSubmit() {
    this.artistService.addArtist(this.artist).subscribe({
      next: (data) => console.log(data),
      error: (error) => console.log(error)
    });
  }
}
