        <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                            
                                <div class="x_title">
                                    <h2>Ajouter nouveau Sujet BAP</h2>
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
                                            <small>Affecation des Evaluateurs</small>
                                        </span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" class="disabled">
                                                    <span class="step_no">2</span>
                                                    <span class="step_descr">
                                            Etape 2<br />
                                            <small>Ajout des Objectifs</small>
                                        </span>
                                                </a>
                                            </li> 
                                   </ul>
                                    <br />
                                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

										       <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Code Projet <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                            
                                                <input type="text" ng-model="projetEval.codeprojet" required="required" class="form-control col-md-7 col-xs-12">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Catégorie <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                            <select ng-model="projetEval.categorie" class="form-control">
                                           		   <option value="Pojet">Projet</option>
											       <option value="expertise">Expertise</option>
											       <option value="autre">autre</option></select>
                                             </div>
                                        </div><br>
           
          <div class="form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Evaluateurs <span class="required">*</span>
                                            </label>
                 <div class="col-md-6 col-sm-6 col-xs-12">
      <a ng-click="ajouterEvaluateurp(projeteval)"><i class="fa fa-plus fa-lg"></i> Affecter Evaluateur</a>
       										 
                 <div ng-repeat="eval in projetEval.evaluateurs">
          										  <div>
                <select ng-model="eval.matricule" class="form-control" ng-options="eval.matricule as (eval.nom+' '+eval.prenom+'  identifier par :'+eval.matricule) for eval in evaluateurs">
                            </select>
            </div>
                <a ng-click="supprimerEvaluateurp($index)"><i class="fa fa-times fa-lg"></i> Retirer</a>
        </div>
                                             </div>
                                        </div>
                                     
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-9">
                                                <button type="submit" class="btn btn-primary">Cancel</button>
                                                 <button type="submit" class="btn btn-success" ng-click="addProjet()">Ajouter Projet</button>
                                                
                                            </div>
                                        </div>

                                    </form>
                                </div>
                                </div>
                            </div>
                        </div>
                    </div>