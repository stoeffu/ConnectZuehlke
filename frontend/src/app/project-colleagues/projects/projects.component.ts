import {Component, Input} from '@angular/core';
import {Project} from '../../domain/Project';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html'
})
export class ProjectsComponent {

  @Input() project: Project;

}
