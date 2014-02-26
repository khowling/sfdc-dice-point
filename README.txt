
Generate salesforce Java proxy classes from Enterprise WSDL & the salesforce WSC

Add the JAR to the project dependencies

then...

Generate Java from WSDL
* WSC project for SFDC WSDL *
java  -classpath target/force-wsc-30.0.0-uber.jar com.sforce.ws.tools.wsdlc -nc ewsdl.xml none.jar bin\src
cp bin\src to sfdc-dice-point\src

* this project for DISE WSDL *
wsimport -Xnocompile -s src -wsdllocation /wsdl/order/orderservice.wsdl  bin\wsdl\order\orderservice.wsdl 

* refrest project in eclipse to build class files, with 1.6 compatibility build settings on project *
cd bin
jar cvf ..\sfdc-dise-point.jar .
