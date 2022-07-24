import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExploreArtistsWorksComponent } from './explore-artists-works.component';

describe('ExploreArtistsWorksComponent', () => {
  let component: ExploreArtistsWorksComponent;
  let fixture: ComponentFixture<ExploreArtistsWorksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExploreArtistsWorksComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExploreArtistsWorksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
