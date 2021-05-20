import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EquipeeditComponent } from './equipeedit.component';

describe('EquipeeditComponent', () => {
  let component: EquipeeditComponent;
  let fixture: ComponentFixture<EquipeeditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EquipeeditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EquipeeditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
