import { Component, OnInit } from '@angular/core';
import {Work} from "../work";
import {WorkService} from "../work.service";
import {ActivatedRoute, Router} from "@angular/router";
import {ExhibitionService} from "../exhibition.service";

@Component({
  selector: 'app-add-work-to-exhibition',
  templateUrl: './add-work-to-exhibition.component.html',
  styleUrls: ['./add-work-to-exhibition.component.css']
})
export class AddWorkToExhibitionComponent implements OnInit {

  works: Work[] =[];
  selectedWorks: Number[] = [];

  constructor(private workService: WorkService,
              private exhibitionService: ExhibitionService,
              private activatedRoute: ActivatedRoute,
              private router: Router) { }

  ngOnInit(): void {
      this.workService.getWorks().subscribe(data => {
      this.works = data;
    })
  }

  onChange(workId: number | undefined, isChecked: boolean) {
    if (isChecked) {
      console.log(this.selectedWorks.push(<Number>workId));
    } else {
      this.selectedWorks.slice(this.selectedWorks.indexOf(<Number>workId), 1);
    }
  }

  onSubmit() {
    const routeParams = this.activatedRoute.snapshot.paramMap;
    const exhibitionId = Number(routeParams.get('exhibitionId'));
    this.exhibitionService.addWorksToExhibition(exhibitionId, this.selectedWorks).subscribe({
      next: value => console.log(value),
      error: err => console.error(err),
      complete: () => this.router.navigate(['/exhibitions'])
    });
  }
}
