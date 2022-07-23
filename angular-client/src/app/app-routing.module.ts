import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {WorksListComponent} from "./works-list/works-list.component";
import {AboutComponent} from "./about/about.component";
import {AddArtistComponent} from "./add-artist/add-artist.component";
import {AddWorkComponent} from "./add-work/add-work.component";
import {ArtistsListComponent} from "./artists-list/artists-list.component";
import {ExhibitionsListComponent} from "./exhibitions-list/exhibitions-list.component";
import {AddExhibitionComponent} from "./add-exhibition/add-exhibition.component";
import {AddWorkToExhibitionComponent} from "./add-work-to-exhibition/add-work-to-exhibition.component";

const routes: Routes = [
  // {path: 'about', component:AboutComponent},
  {path: 'works', component: WorksListComponent},
  {path: 'artists/add-artist', component: AddArtistComponent},
  {path: 'artists/add-work/:artistId', component: AddWorkComponent},
  {path: 'artists', component: ArtistsListComponent},
  {path: 'exhibitions', component: ExhibitionsListComponent},
  {path: 'exhibitions/add-exhibition', component: AddExhibitionComponent},
  {path: 'exhibitions/add-work/:exhibitionId', component: AddWorkToExhibitionComponent},
  // {path: '', redirectTo: 'about', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
