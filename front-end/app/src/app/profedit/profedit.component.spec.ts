import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfeditComponent } from './profedit.component';

describe('ProfeditComponent', () => {
  let component: ProfeditComponent;
  let fixture: ComponentFixture<ProfeditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfeditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProfeditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
