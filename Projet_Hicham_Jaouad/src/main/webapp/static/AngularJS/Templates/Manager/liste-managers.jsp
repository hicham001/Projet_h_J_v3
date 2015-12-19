<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel"> 
            <div class="x_title">
            <div class="col-md-6"><h2>List des Managers RH</h2></div>
            <div class="col-md-3"></div>
            <div class="col-md-3"><a data-toggle="modal" data-target="#myModal" ng-click="ctrl.pageCreation()" class="btn btn-primary btn-xl">
            <i class="fa fa-pencil"></i>Ajouter Nouveau Manager RH </a>
           </div>
            <div class="clearfix"></div>
            </div>
            
            <div class="x_content"><table class="table table-hover">
                <thead>
                    <tr>
                       <th>Matricule</th>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>E-mail</th>
                        <th>Sexe</th>
                        <th>Adresse</th>
                        <th>Téléphone</th>
                        <th>Date d'embauche</th>
                        <th>Photo</th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
               
                    <tr ng-repeat="manager in ctrl.managers">
                              <td><span ng-bind="manager.matricule"></span></td>
                              <td><span ng-bind="manager.nom"></span></td>
                              <td><span ng-bind="manager.prenom"></span></td>
                              <td><span ng-bind="manager.email"></span></td>
                              <td><span ng-bind="manager.sexe"></span></td>
                              <td><span ng-bind="manager.adresse"></span></td>
                              <td><span ng-bind="manager.telephone"></span></td>
                              <td><span ng-bind="manager.dateEmbauche"></span></td>
                              <td><img src="static/AngularJS/Templates/Collaborateur/images/user.png" alt="Collaborateur" width="40px"height="30px"/></td>
                           <td><button type="button" class="btn btn-info"  data-toggle="modal" data-target="#myModal1" ng-click="ctrl.detailsManager(manager)">Détail</button></td>  
                        <td><a class="btn btn-success custom-width" data-toggle="modal" data-target="#myModal2" ng-click="ctrl.prepareEdit(manager)">Editer</a></td>
                        <td><a class="btn btn-danger custom-width" data-toggle="modal" data-target="#myModal3" ng-click="ctrl.prepareEdit(manager)" >Supprimer</a></td>
                        
                    </tr>
                </tbody>
            </table>
      </div>
    </div></div></div>
     <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" ng-click="ctrl.reset()"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Manager Détails </h4>
      </div>
      <div class="modal-body">
       <ng-details></ng-details>
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
        <h4 class="modal-title" id="myModalLabel">Ajouter nouveau Manager</h4>
      </div>
      <div class="modal-body">
       <ng-ajouter></ng-ajouter>
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
        <h4 class="modal-title" id="myModalLabel">Modifier Manager {{ctrl.manager.nom}} </h4>
      </div>
      <div class="modal-body">
       <ng-update></ng-update>
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
       <h2>Voulez vous vraiment supprimer {{ ctrl.manager.matricule }} ? </h2>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal"  ng-click="ctrl.cancel()" >Annuler</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" ng-click="ctrl.remove(ctrl.manager.matricule)">Supprimer</button>
      </div>
    </div>
  </div>
</div>
    