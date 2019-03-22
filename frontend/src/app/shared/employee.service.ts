import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Colleague} from '../domain/Colleague';

@Injectable()
export class EmployeeService {

  constructor(private http: HttpClient) {
  }

  public getEmployee(code: string): Observable<Colleague> {
    return this.http
      .get<Colleague>(`/api/employee/${code}`);
  }

}
