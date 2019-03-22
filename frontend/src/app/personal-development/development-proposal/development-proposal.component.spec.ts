import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {DevelopmentProposalComponent} from './development-proposal.component';
import {SharedModule} from '../../shared/shared.module';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';
import {MatListModule} from '@angular/material';

describe('DevelopmentProposalComponent', () => {
  let component: DevelopmentProposalComponent;
  let fixture: ComponentFixture<DevelopmentProposalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        SharedModule,
        NoopAnimationsModule,
        MatListModule
      ],
      declarations: [
        DevelopmentProposalComponent
      ],
      providers: []
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DevelopmentProposalComponent);
    component = fixture.componentInstance;
    component.developmentProposal = {
      name: 'Angular',
      source: 'Interests',
      experts: [
        {
          code: 'aaa',
          firstName: 'Alfred',
          lastName: 'Muster',
          mail: 'alfred.muster@email.com',
          mobilePhoneNumber: '-',
          businessPhoneNumber: '-'
        }
      ],
      interestedColleagues: [
        {
          code: 'bbb',
          firstName: 'Beato',
          lastName: 'Muster',
          mail: 'beato.muster@email.com',
          mobilePhoneNumber: '-',
          businessPhoneNumber: '-'
        },
        {
          code: 'ccc',
          firstName: 'Carlo',
          lastName: 'Muster',
          mail: 'carlo.muster@email.com',
          mobilePhoneNumber: '-',
          businessPhoneNumber: '-'
        }
      ]
    };
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
