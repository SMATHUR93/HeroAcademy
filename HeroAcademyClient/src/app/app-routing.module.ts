import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

//import { LoginComponent } from './login/login.component';
import { WelcomeScreenComponent } from './welcome-screen/welcome-screen.component';
import { DashboardComponent } from './dashboard/dashboard.component';

const routes: Routes = [
  { path: '', redirectTo: '/welcome', pathMatch: 'full' },
  { path: 'dashboard',  component: DashboardComponent },
  { path: 'welcome',     component: WelcomeScreenComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
