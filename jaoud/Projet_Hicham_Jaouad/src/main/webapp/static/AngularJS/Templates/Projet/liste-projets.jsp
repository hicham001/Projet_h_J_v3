
            <div class="panel-heading"><span class="lead">Liste des Projet </span></div>
            <table border=2>
                <thead>
                    <tr>
                       <th>Code Projet</th>
                        <th>Catégorie</th>
                        <th>Objectifs</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody ng-repeat="projet in projets">
                     <tr ng-repeat=" objectif in projet.objectifs">
                             <td><span ng-bind="projet.codeprojet"></span></td>
                              <td><span ng-bind="projet.categorie"></span></td>
                              <td><span ng-bind="objectif.idObjectif"></span></td>
                              <td><button type="button" class="btn btn-info" ng-click="detailsProjet(projet)">Info</button></td>
                              <td><button type="button" class="btn btn-info" ng-click="detailsProjet(projet)">Edit</button></td>  
                        
                    </tr>
                </tbody>
            </table>
        <div class="well">
            <a ng-click="pagecreate()">Ajouter Nouveau Evaluateur</a>
        </div>
