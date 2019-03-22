import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from '../domain/Employee';

@Injectable()
export class EmployeeService {

  constructor(private http: HttpClient) {
  }

  public getEmployee(code: string): Observable<Employee> {
    return this.http
      .get<Employee>(`/api/employee/${code}`);
  }

}
