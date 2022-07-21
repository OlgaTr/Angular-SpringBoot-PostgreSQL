import { Component, OnInit } from '@angular/core';
import {Work} from "../work";
import {WorkService} from "../work.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-add-work',
  templateUrl: './add-work.component.html',
  styleUrls: ['./add-work.component.css']
})
export class AddWorkComponent implements OnInit {

  work: Work = new Work();
  // artistId: number | undefined;

  constructor(private workService: WorkService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
  }

  onSubmit() {
    const routeParams = this.route.snapshot.paramMap;
    const artistId = Number(routeParams.get('artistId'));
    console.log(artistId);
    this.workService.addWork(artistId, this.work).subscribe({
      next: (data) => console.log(data),
      error: (error) => console.error(error),
      complete: () => this.router.navigate(['/artists'])
    });
  }
}
