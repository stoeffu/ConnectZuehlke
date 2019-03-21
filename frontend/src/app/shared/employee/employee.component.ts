import {Component, Input} from '@angular/core';
import {Colleague} from '../../domain/Colleague';

@Component({
  selector: 'app-employee-2',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.scss']
})
export class EmployeeComponent {

  @Input() employee: Colleague;

}
