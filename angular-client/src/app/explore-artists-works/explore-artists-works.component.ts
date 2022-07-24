import { Component, OnInit } from '@angular/core';
import {Work} from "../work";
import {WorkService} from "../work.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-explore-artists-works',
  templateUrl: './explore-artists-works.component.html',
  styleUrls: ['./explore-artists-works.component.css']
})
export class ExploreArtistsWorksComponent implements OnInit {

  works: Work[] | undefined;

  constructor(private workService: WorkService, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    const routeParams = this.activatedRoute.snapshot.paramMap;
    const artistId = Number(routeParams.get('artistId'));
    this.workService.getWorksByArtistId(artistId).subscribe(data => {
      this.works = data;
    })
  }

}
