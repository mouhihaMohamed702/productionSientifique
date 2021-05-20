import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PublicationeditComponent } from './publicationedit.component';

describe('PublicationeditComponent', () => {
  let component: PublicationeditComponent;
  let fixture: ComponentFixture<PublicationeditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PublicationeditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PublicationeditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
