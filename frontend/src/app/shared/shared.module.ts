import {NgModule} from '@angular/core';
import {EmployeeComponent} from './employee/employee.component';
import {CommonModule} from '@angular/common';
import {PersistencyService} from './persistency.service';

@NgModule({
  declarations: [
    EmployeeComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    EmployeeComponent
  ],
  providers: [
    PersistencyService
  ]
})
export class SharedModule {
}
