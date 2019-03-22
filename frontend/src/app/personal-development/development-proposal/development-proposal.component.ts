import {Component, Input, OnInit} from '@angular/core';
import {DevelopmentProposal} from '../../domain/DevelopmentProposal';

@Component({
  selector: 'app-development-proposal',
  templateUrl: './development-proposal.component.html',
  styleUrls: ['./development-proposal.component.scss']
})
export class DevelopmentProposalComponent implements OnInit {

  @Input() developmentProposal: DevelopmentProposal;

  constructor() {
  }

  ngOnInit() {
  }

}
