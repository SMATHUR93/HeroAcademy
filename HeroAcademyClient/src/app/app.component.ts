import { Component } from '@angular/core';
import { LoginService } from './_services/login.service';
//import { BsModalRef, BsModalService } from 'ngx-bootstrap/modal';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{

  title = 'Hero Academy';

  public isLoggedIn: boolean = false;

  /*public modalRef: BsModalRef; // {1}
  constructor(private modalService: BsModalService) {} // {2}

  public openModal(template) {
    this.modalRef = this.modalService.show(template); // {3}
  }*/

  constructor(private loginService: LoginService) { }

  ngOnInit() {
    this.isLoggedIn = <boolean>this.checkLoginStatus();
  }

  checkLoginStatus(): Boolean{  	
  	return this.loginService.checkLoginStatus();
  }

}
