import { Component, OnInit } from '@angular/core';
import {Exhibition} from "../exhibition";
import {ExhibitionService} from "../exhibition.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-exhibition',
  templateUrl: './add-exhibition.component.html',
  styleUrls: ['./add-exhibition.component.css']
})
export class AddExhibitionComponent implements OnInit {

  exhibition: Exhibition = new Exhibition();

  constructor(private exhibitionService: ExhibitionService, private router: Router) { }

  ngOnInit(): void {
  }

  onSubmit() {
    this.exhibitionService.createExhibition(this.exhibition).subscribe({
      next: value => console.log(value),
      error: err => console.error(err),
      complete: () => this.router.navigate(['exhibitions'])
    })
  }

}
