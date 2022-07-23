import { Component, OnInit } from '@angular/core';
import {Exhibition} from "../exhibition";
import {ExhibitionService} from "../exhibition.service";

@Component({
  selector: 'app-add-exhibition',
  templateUrl: './add-exhibition.component.html',
  styleUrls: ['./add-exhibition.component.css']
})
export class AddExhibitionComponent implements OnInit {

  exhibition: Exhibition = new Exhibition();

  constructor(private exhibitionService: ExhibitionService) { }

  ngOnInit(): void {
  }

  onSubmit() {
    this.exhibitionService.createExhibition(this.exhibition).subscribe({
      next: value => console.log(value),
      error: err => console.error(err)
    })
  }

}
