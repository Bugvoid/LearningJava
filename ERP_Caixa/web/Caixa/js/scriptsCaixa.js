
function popup_devolucao(){
    $("#popup").html("");
    var conteudo = "<div id='myModal' class='modal'> <div class='modal-content'> <span class='close' onClick='fecha_popup()'>&times;</span> <h3>Devolução</h3><div class='p-20'><p>Quantidade para devolução</p><div class='input-group mb-3'><input type='number' min='0' class='form-control' placeholder='Quantidade' aria-label='Username' aria-describedby='basic-addon1'></div><div class='clearfix'></div><hr class='mb-0'></div><div class='p-20'><button class='btn btn-danger' onClick='fecha_popup()'>CANCELAR</button><button class='btn btn-success float-right' onClick='fecha_popup()'>OK</button></div></div></div>";
    $("#popup").html(conteudo);
}

$(function(){
    $("#btnEfetuarPagamento").on("click", function(){
        popup_sucesso();    
    });
});
////Devolução
$(function(){
    $("#btnDevolver").on("click", function(){
        let devolver = false;
        if(devolver === true){
            popup_sucesso();    
        }else{
            popup_error();
        }
    });
});


$(function(){
    $("#btnRegistrarSangria").on("click", function(){
        let devolver = false;
        if(devolver === true){
            popup_sucesso();    
        }else{
            popup_error();
        }
    });
});


$(function(){
    $("#btnRegistrarSangria").on("click", function(){
        let devolver = false;
        if(devolver === true){
            popup_sucesso();    
        }else{
            popup_error();
        }
    });
});





