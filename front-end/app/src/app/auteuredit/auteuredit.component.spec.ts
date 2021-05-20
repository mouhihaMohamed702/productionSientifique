import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AuteureditComponent } from './auteuredit.component';

describe('AuteureditComponent', () => {
  let component: AuteureditComponent;
  let fixture: ComponentFixture<AuteureditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AuteureditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AuteureditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
