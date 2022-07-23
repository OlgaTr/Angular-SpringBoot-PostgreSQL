import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddWorkToExhibitionComponent } from './add-work-to-exhibition.component';

describe('AddWorkToExhibitionComponent', () => {
  let component: AddWorkToExhibitionComponent;
  let fixture: ComponentFixture<AddWorkToExhibitionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddWorkToExhibitionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddWorkToExhibitionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
