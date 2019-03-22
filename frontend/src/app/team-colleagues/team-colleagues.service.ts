import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import {catchError} from 'rxjs/operators';
import {TeamColleagues} from '../domain/TeamColleagues';

@Injectable()
export class TeamColleaguesService {

  constructor(private http: HttpClient) {
  }

  public getTeamColleagues(employeeCode: string): Observable<TeamColleagues> {
    return this.http
      .get<TeamColleagues>(`/api/colleagues/${employeeCode}/team`)
      .pipe(catchError(this.handleError('getTeamColleagues', undefined)));
  }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      console.error(error);

      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  private log(s: string) {
    console.log(`${this}: ${s}`);
  }

}
