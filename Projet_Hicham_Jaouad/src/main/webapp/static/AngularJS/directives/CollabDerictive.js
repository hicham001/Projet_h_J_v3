'use strict';
GestionCollaborateur.directive('ngDetailsc',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Collaborateur/detailsCollab.jsp'
	}
});

GestionCollaborateur.directive('ngAjouterc',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Collaborateur/Collab-creation.jsp'
	}
});

GestionCollaborateur.directive('ngUpdatec',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Collaborateur/edit.jsp'
	}
});
