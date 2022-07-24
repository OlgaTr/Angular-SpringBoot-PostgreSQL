import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExploreExhibitionComponent } from './explore-exhibition.component';

describe('ExploreExhibitionComponent', () => {
  let component: ExploreExhibitionComponent;
  let fixture: ComponentFixture<ExploreExhibitionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExploreExhibitionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExploreExhibitionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
