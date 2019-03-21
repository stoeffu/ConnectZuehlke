import {NgModule} from '@angular/core';
import {EmployeeComponent} from './employee/employee.component';
import {CommonModule} from '@angular/common';

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
  providers: []
})
export class SharedModule {
}
