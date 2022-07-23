import { Component, OnInit } from '@angular/core';
import {Exhibition} from "../exhibition";
import {ExhibitionService} from "../exhibition.service";

@Component({
  selector: 'app-exhibitions-list',
  templateUrl: './exhibitions-list.component.html',
  styleUrls: ['./exhibitions-list.component.css']
})
export class ExhibitionsListComponent implements OnInit {

  exhibitions: Exhibition[] | undefined;

  constructor(private exhibitionService: ExhibitionService) { }

  ngOnInit(): void {
    this.exhibitionService.getExhibitions().subscribe(data => {
      this.exhibitions = data;
    })
  }

}
