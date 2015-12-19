       Categorie : <select ng-model="projetEval.categorie"><option value="Pojet">Projet</option><option value="expertise">expertise</option><option value="autre">autre</option></select><br/>
       Projet : <input ng-model="projetEval.codeprojet"/>
        <button ng-click="ajouterEvaluateurp(projeteval)">Ajouter</button>
        
        <div ng-repeat="eval in projetEval.evaluateurs">
            <div>
                <select ng-model="eval.matricule"  ng-options="eval.matricule as (eval.nom+' '+eval.prenom+'  identifier par :'+eval.matricule) for eval in evaluateurs">
                    
                            </select>
                <button ng-click="supprimerEvaluateurp($index)">Supprimer</button>
            </div>
        </div>
        <button ng-click="addProjet()">Ajouter Projet</button>