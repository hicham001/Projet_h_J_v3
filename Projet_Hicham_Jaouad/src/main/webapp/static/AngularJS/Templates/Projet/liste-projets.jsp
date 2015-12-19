<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel"> 
            <div class="x_title">
            <div class="col-md-6"><h2>List des Sujets</h2></div>
            <div class="col-md-3"></div>
            <div class="col-md-3"><a ng-click="pagecreate()" class="btn btn-primary btn-xl">
            <i class="fa fa-pencil"></i>Ajouter Nouveau Sujet </a>
           </div>
            <div class="clearfix"></div>
            </div>
<div class="generic-container" style="width: auto">
        <div class="panel panel-default">
            <table class="table table-hover">
                <thead>
                    <tr>
                       <th>Code Projet</th>
                        <th>Catégorie</th>
                        <th>Objectifs</th>
                        <th>Description</th>
                        <th>Mesure</th>
                        <th>Responsable de mesure</th>
                        <th>Poids</th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                     <tr ng-repeat="projet in projets">
                             <td><span ng-bind="projet.codeprojet"></span></td>
                              <td><span ng-bind="projet.categorie"></span></td>
                              <td><span ng-bind="projet.objectifs[0].intitule"></span></td>
                              <td><span ng-bind="projet.objectifs[0].descriptions[0].description"></span></td>
                              <td><span ng-bind="projet.objectifs[0].descriptions[0].mesure"></span></td>
                              <td><span ng-bind="projet.objectifs[0].descriptions[0].responsableMesure"></span></td>
                              <td><span ng-bind="projet.objectifs[0].descriptions[0].poids"></span></td>
                           <td><button type="button" class="btn btn-info" ng-click="detailsProjet(projet)">Info</button></td>  
                        <td><a class="btn btn-success custom-width" ng-click="prepareEdit(projet)">edit</a></td>
                        <td><a class="btn btn-danger custom-width" ng-click="deleteProjet(projet.codeprojet)" >delete</a></td>
                        
                    </tr>
                </tbody>
            </table>
        </div>
    </div></div></div></div>