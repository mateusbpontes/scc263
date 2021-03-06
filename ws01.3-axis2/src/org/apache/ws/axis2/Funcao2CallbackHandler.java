
/**
 * Funcao2CallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package org.apache.ws.axis2;

    /**
     *  Funcao2CallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class Funcao2CallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public Funcao2CallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public Funcao2CallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for maiorPrimo method
            * override this method for handling normal response from maiorPrimo operation
            */
           public void receiveResultmaiorPrimo(
                    org.apache.ws.axis2.Funcao2Stub.MaiorPrimoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from maiorPrimo operation
           */
            public void receiveErrormaiorPrimo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cpuTest method
            * override this method for handling normal response from cpuTest operation
            */
           public void receiveResultcpuTest(
                    org.apache.ws.axis2.Funcao2Stub.CpuTestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cpuTest operation
           */
            public void receiveErrorcpuTest(java.lang.Exception e) {
            }
                


    }
    