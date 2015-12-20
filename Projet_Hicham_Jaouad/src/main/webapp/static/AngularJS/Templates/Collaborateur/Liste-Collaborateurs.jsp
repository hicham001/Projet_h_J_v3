<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel"> 
            <div class="x_title">
            <div class="col-md-6"><h2>List des Collaborateurs</h2></div>
            <div class="col-md-3"></div>
            <div class="col-md-3"><a data-toggle="modal" data-target="#myModal" class="btn btn-primary btn-xl">
            <i class="fa fa-pencil"></i>Ajouter Nouveau Collaborateur </a>
           </div>
            <div class="clearfix"></div>
            </div>
            
            <div class="x_content">
            <table class="table table-hover">
                <thead>
                    <tr>
                       <th>Matricule</th>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>E-mail</th>
                        <th>Sexe</th>
                        <th>Adresse</th>
                        <th>Manager</th>
                        <th>Poste</th>
                        <th>Photo</th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
               
                    <tr ng-repeat="collaborateur in ctrl.collaborateurs">
                              <td><span ng-bind="collaborateur.matricule"></span></td>
                              <td><span ng-bind="collaborateur.nom"></span></td>
                              <td><span ng-bind="collaborateur.prenom"></span></td>
                              <td><span ng-bind="collaborateur.email"></span></td>
                              <td><span ng-bind="collaborateur.sexe"></span></td>
                              <td><span ng-bind="collaborateur.adresse"></span></td>
                              <td><span ng-bind="collaborateur.manager.matricule"></span></td>
                              <td><span ng-bind="collaborateur.poste.intitule"></span></td>
                              <td><img src="static/AngularJS/Templates/Collaborateur/images/user.png" alt="Collaborateur" width="40px"height="30px"/></td>
                           
                           <td><button type="button" class="btn btn-info" data-toggle="modal" title="Détails" data-target="#myModall" ng-click="ctrl.detailsCollab(collaborateur)">
                           <span class="glyphicon glyphicon-info-sign"></span></button></td>  
                           
                        <td><a class="btn btn-success custom-width" data-toggle="modal" data-target="#myModal2" title="Editer" ng-click="ctrl.prepareEdit(collaborateur)">
                        <span class="glyphicon glyphicon-edit"></span></a></td>
                        
                        <td><a class="btn btn-danger custom-width" title="Supprimer" data-toggle="modal" data-target="#myModal3" ng-click="ctrl.prepareEdit(collaborateur)" >
                        <span class="glyphicon glyphicon-remove"></span></a></td>
                        
                    </tr>
                </tbody>
            </table>
    </div></div>
    </div></div>
        
     <div class="modal fade" id="myModall" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" ng-click="ctrl.reset()"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Collaborateur Détails </h4>
      </div>
      <div class="modal-body">
       <ng-detailsc></ng-detailsc>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal" ng-click="ctrl.reset()">Close</button>
      </div>
    </div>
  </div>
</div>
 <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" ng-click="ctrl.reset()"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Ajouter nouveau Collaborateur</h4>
      </div>
      <div class="modal-body">
       <ng-ajouterc></ng-ajouterc>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal"  ng-click="ctrl.cancel()" >Annuler</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" ng-click="ctrl.ajouter()">Ajouter</button>
      </div>
    </div>
  </div>
</div>

<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" ng-click="ctrl.reset()"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modifier Collaborateur {{ctrl.collaborateur.nom}} </h4>
      </div>
      <div class="modal-body">
       <ng-updatec></ng-updatec>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal"  ng-click="ctrl.cancel()" >Annuler</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" ng-click="ctrl.editer()">Modifier</button>
      </div>
    </div>
  </div>
</div>
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" ng-click="ctrl.reset()"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Confirmer la suppression</h4>
      </div>
      <div class="modal-body">
       <h2>Voulez vous vraiment supprimer {{ ctrl.collaborateur.matricule }} ? </h2>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal"  ng-click="ctrl.cancel()" >Annuler</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" ng-click="ctrl.remove(ctrl.collaborateur.matricule)">Supprimer</button>
      </div>
    </div>
  </div>
</div>
    