'use strict';
 
GestionManager.factory('ManagerService', ['$http', '$q', function($http, $q){
 
    return {
         
            fetchAllManagers: function() {
                    return $http.get('Manager/')
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while fetching users');
                                        return $q.reject(errResponse);
                                    }
                            );
            },
           
            
            createManager: function(manager){
                    return $http.post('Manager/', manager)
                            .then(
                                    function(d){
                                        return d.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while creating collaborateur');
                                        return $q.reject(errResponse);
                                    }
                            );
            },
             
            updateManager: function(c){
                    return $http.put('Manager/', c)
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while updating user');
                                        return $q.reject(errResponse);
                                    }
                            );
            },
             
            deleteManager: function(matricule){
                    return $http['delete']('Manager/'+matricule,{params: {matricule: matricule}})
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while deleting user');
                                        return $q.reject(errResponse);
                                    }
                            );
            }
         
    };
 
}]);