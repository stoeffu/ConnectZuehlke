import {NgModule} from '@angular/core';
import {EmployeeComponent} from './employee/employee.component';
import {CommonModule} from '@angular/common';
import {PersistencyService} from './persistency.service';
import {MatExpansionModule} from '@angular/material';
import {intersectionObserverPreset, LazyLoadImageModule} from 'ng-lazyload-image';
import {EmployeeService} from './employee.service';
import {EmployeeAccordionComponent} from './employee-accordion/employee-accordion.component';

@NgModule({
  declarations: [
    EmployeeComponent,
    EmployeeAccordionComponent
  ],
  imports: [
    CommonModule,
    MatExpansionModule,
    LazyLoadImageModule.forRoot({
      preset: intersectionObserverPreset
    }),
  ],
  exports: [
    EmployeeComponent,
    EmployeeAccordionComponent
  ],
  providers: [
    EmployeeService,
    PersistencyService
  ]
})
export class SharedModule {
}
