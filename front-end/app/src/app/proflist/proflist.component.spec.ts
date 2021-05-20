import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProflistComponent } from './proflist.component';

describe('ProflistComponent', () => {
  let component: ProflistComponent;
  let fixture: ComponentFixture<ProflistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProflistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProflistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
