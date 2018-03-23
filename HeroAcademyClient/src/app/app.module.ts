import { NgModule }       from '@angular/core';
import { BrowserModule }  from '@angular/platform-browser';
import { FormsModule }    from '@angular/forms';
import { HttpClientModule }    from '@angular/common/http';
import { CommonModule } from '@angular/common';

import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService }  from './in-memory-data.service';

import { AppRoutingModule }     from './app-routing.module';

// import { AppBootstrapModule } from './app-bootstrap.module';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { RegistrationComponent } from './registration/registration.component';
import { ProfileComponent } from './profile/profile.component';
import { VisualizationsComponent } from './visualizations/visualizations.component';
import { AppsComponent } from './apps/apps.component';
import { WelcomeScreenComponent } from './welcome-screen/welcome-screen.component';
import { MessagesComponent } from './messages/messages.component';

import { LoginService }          from './_services/login.service';
import { MessageService }       from './_services/message.service';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,

    CommonModule,
    // AppBootstrapModule,

    // The HttpClientInMemoryWebApiModule module intercepts HTTP requests
    // and returns simulated server responses.
    // Remove it when a real server is ready to receive requests.
    /*HttpClientInMemoryWebApiModule.forRoot(
      InMemoryDataService, { dataEncapsulation: false }
    )*/
  ],
  declarations: [
    AppComponent,
    LoginComponent,
    DashboardComponent,
    RegistrationComponent,
    ProfileComponent,
    VisualizationsComponent,
    AppsComponent,
    WelcomeScreenComponent,
    MessagesComponent
  ],
  providers: [ LoginService, MessageService ],
  bootstrap: [AppComponent]
})
export class AppModule { }