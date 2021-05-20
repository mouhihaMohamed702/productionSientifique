import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EtablissementeditComponent } from './etablissementedit.component';

describe('EtablissementeditComponent', () => {
  let component: EtablissementeditComponent;
  let fixture: ComponentFixture<EtablissementeditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EtablissementeditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EtablissementeditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
