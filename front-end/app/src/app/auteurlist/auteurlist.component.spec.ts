import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AuteurlistComponent } from './auteurlist.component';

describe('AuteurlistComponent', () => {
  let component: AuteurlistComponent;
  let fixture: ComponentFixture<AuteurlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AuteurlistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AuteurlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
