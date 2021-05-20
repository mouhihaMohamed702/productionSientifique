import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EquipelistComponent } from './equipelist.component';

describe('EquipelistComponent', () => {
  let component: EquipelistComponent;
  let fixture: ComponentFixture<EquipelistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EquipelistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EquipelistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
