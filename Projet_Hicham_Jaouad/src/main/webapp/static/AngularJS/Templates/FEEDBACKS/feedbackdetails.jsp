<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
           
            <div class="x_panel">
           
            <div class="x_content">
            
<h3> Details de Feedback : {{feedbackeedit.idFeedback}}</h3>
            <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
            <div class="col-md-2"></div>
           <div class="col-md-10 col-sm-12 col-xs-12">
<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-5 control-lable" for="matricule">matricule collaborateur :</label>
                <div class="col-md-7">
                 {{feedbackeedit.collaborateur.matricule}}
                </div> 
         
                </div>
            </div>
            <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-5 control-lable" for="matricule">Nom & Prénom :</label>
                <div class="col-md-7">
                 {{feedbackeedit.collaborateur.nom}} {{feedbackeedit.collaborateur.prenom}}
                </div> 
         
                </div>
            </div>
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-5 control-lable" for="matricule">code projet :</label>
                <div class="col-md-7">
                 {{feedbackeedit.projet.codeprojet}}
                </div> 
         
                </div>
            </div>
               <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-5 control-lable" for="matricule">Date début de l'intervention :</label>
                <div class="col-md-7">
{{feedbackeedit.datedebut}}                </div> 
         
                </div>
            </div>
             <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-5 control-lable" for="matricule">Date Fin de l'intervention :</label>
                <div class="col-md-7" class="form-control">
{{feedbackeedit.datefin}} bla bla
           </div> 
         
                </div>
            </div>
            <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-5 control-lable" for="matricule">Rôle joué au sein de l'equipe :</label>
                <div class="col-md-7">
{{feedbackeedit.rolejouer}}
           </div> 
         
                </div>
            </div>
             <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-5 control-lable" for="matricule">Nombre de jour valorisé sur le projet :</label>
                <div class="col-md-7">
{{feedbackeedit.nbrJourValorise}} jours
           </div> 
         
                </div>
            </div></div>
            </form>
            <fieldset>
            <table class="table">
<thead>
<th>Qualification</th>
<th>Valeur</th>
<th>Remarque</th>
</thead>
<tbody ng-repeat="qualification in feedbackeedit.qualifications">
<tr>
<td>{{qualification.theme}}</td>
<td>{{qualification.valeur}}</td>
<td>{{qualification.remarque}}</td>
</tr>

</tbody>

</table>
<ul>
<li>Nbr de thèmes qualifiés = {{feedbackeedit.nbrThemeqal}}</li>
<li>Total poids obtenu = {{feedbackeedit.totalPoids}}</li>
<li>Note globale = {{feedbackeedit.noteGlobale}}</li>

</ul>
    <div class="row">
                                    <div class="col-md-3"></div>
                                    <div ng-init="feedbackeedit.noteGlobale = 2.9" class="col-md-7">
                                        <div ng-show="feedbackeedit.noteGlobale < 0.9 " class="progress">
                                            <div class="progress-bar progress-bar-danger" data-transitiongoal="25"
                                            aria-valuenow="25" style="width: 25%;">Critique</div>
                                        </div>
                                        <div ng-show=" feedbackeedit.noteGlobale  == 1 || feedbackeedit.noteGlobale <2 && 
                                        feedbackeedit.noteGlobale > 1 " class="progress">
                                            <div class="progress-bar progress-bar-warning" data-transitiongoal="45"
                                            aria-valuenow="45" style="width: 45%;">A développer</div>
                                        </div>
                                        <div ng-show=" feedbackeedit.noteGlobale == 2 || feedbackeedit.noteGlobale < 2.9 
                                       && feedbackeedit.noteGlobale > 2" class="progress">
                                            <div class="progress-bar progress-bar-info" data-transitiongoal="65"
                                            aria-valuenow="65" style="width: 65%;">Selon attente</div>
                                        </div>
                                        <div class="progress" ng-show="feedbackeedit.noteGlobale > 2.9 || feedbackeedit.noteGlobale == 2.9">
                                            <div class="progress-bar progress-bar-success" data-transitiongoal="95"
                                            aria-valuenow="95" style="width: 95%;">Démontre des forces</div>
                                        </div>
                                    </div>
                                </div>


<br/>

</fieldset>
</div></div></div></div>
