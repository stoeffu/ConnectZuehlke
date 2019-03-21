import {TestBed} from '@angular/core/testing';

import {PersonalDevelopmentService} from './personal-development.service';
import {HttpClient} from '@angular/common/http';

describe('PersonalDevelopmentService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [],
      declarations: [],
      providers: [
        {
          provide: HttpClient,
          useValue: {}
        }
      ]
    })
      .compileComponents();
  });

  it('should be created', () => {
    const service: PersonalDevelopmentService = TestBed.get(PersonalDevelopmentService);
    expect(service).toBeTruthy();
  });
});
