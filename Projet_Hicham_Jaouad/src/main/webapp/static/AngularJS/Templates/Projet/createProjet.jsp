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
                                                <a href="#" class="selected" >
                                                    <span class="step_no">1</span>
                                                    <span class="step_descr">
                                            Etape 1<br />
                                            <small>Affecation des <br>Evaluateurs</small>
                                        </span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" class="selected" rel="2">
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
<a ng-click="ajouterObjectif()"><i class="fa fa-plus fa-lg"></i> Ajouter Objectif</a>
        <div class="form-group">
        <div ng-repeat="objectif in objectifscreate">
            <fieldset>
            <legend>Objectif {{$index +1 }}</legend>
            <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Intitule objectif : </span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                            
                                                <input type="text" ng-model="objectif.intitule" class="form-control col-md-7 col-xs-12">
                                            </div>
                                        <div class="col-md-4"></div>
                                        <div class="col-md-8"><br>
                <a ng-click="ajouterDescription(objectif)"><i class="fa fa-plus"></i>Ajouter  Description</a><br/>
        <br>
                 <div ng-repeat="desc in objectif.descriptions">
            <fieldset>
                    <legend>Description {{$index +1 }}</legend>
                            <table>
                    <tr><td>
                description :</td><td> <input class="form-control" type="text" ng-model="desc.description"/></td></tr>
                <tr><td>mesure :</td><td> <input type="text" class="form-control" ng-model="desc.mesure"/></td></tr>
                <tr><td>respMesure : </td><td>
                <select  class="form-control" ng-model="desc.responsableMesure">
                <option value="responsable1">responsable1</option>
                <option value="responsable2">responsable2</option>
                <option value="responsable3">responsable3</option>
                <option value="responsable4">responsable4</option>
                            </select></td></tr>
                            </table>
                <a ng-click="supprimerDescription(objectif,$index)"><i class="fa fa-times"></i>Supprimer description</a><br/>

            </fieldset>
            </div>
            </div>
        </div>
</div>
        <a ng-click="supprimerObjectif($index)"><i class="fa fa-plus fa-fg"></i>Supprimer Objectif</a><br/>
        
        <br/><br/><br/>
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-9">
                                                <button type="submit" class="btn btn-primary">Cancel</button>
                                                 <button type="submit" class="btn btn-success" ng-click="addObjectifs()">Valider</button>
                                                
                                            </div>
                                        </div>

                                    </form>
                                </div></div></div>
                                </div></div>
                            