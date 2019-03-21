import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import {ProjectColleagues} from './domain/ProjectColleagues';
import {catchError} from 'rxjs/operators';

@Injectable()
export class ProjectColleaguesService {

  constructor(private http: HttpClient) {
  }

  public getProjectColleagues(code: string): Observable<ProjectColleagues> {

    return of(this.getMockProjectColleagues());
  }

  private getActualProjectColleagues(code: string) {
    return this.http
      .get<ProjectColleagues>(`/api/${code}/project-colleagues`)
      .pipe(catchError(this.handleError('getProjectColleagues', undefined)));
  }

  private getMockProjectColleagues() {
    return {
      projects: [
        {
          projectName: 'Das coole Projekt',
          colleagues: [
            {
              code: 'code-1',
              firstName: 'Hans',
              lastName: 'Muster',
              mail: 'hans@muster.ch',
              mobilePhoneNumber: 'telefon-1',
              businessPhoneNumber: 'telefon-2'
            },
            {
              code: 'code-2',
              firstName: 'Petra',
              lastName: 'Muster',
              mail: 'petra@muster.ch',
              mobilePhoneNumber: undefined,
              businessPhoneNumber: 'telefon-3'
            }
          ]
        }
      ]
    };
  }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  private log(s: string) {
    console.log(`${this}: ${s}`);
  }

}
