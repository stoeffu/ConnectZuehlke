import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {PersonalDevelopmentComponent} from './personal-development.component';
import {PersistencyService} from '../shared/persistency.service';
import {PersonalDevelopmentService} from './personal-development.service';
import {MatListModule} from '@angular/material';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';
import {DevelopmentProposalComponent} from './development-proposal/development-proposal.component';
import {SharedModule} from '../shared/shared.module';
import {Observable, of} from 'rxjs';
import {DevelopmentProposal} from '../domain/DevelopmentProposal';
import {HttpClientModule} from '@angular/common/http';

class MockPersonalDevelopmentService extends PersonalDevelopmentService {
  public getDevelopmentProposal(code: string): Observable<DevelopmentProposal[]> {
    return of([]);
  }
}

describe('PersonalDevelopmentComponent', () => {
  let component: PersonalDevelopmentComponent;
  let fixture: ComponentFixture<PersonalDevelopmentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        NoopAnimationsModule,
        MatListModule,
        HttpClientModule,
        SharedModule
      ],
      declarations: [
        PersonalDevelopmentComponent,
        DevelopmentProposalComponent
      ],
      providers: [
        PersistencyService,
        {
          provide: PersonalDevelopmentService,
          useClass: MockPersonalDevelopmentService
        }
      ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonalDevelopmentComponent);
    component = fixture.componentInstance;
    component.developmentProposals = [
      {
        name: 'Angular',
        source: 'Interests',
        experts: [],
        interestedColleagues: []
      }
    ];
    fixture.detectChanges();
  });


  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
