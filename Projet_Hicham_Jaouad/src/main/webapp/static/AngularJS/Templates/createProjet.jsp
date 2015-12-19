<button ng-click="ajouterObjectif()">Ajouter Objectif</button>
        
            
        <div ng-repeat="objectif in objectifscreate">
            <fieldset>
            <legend>Objectif {{$index +1 }}</legend>
            <div>
                
                Intitule objectif : <input type="text" ng-model="objectif.intitule"/>
                
                <button ng-click="ajouterDescription(objectif)">Ajouter  Description</button><br/>
        
                 <div ng-repeat="desc in objectif.descriptions">
            <fieldset>
                    <legend>Description {{$index +1 }}</legend>
            <div>
                <table>
                    <tr><td>
                description :</td><td> <input type="text" ng-model="desc.description"/></td></tr>
                <tr><td>mesure :</td><td> <input type="text" ng-model="desc.mesure"/></td></tr>
                <tr><td>respMesure : </td><td><select  ng-model="desc.responsableMesure">
                <option value="responsable1">responsable1</option>
                <option value="responsable2">responsable2</option>
                <option value="responsable3">responsable3</option>
                <option value="responsable4">responsable4</option>
                            </select></td></tr></table>
                  
                <button ng-click="supprimerDescription(objectif,$index)">Supprimer description</button><br/>

            </div>
            </fieldset>
        </div>

                
            </div>
            </fieldset>
        <button ng-click="supprimerObjectif($index)">Supprimer Objectif</button><br/>
        </div><br/><br/><br/>

        <button ng-click="addObjectifs()">Ajouter les objectifs</button>