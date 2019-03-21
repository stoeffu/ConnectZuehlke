import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {PersonalDevelopmentComponent} from './personal-development.component';
import {PersistencyService} from '../shared/persistency.service';
import {PersonalDevelopmentService} from './personal-development.service';
import {MatListModule} from '@angular/material';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';
import {HttpClient} from '@angular/common/http';

describe('PersonalDevelopmentComponent', () => {
  let component: PersonalDevelopmentComponent;
  let fixture: ComponentFixture<PersonalDevelopmentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        NoopAnimationsModule,
        MatListModule
      ],
      declarations: [
        PersonalDevelopmentComponent
      ],
      providers: [
        PersistencyService,
        PersonalDevelopmentService,
        {
          provide: HttpClient,
          useValue: {}
        }
      ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonalDevelopmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
