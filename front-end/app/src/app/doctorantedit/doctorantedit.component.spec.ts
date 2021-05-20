import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctoranteditComponent } from './doctorantedit.component';

describe('DoctoranteditComponent', () => {
  let component: DoctoranteditComponent;
  let fixture: ComponentFixture<DoctoranteditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DoctoranteditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctoranteditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
