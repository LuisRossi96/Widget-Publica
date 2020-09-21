<div id="HelloWorld_${instanceId}" class="super-widget wcm-widget-class fluig-style-guide"
     data-params="HelloWorld.instance({message: 'Hello world'})">

	<div class="panel panel-primary" >
		    
		    <div class="panel-heading">
		        <h3 class="panel-title">Processo Seletivo</h3>
		    </div>
		    
		    <div class="panel-body">
		        <div class="row">
		        	<div class="col-md-4">
		        		<label for="nome_${instanceId}">Nome</label>
		        		<input type="text" id="nome_${instanceId}" name="nome_${instanceId}" class="form-control" >
		        	</div>
		        	<div class="col-md-4">
		        		<label for="email_${instanceId}">Email</label>
		        		<input type="text" id="email_${instanceId}" name="email_${instanceId}" class="form-control" >
		        	</div>
		        </div>
		        
		        <div class="row">
		        	<div class="col-md-4">
		        		<label for="telefone_${instanceId}">Telefone</label>
		        		<input type="text" id="telefone_${instanceId}" name="telefone_${instanceId}" class="form-control" >
		        	</div>
		        	<div class="col-md-4">
		        		<label for="vaga_${instanceId}">Vaga</label>
		        		<input type="text" id="vaga_${instanceId}" name="vaga_${instanceId}" class="form-control" >
		        	</div>
		        </div>
		     	
				<div class="row">
			       	<div class="col-md-4">
			       		<label for="viewMatricula_${instanceId}">Matricula do Usuário</label>
			       		<input type="text" id="viewMatricula_${instanceId}" name="viewMatricula_${instanceId}" class="form-control" readonly value="${atividade!''}">
			       	</div>
			       	<div class="col-md-4">
			       		<label for="viewAtividade_${instanceId}">Atividade Destino</label>
			       		<input type="text" id="viewAtividade_${instanceId}" name="viewAtividade_${instanceId}" class="form-control" readonly value="${matricula!''}">
			       	</div>
				</div>
		        
		        <hr />
		        
			    <div class="row">
			    	<div>
			        	<button type="button" class="btn btn-success col-md-8" data-iniciar-processo>Iniciar Processo Seletivo</button>
			    	</div>
			    </div>
			    
		    </div>
		</div>
		
		<hr />
	 
	</div>

</div>
