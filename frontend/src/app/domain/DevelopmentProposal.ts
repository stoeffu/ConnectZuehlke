import {Employee} from './Employee';

export interface DevelopmentProposal {

  name: string;
  source: string;
  experts: Employee[];
  interestedColleagues: Employee[];

}
