import { Component, OnInit } from '@angular/core';
import {Work} from "../work";
import {WorkService} from "../work.service";

@Component({
  selector: 'app-works-list',
  templateUrl: './works-list.component.html',
  styleUrls: ['./works-list.component.css']
})
export class WorksListComponent implements OnInit {

  works: Work[] | undefined;

  constructor(private workService: WorkService) { }

  ngOnInit(): void {
    this.getWorks();
  }

  private getWorks() {
    this.workService.getCollectionList().subscribe(data => {
      this.works = data;
    })
  }
}
