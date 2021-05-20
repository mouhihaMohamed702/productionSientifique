import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EtablissementlistComponent } from './etablissementlist.component';

describe('EtablissementlistComponent', () => {
  let component: EtablissementlistComponent;
  let fixture: ComponentFixture<EtablissementlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EtablissementlistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EtablissementlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
