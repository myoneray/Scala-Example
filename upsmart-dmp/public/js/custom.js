$(function() {

     $("#city").on("click", "li a", function(event) {
            var cityName = event.target.id;
            $("#cityName").text(event.target.text);
            console.log("cityName",cityName);
        });
     $("#allNetCate").on("click", "li a", function(event) {
            var allNetCate = event.target.id;
            $("#cityName").text(event.target.text);
            console.log("allNetCateNames",allNetCate);
        });
function nullToEmpty(tmp) {
    if (tmp) {
        return tmp
    } else {
    return ""
    }
}

    function getValue() {
        var $gender = nullToEmpty($("input[name='gender']:checked").val());
        var $age =nullToEmpty( $("input[name='age']:checked").val());
        var $work = nullToEmpty($("input[name='work']:checked").val());
        var $marry = nullToEmpty($("input[name='marry']:checked").val());
        var $son = nullToEmpty($("input[name='son']:checked").val());
        var $student = nullToEmpty($("input[name='student']:checked").val());


        return {
            "gender" : $gender,
            "age" : $age,
            "employed" : $work,
            "married" : $marry,
            "has-children" : $son,
            "student" : $student
        };
    }

    $('#sendRequest')
            .click(
                    function() {
                        $.ajax({
                            cache : false,
                            async : false,
                            type : "POST",
                            data : getValue(),
                            dataType : "json",
                            url : "/query",
                            success : function(resData) {
                                console.log(resData);
                                consumablitystatJson = resData.consumablitystat;
                                locationstatJson = resData.locationstat;
                                consumestatJson=resData.consumestat;
                                totalCount = resData.tatal;
                            },
                            error : function(data) {
                                console.log('ERROR');
                            }
                        });
                        console.log("locationstatJson", locationstatJson);
                        console.debug("return total count: ", totalCount);

                        var echartMap = echarts.init(document
                                .getElementById('echartMap'), 'macarons');
                        var echartPie = echarts.init(document
                                .getElementById('echartPie'), 'macarons');

                        var     echartConsumecateMap = echarts.init(document
                                .getElementById('echartConsumecate'), 'macarons');
                        echartMapOption = {
                            title : {
                                text : '位置信息分析',
                                subtext : '总数据量：'+totalCount,
                                x : 'center'
                            },
                            tooltip : {
                                trigger : 'item'
                            },
                            dataRange : {
                                min : 0,
                                max : Math.floor(totalCount/2),
                                x : 'left',
                                y : 'bottom',
                                text : [ '高', '低' ], // 文本，默认为数值文本
                                calculable : true
                            },
                            toolbox : {
                                show : true,
                                orient : 'vertical',
                                x : 'right',
                                y : 'center',
                                feature : {
                                    mark : {
                                        show : true
                                    },
                                    dataView : {
                                        show : true,
                                        readOnly : false
                                    },
                                    restore : {
                                        show : true
                                    },
                                    saveAsImage : {
                                        show : true
                                    }
                                }
                            },
                            roamController : {
                                show : true,
                                x : 'right',
                                mapTypeControl : {
                                    'china' : true
                                }
                            },
                            series : [ {
                                name : '条件A',
                                type : 'map',
                                mapType : 'china',
                                roam : false,
                                itemStyle : {
                                    normal : {
                                        label : {
                                            show : true
                                        }
                                    },
                                    emphasis : {
                                        label : {
                                            show : true
                                        }
                                    }
                                },
                                data : locationstatJson
                            } ]
                        };
                    echartPieOption = {
                                title : {
                                    text: '银联客户消费能力',
                                    x:'center'
                                },
                                tooltip : {
                                    trigger: 'item',
                                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                                },
                                calculable : true,
                                series : [
                                    {
                                        name:'消费能力',
                                        type:'pie',
                                        radius : '55%',
                                        center: ['50%', '60%'],
                                        data:consumablitystatJson
                                    }
                                ]
                            };

                        echartPieConsumecateOption = {
                                title : {
                                    text: '银联客户消费类别',
                                    x:'center'
                                },
                                tooltip : {
                                    trigger: 'item',
                                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                                },
                                calculable : true,
                                series : [
                                    {
                                        name:'消费类别',
                                        type:'pie',
                                        radius : '55%',
                                        center: ['50%', '60%'],
                                        data:consumestatJson
                                    }
                                ]
                            };

                        echartConsumecateMap.setOption(echartPieConsumecateOption);
                        echartMap.setOption(echartMapOption);
                        echartPie.setOption(echartPieOption);

                    });

});
