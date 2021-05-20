import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Etab2Component } from './etab2.component';

describe('Etab2Component', () => {
  let component: Etab2Component;
  let fixture: ComponentFixture<Etab2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Etab2Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Etab2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
