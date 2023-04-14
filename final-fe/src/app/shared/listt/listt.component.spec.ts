import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListtComponent } from './listt.component';

describe('ListtComponent', () => {
  let component: ListtComponent;
  let fixture: ComponentFixture<ListtComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListtComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
