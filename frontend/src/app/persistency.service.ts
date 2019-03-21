import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PersistencyService {

  constructor() { }

  setUsername(username: string) {
    console.log("username set: " + username);
  }

  getUsername(): string {
    return "mpe";
  }
}
