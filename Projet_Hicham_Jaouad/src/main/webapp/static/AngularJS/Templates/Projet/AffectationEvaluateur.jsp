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
                                                <a href="#" isdone="1" class="selected" rel="1">
                                                    <span class="step_no">1</span>
                                                    <span class="step_descr">
                                            Etape 1<br />
                                            <small>Affectation des Objectifs</small>
                                        </span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" class="selected" rel="2">
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

										       <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Matricule collaborateur :</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                            
                                                <input type="text" ng-model="collaborateur1.matricule" class="form-control col-md-7 col-xs-12" disabled/>
                                            </div>
                                        </div>

<div ng-repeat="objectif in collaborateur1.objectifsCollabs" >
<fieldset>
<legend>List des evaluateurs par projet :</legend>
       <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Code Projet :</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                            
                                                <input type="text" ng-model="objectif.projet.codeprojet" class="form-control col-md-7 col-xs-12" disabled/>
                                            </div>
                                        </div>   
                                         <div class="form-group">
                                         <div ng-repeat="evaluateur in objectif.projet.evaluateurs" ng-init="affecter(objectif.projet.evaluateurs[$index])">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Evaluateur associé :</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                            
                                                <input type="text" ng-model="evaluateur.matricule" class="form-control col-md-7 col-xs-12" />
                                            </div>
                                        </div>
                                        <a  ng-click="deleteRows(objectif.projet,$index)" ng-show="objectif.projet.evaluateurs.length>1">
                                        <i class="fa fa-times"></i>Retirer evaluateur</a><br/>
                                        
   </div>
</fieldset>
</div>

<div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-9">
                                                <button type="submit" class="btn btn-primary">Cancel</button>
                                                 <button type="submit" class="btn btn-success"  ng-click="addCollabevaluateur()">Valider</button>
                                                
                                            </div>
                                        </div>
</form>
</div></div></div></div></div>