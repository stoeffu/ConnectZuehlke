import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import {DevelopmentProposal} from '../domain/DevelopmentProposal';
import {catchError} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PersonalDevelopmentService {

  constructor(private http: HttpClient) {
  }

  public getDevelopmentProposal(code: string): Observable<DevelopmentProposal[]> {
    return this.http
      .get<DevelopmentProposal>(`/api/personalDevelopment/${code}`)
      .pipe(catchError(this.handleError('getDevelopmentProposal', undefined)));
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
