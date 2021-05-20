import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorantlistComponent } from './doctorantlist.component';

describe('DoctorantlistComponent', () => {
  let component: DoctorantlistComponent;
  let fixture: ComponentFixture<DoctorantlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DoctorantlistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctorantlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
