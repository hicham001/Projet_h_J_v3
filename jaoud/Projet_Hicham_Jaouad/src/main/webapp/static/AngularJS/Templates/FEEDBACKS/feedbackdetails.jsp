
<fieldset>
<legend><h3> Details de feedback : {{feedbackeedit.idFeedback}}</h3></legend>
<h4>matricule collaborateur : {{feedbackeedit.collaborateur.matricule}}</h4>
<h4>Nom & Pr�nom : {{feedbackeedit.collaborateur.nom}} {{feedbackeedit.collaborateur.prenom}}</h4>
<h4>code projet : {{feedbackeedit.projet.codeprojet}}</h4>
<h4>Date d�but de l'intervention : {{feedbackeedit.datedebut}}</h4>
<h4>Date Fin de l'intervention : {{feedbackeedit.datefin}}</h4>
<h4>R�le jou� au sein de l'equipe : {{feedbackeedit.rolejouer}}</h4>
<h4>Nombre de jour valoris� sur le projet : {{feedbackeedit.nbrJourValorise}} jours</h4>

<table border=2>
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

<br/>
<ul>
<li>Nbr de th�mes qualifi�s = {{feedbackeedit.nbrThemeqal}}</li>
<li>Total poids obtenu = {{feedbackeedit.totalPoids}}</li>
<li>Note globale = {{feedbackeedit.noteGlobale}}</li>

</ul>

</fieldset>
