import { Component, OnInit } from '@angular/core';
import {Collection} from "../collection";
import {CollectionService} from "../collection.service";

@Component({
  selector: 'app-collection-list',
  templateUrl: './collection-list.component.html',
  styleUrls: ['./collection-list.component.css']
})
export class CollectionListComponent implements OnInit {

  collections: Collection[] | undefined;

  constructor(private collectionService: CollectionService) { }

  ngOnInit(): void {
    this.getCollections();
  }

  private getCollections() {
    this.collectionService.getCollectionList().subscribe(data => {
      this.collections = data;
    })
  }

}
