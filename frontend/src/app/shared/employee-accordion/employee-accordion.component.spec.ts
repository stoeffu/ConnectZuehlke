import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {EmployeeAccordionComponent} from './employee-accordion.component';
import {EmployeeComponent} from '../employee/employee.component';
import {MatExpansionModule} from '@angular/material';
import {LazyLoadImageModule} from 'ng-lazyload-image';

describe('EmployeeAccordionComponent', () => {
  let component: EmployeeAccordionComponent;
  let fixture: ComponentFixture<EmployeeAccordionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [EmployeeAccordionComponent, EmployeeComponent],
      imports: [MatExpansionModule, LazyLoadImageModule]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeAccordionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
