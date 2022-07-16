import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CollectionListComponent} from "./collection-list/collection-list.component";

const routes: Routes = [
  // {path: 'collections', component: CollectionListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
