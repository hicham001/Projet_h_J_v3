Collaborateur : <select ng-model="collaborateur.matricule"  ng-options="collaborateur.matricule as (collaborateur.nom+' '+collaborateur.prenom+'  identifier par :'+collaborateur.matricule) for collaborateur in collaborateurs"> </select>
<button ng-click="ajouterObjectifCollab()">Ajouter</button>
        
        <div ng-repeat="objectif in collaborateur.objectifsCollabs">
            <div>
                <select ng-model="objectif.idObjectif"  ng-change="initDescriptions(objectif.idObjectif,objectif)" ng-options="objectif.idObjectif as (objectif.intitule) for objectif in objectifs" ng-init="objectif.idObjectif=1000">
                            </select>
         <div ng-repeat="o in objectifs | filter : {idObjectif :objectif.idObjectif}" ng-init="projetFind(o.projet.codeprojet,objectif)">
         <input type="text" ng-model="objectif.projet.codeprojet" disabled/><br/>
         <input type="text" ng-model="objectif.projet.categorie" disabled/>

<!--          <pre> -->
<!--          {{o | json}} -->
<!--          </pre> -->
          <div ng-repeat="desc in objectif.descriptions" >
          
         {{$index}} <input type="texet" ng-model="desc.poids"/>{{resultatList.resultat.poids=desc.resultat.poids}}
          <input type="texet" ng-model="resulat.collaborateur.matricule" ng-init="resulat.collaborateur.matricule=collaborateur.matricule"/>
           <input type="texet" ng-model="desc.id" ng-init="resulat.descriptionObj.id=desc.id"/>
          </div>
          </div>
         </div> 
         <button ng-click="supprimerObjectifCollab($index)">Supprimer objectif</button>
            </div>
        
         <button ng-click="addRPL()">AjouterList</button>
         </div>