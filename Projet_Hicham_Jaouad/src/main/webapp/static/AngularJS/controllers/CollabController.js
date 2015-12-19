'use strict';
 
GestionCollaborateur.controller('CollabController', ['$scope', 'CollabService','$location',function($scope,CollabService,$location) {
          var self = this;
          self.collaborateurs=[];
          self.postes = [];
         //self.collaborateur ={};// {matricule:null,nom:'',prenom:'',email:'',sexe:'',telephone:'',dateEmbauche:'',dateDN:'',adresse:'',photo:'',psseudo:'',password:'',
//        		             poste:{idPost:null,intitule:''},
//        		             manager :{matricule:null,nom:'',prenom:'',email:'',sexe:'',telephone:'',dateEmbauche:'',dateDN:'',adresse:'',photo:'',psseudo:'',password:''}};
//          self.poste ={deleted:false,creationDate:null,modifiedDate:null,idPost:null,intitule:''};
//          self.manager = {deleted:false,creationDate:null,modifiedDate:null,matricule:null,nom:'',prenom:'',email:'',sexe:'',telephone:'',dateEmbauche:null,dateDN:null,adresse:null,photo:'',psseudo:'',password:null};
          self.managers = [];
          self.fetchAllCollabs = function(){
        	  CollabService.fetchAllCollabs()
                  .then(
                               function(d) {
                                    self.collaborateurs = d;
                               },
                                function(errResponse){
                                    console.error('Error while fetching Currencies');
                                }
                       );
          };
          
          self.fetchAllManagers = function(){
        	  CollabService.fetchAllManagers()
                  .then(
                               function(d) {
                                    self.managers = d;
                               },
                                function(errResponse){
                                    console.error('Error while fetching Currencies');
                                }
                       );
          };
          self.fetchAllPostes = function(){
        	  CollabService.fetchAllPostes()
                  .then(
                               function(d1) {
                                    self.postes = d1;
                               },
                                function(errResponse){
                                    console.error('Error while fetching Currencies');
                                }
                       );
          };
          
          
          self.pageCreation = function(){
        	  $location.path('/CreerCollab');
        	  
          };
          self.createCollab = function(collaborateur){
        	  CollabService.createCollab(collaborateur)
                      .then(
                      self.fetchAllCollabs, 
                              function(errResponse){
                                   console.error('Error while creating User.');
                              } 
                  );
              $location.path('/');
          };
          self.cancel = function(){
        	  self.reset();
        	  $location.path('/');
        	  
          };
          self.ajouter = function(){
        	  console.log('User creete with id ', self.collaborateur.matricule);
        	  self.createCollab(self.collaborateur);
        	  self.reset();
        	  $location.path('/');
        	  
          };
          
         self.updateCollab = function(collaborateur){
        	 CollabService.updateCollab(collaborateur)
                      .then(
                              self.fetchAllCollabs, 
                              function(errResponse){
                                   console.error('Error while updating User.');
                              } 
                  );
          };
 
         self.deleteCollab = function(matricule){
        	 CollabService.deleteCollab(matricule)
                      .then(
                    		  self.fetchAllCollabs, 
                              function(errResponse){
                                   console.error('Error while deleting User.');
                              } 
                  );
          };
          
          self.editer = function(){
        	  console.log('id to be edited', self.collaborateur.matricule);
        	  self.updateCollab(self.collaborateur);
        	  self.reset();
        	 // $location.path('/');
          };            
          self.prepareEdit = function(collaborateur){
        	  console.log('id to be edited', collaborateur.matricule);
//              for(var i = 0; i < self.collaborateurs.length; i++){
//                  if(self.collaborateurs[i].matricule == collaborateur.matricule) {
//                     self.collaborateur = angular.copy(self.collaborateurs[i]);
//                     break;
//                  }
//              }
              self.collaborateur = collaborateur;
             // $location.path('/modifierCollab');
          };
          self.detailsCollab = function(collaborateur){
        	  console.log('details de id', collaborateur.matricule);
        	  self.collaborateur = collaborateur;
             // $location.path('/DetailsCollab');
          };
               
          self.remove = function(matricule){
              console.log('id to be deleted', matricule);
              self.deleteCollab(matricule);
          };
 
           
          self.reset = function(){
        	  self.collaborateur = {};
          };
          self.fetchAllCollabs();
          self.fetchAllManagers();
          self.fetchAllPostes();
 
      }]);