import {Component, OnInit} from '@angular/core';
import {PersistencyService} from '../shared/persistency.service';
import {ActivatedRoute, Router} from '@angular/router';
import {EmployeeService} from '../shared/employee.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  userCode: string;
  userName: string;
  returnUrl: string;

  constructor(
    private persistencyService: PersistencyService,
    private employeeService: EmployeeService,
    private router: Router,
    private activatedRoute: ActivatedRoute) {
  }

  ngOnInit() {
    this.activatedRoute.queryParams.subscribe(params => {
      this.returnUrl = params.returnUrl;
    });
  }

  login() {
    this.employeeService.getEmployee(this.userCode).subscribe(
      employee => {
        this.userName = employee.firstName + ' ' + employee.lastName;
      },
      () => {
        console.log('error');
      },
      () => {
        this.persistencyService.setUser(this.userCode, this.userName);
        this.redirect();
      }
    );

  }

  private redirect() {
    if (this.returnUrl) {
      this.goTo(this.returnUrl);
    } else {
      this.goTo('/');
    }
  }

  private goTo(url) {
    this.router.navigate([url]);
  }
}
