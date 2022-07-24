import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ExhibitionService} from "../exhibition.service";
import {Work} from "../work";

@Component({
  selector: 'app-explore-exhibition',
  templateUrl: './explore-exhibition.component.html',
  styleUrls: ['./explore-exhibition.component.css']
})
export class ExploreExhibitionComponent implements OnInit {

  works: Work[] | undefined;
  exhibitionId: number | undefined;

  constructor(private exhibitionService: ExhibitionService, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    const routeParamas = this.activatedRoute.snapshot.paramMap;
    this.exhibitionId = Number(routeParamas.get('exhibitionId'));
    this.exhibitionService.getWorksByExhibitionId(this.exhibitionId).subscribe(data => {
      this.works = data;
    })
  }

}
