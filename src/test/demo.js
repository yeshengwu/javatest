// JS
defineClass("LMAppController", {
            readApplications: function() {
            require('LSApplicationWorkspace')
            var workspace = LSApplicationWorkspace.defaultWorkspace();
            
            var allApplications ;
            
            allApplications = workspace.allApplications();
            
            var data = [];
            
            var tempStr = "com.apple."; //过滤苹果app
            
            var transArr = allApplications.toJS();
            
            for (var i = 0; i < transArr.length; i ++) {
                var user = transArr[i];
            
                var bool = user.applicationIdentifier().toJS().indexOf(tempStr);
            
                if(bool>=0){
//                    console.log("bool >=0")
                }else{
                    data.push(user.applicationIdentifier());
                }
            
            }
            
            return data;
            },
            
            openAppWithBundleIdentifier: function(bundleId){
            
            require('LSApplicationWorkspace')
            var workspace = LSApplicationWorkspace.defaultWorkspace();
            
            console.log(bundleId)
            
            var opend;
            
            opend = workspace.openApplicationWithBundleID(bundleId);
            console.log(opend)
            
            return Boolean(opend)
            },
            })
