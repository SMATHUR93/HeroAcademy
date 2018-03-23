import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { LoginService } from '../_services/login.service';

@Component({
	selector: 'app-login',
	templateUrl: './login.component.html',
	styleUrls: ['./login.component.css'],
  //encapsulation: ViewEncapsulation.None
})
export class LoginComponent implements OnInit {

	model: any = {};
	loading = false;
	returnUrl: string;

	constructor(
		private route: ActivatedRoute,
		private router: Router,
		private loginService: LoginService) { }

	ngOnInit() {
		// reset login status
		this.loginService.logout();

        // get return url from route parameters or default to '/'
        this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';
    }

	/*login(username, password){
		this.loginService.login(username, password);
	}*/

	login() {
		this.loading = true;
		this.loginService.login(this.model.username, this.model.password)
		.subscribe(
			data => {
				this.router.navigate([this.returnUrl]);
			},
			error => {
				this.loading = false;
			});
	}

}
