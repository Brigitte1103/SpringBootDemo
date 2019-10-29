$.ajax({
    url: '/err/getAjaxError',
    type: 'POST',
    async:false,
    success: function (res) {
        debugger;
        if (res.status === 200 && res.msg === 'ok'){
            alert('success')
        }else {
            alert('发生异常： ' + res.msg);
        }
    },
    error: function (response, ajaxOptions, thrownError) {
        debugger;
        alert('error')
    }
});