'use strict';
 
GestionManager.controller('ManagerController', ['$scope', 'ManagerService','$location',function($scope,ManagerService,$location) {
          var self = this;
          self.managers = [];
          self.fetchAllManagers = function(){
        	  ManagerService.fetchAllManagers()
                  .then(
                               function(d) {
                                    self.managers = d;
                               },
                                function(errResponse){
                                    console.error('Error while fetching Currencies');
                                }
                       );
          };
          self.pageCreation = function(){
        	 // $location.path('/CreerManager');
        	  
          };
          self.createManager = function(manager){
        	  ManagerService.createManager(manager)
                      .then(
                      self.fetchAllManagers, 
                              function(errResponse){
                                   console.error('Error while creating User.');
                              } 
                  );
              //$location.path('/GestionManager');
          };
          self.cancel = function(){
        	  self.reset();
        	  $location.path('/GestionManager');
        	  
          };
          self.ajouter = function(){
        	  console.log('User creete with id ', self.manager.matricule);
        	  self.createManager(self.manager);
        	  self.reset();
        	//  $location.path('/GestionManager');
        	  
          };
          
         self.updateManager = function(manager){
        	 ManagerService.updateManager(manager)
                      .then(
                              self.fetchAllManagers, 
                              function(errResponse){
                                   console.error('Error while updating User.');
                              } 
                  );
          };
 
         self.deleteManager = function(matricule){
        	 ManagerService.deleteManager(matricule)
                      .then(
                    		  self.fetchAllManagers, 
                              function(errResponse){
                                   console.error('Error while deleting User.');
                              } 
                  );
          };
          
          self.editer = function(){
        	  console.log('id to be edited', self.manager.matricule);
        	  self.updateManager(self.manager);
        	  self.reset();
        	  //$location.path('/GestionManager');
          };            
          self.prepareEdit = function(manager){
        	  console.log('id to be edited', manager.matricule);
              self.manager = manager;
              //$location.path('/modifierManager');
          };
          self.detailsManager = function(manager){
        	  console.log('details de id', manager.matricule);
        	  self.manager = manager;
              //$location.path('/DetailsManager');
          };
          self.remove = function(matricule){
              console.log('id to be deleted', matricule);
              self.deleteManager(matricule);
          };
 
           
          self.reset = function(){
        	  self.manager = {};
          };
          self.fetchAllManagers();
      }]);