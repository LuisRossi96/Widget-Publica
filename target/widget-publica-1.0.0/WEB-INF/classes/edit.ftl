<div id="HelloWorld_${instanceId}" class="super-widget wcm-widget-class fluig-style-guide"
     data-params="HelloWorld.instance({message: 'Hello world'})">

    <!-- efetua a tradução do texto do objeto i18n -->	
    <h1>${i18n.getTranslation('hello.example.helloedit')}</h1>
	
	<hr />
	
	<div class="row">
       	<div class="col-md-4">
       		<label for="editMatricula_${instanceId}">Matricula do Usuário</label>
       		<input type="text" id="editMatricula_${instanceId}" name="editMatricula_${instanceId}" class="form-control" value="${atividade!''}">
       	</div>
       	<div class="col-md-4">
       		<label for="editAtividade_${instanceId}">Atividade Destino</label>
       		<input type="text" id="editAtividade_${instanceId}" name="editAtividade_${instanceId}" class="form-control" value="${matricula!''}">
       	</div>
	</div>
	
    <hr />
       
    <div class="row">
    	<div class="col-md-6">
        	<button type="button" class="btn btn-success" data-salvarParametros>Salvar</button>
    	</div>
    </div>
</div>
