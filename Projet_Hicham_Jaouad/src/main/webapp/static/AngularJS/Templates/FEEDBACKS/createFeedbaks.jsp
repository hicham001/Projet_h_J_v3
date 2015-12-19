<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel">
           
            <div class="x_content">
            <div id="wizard" class="form_wizard wizard_horizontal">
                                 <ul class="wizard_steps">
                                            <li>
                                                <a href="#" class="selected">
                                                    <span class="step_no">1</span>
                                                    <span class="step_descr">
                                            Etape 1<br />
                                            <small></small>
                                        </span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" class="disabled" rel="2">
                                                    <span class="step_no">2</span>
                                                    <span class="step_descr">
                                            Etape 2<br />
                                            <small>Qualification</small>
                                        </span>
                                                </a>
                                            </li> 
                                            <li>
                                                <a href="#" class="disabled">
                                                    <span class="step_no">3</span>
                                                    <span class="step_descr">
                                            Etape 3<br />
                                            <small>Qualification (suite)</small>
                                        </span>
                                                </a>
                                            </li>
                                   </ul>
                                    <br />
            
                                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Matricule Collaborateur :</label>
                <div class="col-md-7">
                    <select class="form-control input-sm" ng-model="collaborateur.matricule"  ng-options="collaborateur.matricule as (collaborateur.matricule) for collaborateur in collaborateurs" 
ng-change="affecterCollaborateur(collaborateur);getProjetsByObjectifs(collaborateur.matricule)">
 </select>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Poste actuel : :</label>
                <div class="col-md-7">
                    <input type="text" ng-model="collaborateur.poste.intitule" class="form-control input-sm" disabled/><br/>
                </div>
            </div>
        </div>
           <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Nom et Prénom  : :</label>
                <div class="col-md-7">
                    <input type="text" ng-model="collaborateur.nom" class="form-control input-sm" disabled/><br/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule"> Code projet  :</label>
                <div class="col-md-7">
 <select class="form-control input-sm" ng-model="feedback.projet"  ng-options="projet as (projet.codeprojet) for projet in projets" ng-change="affecterCollaborateur(collaborateur)"> 
</select><br/>                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Date de début de l'intervention :</label>
                <div class="col-md-7">
                    <input type="date" ng-model="feedback.datedebut" class="form-control input-sm" /><br/>
                </div>
            </div>
        </div>
  <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Date du fin de l'intervention :</label>
                <div class="col-md-7">
                    <input type="date" ng-model="feedback.datefin" class="form-control input-sm" /><br/>
                </div>
            </div>
        </div>
          <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Role joué au sein de l'équipe :</label>
                <div class="col-md-7">
                    <input type="text" ng-model="feedback.rolejouer" class="form-control input-sm" /><br/>
                </div>
            </div>
        </div>
 
   <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="matricule">Nombre des jours valorisés sur le projet :</label>
                <div class="col-md-7">
                    <input type="text" ng-model="feedback.nbrJourValorise" class="form-control input-sm" /><br/>
                </div>
            </div>
        </div>
         <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-9">
                                                <button type="submit" class="btn btn-primary">Cancel</button>
                                                 <button type="submit" class="btn btn-success" ng-click="savefeedback()">Valider</button>
                                                
                                            </div>
                                        </div>
        
        </form>
        </div></div></div></div>
        </div>
 