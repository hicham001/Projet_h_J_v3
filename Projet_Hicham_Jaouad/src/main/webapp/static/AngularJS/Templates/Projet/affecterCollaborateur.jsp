
        <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <div class="x_title">
                                    <h2>Affectation des Objectifs et Evaluateurs au Collaborateur</h2>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">
                                <div id="wizard" class="form_wizard wizard_horizontal">
                                 <ul class="wizard_steps">
                                            <li>
                                                <a href="#" class="selected">
                                                    <span class="step_no">1</span>
                                                    <span class="step_descr">
                                            Etape 1<br />
                                            <small>Affectation des Objectifs</small>
                                        </span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" class="disabled" rel="2">
                                                    <span class="step_no">2</span>
                                                    <span class="step_descr">
                                            Etape 2<br />
                                            <small>Affectation des evaluateurs</small>
                                        </span>
                                                </a>
                                            </li> 
                                   </ul>
                                    <br />
                        
<form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
        <div class="form-group col-md-12">
        <label class="control-label col-md-3 col-sm-3 col-xs-12">Collaborateur : </span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
 			<select class="form-control" ng-model="collaborateur.matricule"  ng-options="collaborateur.matricule as (collaborateur.nom+' '+collaborateur.prenom+'  identifier par :'+collaborateur.matricule) for collaborateur in collaborateurs"> 
 			</select>
					</div>
<a ng-click="ajouterObjectifCollab()"><i class="fa fa-plus fa-lg"></i> Ajouter Objectif</a>
        </div>
        <div class="form-group col-md-12">
        <div class="col-md-12" ng-repeat="objectif in collaborateur.objectifsCollabs">
        <label class="control-label col-md-3 col-sm-3 col-xs-12">Intitule Objectif : </span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                <select  class="form-control" ng-model="objectif.idObjectif"  ng-change="initDescriptions(objectif.idObjectif,objectif)" ng-options="objectif.idObjectif as (objectif.intitule) for objectif in objectifs" ng-init="objectif.idObjectif=1000">
                            </select>
         <div class="col-md-12 col-sm-12 col-xs-12" ng-repeat="o in objectifs | filter : {idObjectif :objectif.idObjectif}" ng-init="projetFind(o.projet.codeprojet,objectif)">
        <div class="form-group">
        <label class="control-label col-md-4 col-sm-4 col-xs-12"> Code Projet :</label>
        <div class="col-md-6 col-sm-6 col-xs-12">
        <input class="form-control col-md-7 col-xs-12" type="text" ng-model="objectif.projet.codeprojet" disabled/>
        </div>
        	<label class="control-label col-md-4 col-sm-4 col-xs-12">Catégorie : </label>
        	<div class="col-md-6 col-sm-6 col-xs-12">
        	<input class="form-control col-md-7 col-xs-12" type="text" ng-model="objectif.projet.categorie" disabled/>
				</div>
          <div ng-repeat="desc in objectif.descriptions" >
          <label class="control-label col-md-4 col-sm-4 col-xs-12"> Description ID{{$index}}:</label>
           <div class="col-md-6 col-sm-6 col-xs-12">
           <input  class="form-control col-md-7 col-xs-12" type="text" ng-model="desc.id" ng-init="resulat.descriptionObj.id=desc.id" disabled/>
          </div>
          <label class="control-label col-md-4 col-sm-4 col-xs-12"> Poids {{$index}}: (%)</label>
          <div class="col-md-6 col-sm-6 col-xs-12">
          <input class="form-control col-md-7 col-xs-12" type="text" ng-model="desc.poids"/>{{resultatList.resultat.poids=desc.resultat.poids}}
          </div>
          </div>
          </div></div>
         </div>
          <a ng-click="supprimerObjectifCollab($index)"><i class="fa fa-times"></i>Retirer Objectif</a>
         </div>
            </div>
             <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-9">
                                                <button type="submit" class="btn btn-primary">Cancel</button>
                                                 <button type="submit" class="btn btn-success" ng-click="addRPL()">Valider</button>
                                                
                                            </div>
                                        </div>
         
         </form>
        
         </div></div></div></div></div>