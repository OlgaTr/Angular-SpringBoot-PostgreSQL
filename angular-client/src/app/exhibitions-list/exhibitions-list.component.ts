import { Component, OnInit } from '@angular/core';
import {Exhibition} from "../exhibition";
import {ExhibitionService} from "../exhibition.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-exhibitions-list',
  templateUrl: './exhibitions-list.component.html',
  styleUrls: ['./exhibitions-list.component.css']
})
export class ExhibitionsListComponent implements OnInit {

  exhibitions: Exhibition[] | undefined;

  constructor(private exhibitionService: ExhibitionService, private router: Router) { }

  ngOnInit(): void {
    this.exhibitionService.getExhibitions().subscribe(data => {
      this.exhibitions = data;
    })
  }

  delete(exhibitionId: number | undefined) {
    if (exhibitionId != null) {
      this.exhibitionService.deleteExhibitionById(exhibitionId).subscribe({
        next: value => console.log(value),
        error: err => console.error(err),
        complete: () => this.router.navigate(['exhibitions'])
      })
    }
  }
}
