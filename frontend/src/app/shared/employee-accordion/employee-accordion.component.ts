import {Component, Input} from '@angular/core';
import {Employee} from '../../domain/Employee';

@Component({
  selector: 'app-employee-accordion',
  templateUrl: './employee-accordion.component.html',
  styleUrls: ['./employee-accordion.component.scss']
})
export class EmployeeAccordionComponent {

  @Input() employees: Employee[];

}
