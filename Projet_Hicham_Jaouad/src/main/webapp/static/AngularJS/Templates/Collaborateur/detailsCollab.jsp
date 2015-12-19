<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel"> 
         
            
            <div class="x_content">
            <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">Matricule :</label>
                <h4>{{ctrl.collaborateur.matricule}}</h4>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" >Nom :</label>
                <h4>{{ctrl.collaborateur.nom}}</h4>
            </div>
        </div>

 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" >Prénom :</label>
               <h4> {{ctrl.collaborateur.prenom}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">E-mail :</label>
                <h4>{{ctrl.collaborateur.email}}</h4>
            </div>
        </div>
 
 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Sexe :</label>
               <h4> {{ctrl.collaborateur.sexe}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Téléphone :</label>
               <h4> {{ctrl.collaborateur.telephone}}</h4>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Data d'embauche :</label>
               <h4> {{ctrl.collaborateur.dateEmbauche}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Date de naissance :</label>
                <h4>{{ctrl.collaborateur.dateDN}}</h4>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Adresse :</label>
               <h4>{{ctrl.collaborateur.adresse}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Pseudo :</label>
                <h4>{{ctrl.collaborateur.psseudo}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Password :</label>
                <h4>{{ctrl.collaborateur.password}}</h4>
            </div>
        </div>
       <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">Poste :</label>
               <h4> {{ctrl.collaborateur.poste.intitule}}</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="Manager">Manager :</label>
               <h4> {{ctrl.collaborateur.manager.nom + '  ' + ctrl.collaborateur.manager.nom+' dont la matricule est : '+ ctrl.collaborateur.manager.matricule}}</h4>
            </div>
        </div>

    </div>
    </div></div></div>