import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WorksListComponent } from './works-list/works-list.component';
import {HttpClientModule} from "@angular/common/http";
import { AboutComponent } from './about/about.component';
import { AddWorkComponent } from './add-work/add-work.component';
import { AddArtistComponent } from './add-artist/add-artist.component';
import { FormsModule } from "@angular/forms";
import { ArtistsListComponent } from './artists-list/artists-list.component';
import { ExhibitionsListComponent } from './exhibitions-list/exhibitions-list.component';
import { AddExhibitionComponent } from './add-exhibition/add-exhibition.component';
import { AddWorkToExhibitionComponent } from './add-work-to-exhibition/add-work-to-exhibition.component';
import { ExploreArtistsWorksComponent } from './explore-artists-works/explore-artists-works.component';
import { ExploreExhibitionComponent } from './explore-exhibition/explore-exhibition.component';

@NgModule({
  declarations: [
    AppComponent,
    WorksListComponent,
    AboutComponent,
    AddWorkComponent,
    AddArtistComponent,
    ArtistsListComponent,
    ExhibitionsListComponent,
    AddExhibitionComponent,
    AddWorkToExhibitionComponent,
    ExploreArtistsWorksComponent,
    ExploreExhibitionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
